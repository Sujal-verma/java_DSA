package Two_d_array;

public class problem_2022 {
    public static void prnt(int arr[],int m,int n){
        
        int mat[][]= new int[m][n];
        int x =0;
        for(int i = 0; i<m;i++){
        for(int j = 0;j<n;j++){
            mat[i][j]= arr[x];
            System.out.print(mat[i][j] + " ");
            x++;
        }
        System.out.println();
    }

    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4};
        int m =2,n=2;
        prnt(arr, m, n);
    }
}
