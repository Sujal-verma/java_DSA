package String;

public class problem_443 {
    public static void compress(char[] chars) {
        StringBuilder s = new StringBuilder("");
        for(int i = 0; i<chars.length;i++){
           
            int num = 1;
            
             while(i+1 < chars.length && chars[i]==chars[i+1]){
             i++;
              num++;
              
             }
             s.append(chars[i]);
             if(num> 1){
                s.append(num);
             }

        }
        System.out.println(s);
        chars = new char[s.length()];
        for(int i = 0; i<s.length();i++){
            
            System.out.print(chars[i]= s.charAt(i));
        }
        System.out.println();
        System.out.println( chars.length);
    }
    public static void main(String[] args) {
        char chars[]= {'a','a','c','c'};
        compress(chars);
    }
}
