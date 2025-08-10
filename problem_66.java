public class problem_66{
    public static void plus_one(int nums[]){
        System.out.print("(");
for(int i = 0; i<nums.length;i++){
    if (i==(nums.length -1)) {
        System.out.print(nums[i] +1);
        System.out.print(")");
    } else {
        System.out.print(nums[i] + ",");
    }
}
    }
    public static void main(String[] args) {
        int nums[]= {9};
        plus_one(nums);
    }
}