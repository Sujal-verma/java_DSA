import java.util.Arrays;

public class problem_169 {
    public static int majority(int nums[]){
        int n = 1;
        for(int i = 1;i<nums.length;i++){
            
            if(nums[i]==nums[i-1]){
                n++;

            }else{
                n= 1;
            }
            if(n>(nums.length/2)){
return nums[i];
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,1,2,3,4,2,2,2};
        Arrays.sort(nums);
        System.out.println(majority(nums));
    }
}
