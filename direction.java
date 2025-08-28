package String;

public class direction {
    public static float findshortestpath(String path){
        int x= 0, y =0;
        for(int i= 0; i<path.length(); i++){
            char disha = path.charAt(i);
            if(disha == 'S'){
                y--;
            }else if(disha == 'W'){
                x--;
            }else if(disha == 'N'){
                y++;
            }else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
         String path = "WNEENNN";
         System.out.print(findshortestpath(path));
    }
}
