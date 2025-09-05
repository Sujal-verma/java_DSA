package String;

public class problem_28{
public static int strstr(String haystack , String needle){
    for(int i = 0; i<haystack.length();i++){
        for(int j = needle.length()-1; j<haystack.length();j++){
            if(needle.equals(haystack.substring(i,j+1)) ){
                return i;
                
            }
        }
    }
    return -1;
}
public static void main(String[] args) {
    String hayString = "sadasghsad";
    String needle = "asgh";
    System.out.println(strstr(hayString, needle));
}
}