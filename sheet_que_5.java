public class sheet_que_5 {
    public static void main(String[] args) {
        int nums[] = {-1,-2,3,0,1,-1,5};
        int n= nums.length;
        for(int i = 0; i<n ;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1; k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        System.out.print(nums[i]+""+nums[j]+""+nums[k]);
                        System.out.print(" ");

                    }
                }
            }
        }
    }
}
