public class problem_34 {
    public static int position(int nums[],int target){
        int start =-1;
        int end = -1;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] == target){
                start = i;
                return start;
            }
            if(nums[i] == target && nums[i+1] != target ){
                end = i;
                return end;
            }
        }
        return start;
        
    }
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        System.out.print(position(nums, 0));
    }

}
