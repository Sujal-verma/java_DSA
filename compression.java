package String;

public class compression {
    public static void string_compression(String str){

        //  time complexity of this code is  O(n)
        
        StringBuilder sv = new StringBuilder("");
        for(int i = 0; i<str.length();i++){
            int num = 1;
            char ch = str.charAt(i);
            
            while(i +1  < str.length() && ch == str.charAt(i+1) ){
                num ++;
                i++; 
            }
            sv.append(ch);
            if(num >1){
sv.append(num);
            }
                
                
            }
            
        
        System.out.println(sv);
    }
    public static void main(String[] args) {
        String str = "abbcdd";
string_compression(str);
    }
}
