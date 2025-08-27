package Two_d_array;
public class problem_3000 {
public static int area(int arr[][]){
    double max_dia = 0.000;
   
    int max_area = 0;
    for(int i = 0; i<arr.length;i++){
        int length = arr[i][0];
      int width =  arr[i][1];
double diagonal = Math.sqrt(length *length + width*width);
 int ar1 = length*width;
if(max_dia < diagonal){
    max_dia = diagonal;
    max_area = ar1;
}else if(max_dia == diagonal){
max_area = Math.max(ar1 , max_area);
}

    }
    return max_area;
}
public static void main(String[] args) {
    int arr[][]= {{5,6},{8,5}};
    System.out.print(area(arr));
}
    
}