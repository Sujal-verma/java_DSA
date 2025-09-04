package String;

public class problem_125{
    public static boolean palindrome(String str){
        if(str.length() == 0){
            return true;
        }
String s = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

int left = 0, right = s.length()-1;

while(left <=right){
    if(s.charAt(left) != s.charAt(right)){
        System.out.println("not a palindrome");
        return false;
    }
    left++;
    right--;
}
System.out.println("yes it is palindrome");
return true;
    }
    public static void main(String[] args) {
         String str = "A man, a plan, a canal: Panama  ";
         System.out.println( palindrome(str));
    }
}