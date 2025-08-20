public class problem_238 {
    public static int[]  pro(int nums[]){
        int answer[] = new int[nums.length];
        answer [0] = 1;

for(int i = 1;i<nums.length;i++){
    answer[i] = answer[i-1] * nums[i-1];
}
  int suffex = 1;
for(int i = nums.length-1; i>=0;i--){
answer[i] = answer[i]*suffex;
suffex *= nums[i];
}
 return answer;

    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        
        System.out.print(pro(nums));
    }

}
