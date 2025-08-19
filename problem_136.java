import java.util.Arrays;

public class problem_136 {
    public static int single(int arr[]){
        for(int i = 0;i<arr.length-1;i+=2){
            
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int arr[] = {6,3,5,1,1,5,3};
        Arrays.sort(arr);
        System.out.println(single(arr));
    }
}
