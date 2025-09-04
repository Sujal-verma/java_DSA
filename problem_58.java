package String;

public class problem_58{
public static int str_l(String s){
int length = 1;
        for(int i= s.length() -1;i>=0; i-- ){
            if(s.charAt(i)==' '){
                continue;
            }
            if(s.charAt(i-1)==' '){
                break;
            }else{
                length++;
            }
        }
        return length;
}
public static void main(String[] args) {
    String s = " hi my name is sujal verma ";
    System.out.println(str_l(s));
}
}