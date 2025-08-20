import java.util.*;
public class problem_4 {
    public static double median(int num1[], int num2[],int m, int n){
        int merged[] = new int [m+n];
        for(int  i = 0; i<m; i++){
            merged [i]= num1[i];
        }
        for(int i =0;i<n;i++){
            merged  [num1.length +i] = num2[i]   ;   
         }

        Arrays.sort(merged);
        double median= 0;
        
            if(merged.length %2 == 0) {
 median =(merged [(merged.length /2) -1 ] + merged[(merged.length/2) ] ) / 2;
            }else{
                median = merged[((merged.length +1) /2) -1];
            }
        
        return median;
    }
    public static void main(String[] args) {
        int num1[] = {1,2};
        int num2[] = {3,4,5,6};
        int m = num1.length;
        int n = num2.length;
        System.out.print(median(num1, num2, m, n));
    }
}
