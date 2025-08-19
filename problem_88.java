import java.util.*;
 public class problem_88 {
    public static void merge(int num1[] , int num2[],int m, int n){
    
    int num3[] = new int[m+n];
    int j = 0;
    for(int i = 0; i<(m+n);i++){
         if(i<m){
            num3[i]= num1[i];
         }else{
            num3[i]=num2[j];
            j++;
         }

    }
    Arrays.sort(num3);
for(int i =0; i<(m+n);i++){
    System.out.print(num3[i]);
}
    
    //for{}
    }
    public static void main(String[] args) {
        int num1[]= {1,2,3};
        int num2[]= {2,3,4};
        int m= num1.length;
        int n= num2.length;
        merge(num1, num2, m, n);
    }
}
