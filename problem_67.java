package String;

public class problem_67 {
    public static void  conversion(String a , String b){
         int decimal_a = 0;
         int decimal_b = 0;
         StringBuilder f = new StringBuilder();
         int pow_a= 0; 
    for(int i = a.length()-1; i>=0;i--){
        
       decimal_a += (a.charAt(i)-'0')*Math.pow(2, pow_a);
       pow_a++;
    }
    int pow_b = 0;
    for(int i = b.length()-1; i>=0;i--){
        
       decimal_b += (b.charAt(i)-'0')*Math.pow(2, pow_b);
       pow_b++;
    }
int final_decimal = decimal_a + decimal_b;
if(final_decimal == 0){
f.append("0");
}else{

while (final_decimal>0){
    int rem = final_decimal % 2;
   
    f.append(rem);
    final_decimal /= 2;
}
f.reverse();
}

System.out.println(f);
    }
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        conversion(a, b);
    }
}
