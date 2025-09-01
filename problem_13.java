package String;

public class problem_13 {
    public static void convert(String str){
        int sum = 0; 
        for(int  i = 0; i<str.length();i++){
            int value = 0;
            switch (str.charAt(i)) {
                case 'I':
                    value= 1;
                    break;

                    case 'V':
                    value= 5;
                    break;
                    case 'X':
                    value= 10;
                    break;
                    
                    case 'L':
                    value= 50;
                    break;
                    case 'C':
                    value = 100;
                    break;
                    case 'D':
                    value= 500;
                    break;
                    case 'M':
                    value = 1000;
                    break;
 
                    
            default:
            break;
                
            }
            if(i+1 < str.length()){
                int nextvalue = 0;
            switch (str.charAt(i+1)) {
                case 'I':
                    nextvalue =  1;
                    break;

                    case 'V':
                    nextvalue= 5;
                    break;
                    case 'X':
                    nextvalue = 10;
                    break;
                    
                    case 'L':
                    nextvalue = 50;
                    break;
                    case 'C':
                    nextvalue = 100;
                    break;
                    case 'D':
                    nextvalue = 500;
                    break;
                    case 'M':
                    nextvalue = 1000;
                    break;

                    
            default:
            break;
                
            }
            if(value<nextvalue){
                sum-= value;
                continue;
            }
            }
            sum+= value;

            
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        String str = "MCMXCIV";
        convert(str);
    }

}
