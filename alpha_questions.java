package Two_d_array;

public class alpha_questions {
    // question no 1 
    public static int print_no(int arr[][] , int key){
int  no = 0;
        for(int  i = 0; i<arr.length ;i++){
        for(int j= 0;j<arr[0].length;j++){
            if(arr[i][j]==key){
          no++;
            }
            
        }
        
    }
    return no;
    }

    //  question 2.
    public static int sum(int arr[][]){
        if(arr.length <2){
            return -1;
        }
        int total_sum = 0;
        for(int  i = 0; i<arr.length ;i++){
        for(int j= 0;j<arr[0].length;j++){
            if(i ==1){
          total_sum += arr[i][j];
            }
            
        }
        
    }
    return total_sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,7},
        {4,7,6},
    {5,9,7}};
        int key = 7;
        System.out.println(sum(arr));
    }
}
