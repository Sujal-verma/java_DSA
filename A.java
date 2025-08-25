package Two_d_array;

import java.util.*;

public class A {
    

public static boolean search(int matrix[][], int target){
        for(int  i = 0; i<matrix.length;i++){
             for(int j= 0;j<matrix[0].length;j++){
             if(matrix[i][j]== target){
                System.out.print(i+" "+ j);
                return true;
    
}
        }
        
    }
    System.out.println("not found");
    return false;
    
    }
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    int matrix[][] = new int[3][3];
    int row = matrix.length;
    int column = matrix[0].length;
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for(int  i = 0; i<row;i++){
        for(int j= 0;j<column;j++){
matrix[i][j]=sc.nextInt();
largest = Math.max(matrix[i][j], largest);
smallest = Math.min(matrix[i][j],smallest);
        }
    }
    
   int target = 5;
   for(int  i = 0; i<row;i++){
        for(int j= 0;j<column;j++){
           System.out.print(matrix[i][j]);

            
        }
        System.out.println();
    }
    System.out.println("largest :" + largest );
System.out.println("smallest :" + smallest );

}
    
}

    




