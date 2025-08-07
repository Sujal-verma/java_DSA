public class problem_35{
    public static int insert_position(int nums[],int target){
        int count = 0;
        for(int i = 0; i<nums.length;i++){
if(nums[i]>target){
    return i;
}
if(nums[i]==target){
    return i;
}
count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int  nums[] = {1,2,4,5,6};
        int target = 3;
       System.out.println(insert_position(nums, target)); 
    }
}