package String;

public class palindrome {
    public static boolean ispalindrome(String word){
int left = 0;
int right = word.length()-1;
        while(left <= right){
            if(word.charAt(left)!= word.charAt(right)){
                System.out.println("not a palindrome");
                return false;
            }
                left ++;
                right --;
            
        }
       System.out.println("yes it is");
        return true;
    }
    public static void main(String[] args) {
        String word = "racecar";
        System.out.println(ispalindrome(word));
        
    }
}
