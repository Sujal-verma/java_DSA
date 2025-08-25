package Two_d_array;

public class problem_1572 {
    public static void diagonal(int matrix[][]){
int sum = 0;
        for(int i = 0; i<matrix.length;i++){
            sum += matrix[i][i];
            if(i!=matrix.length -1 -i){
                sum += matrix[i][matrix.length -1 -i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int mat[][]={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        diagonal(mat);
    }
}
