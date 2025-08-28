package String;

public class string {
    public static void search(String fullname ){
        for(int i =0 ; i<fullname.length(); i++){
            System.out.print(fullname.charAt(i)+ " ");
        }
    }
    public static void main(String[] args) {
        
   
    String firstname = "sujal";
    String lastname  = "verma";
    String fullname = firstname + " " +lastname;
    System.out.println(fullname.charAt(0));
    search(fullname);
}
 }