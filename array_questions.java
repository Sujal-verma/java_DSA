public class array_questions {
    
    // stocks problem 
    public static void stocks(int prices[]){
        int buy = Integer.MAX_VALUE;
        int maxprofit= 0;
        for(int i = 0; i<prices.length;i++){
            if (buy < prices[i] ) {
                int profit = prices[i] - buy;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buy = prices[i];
            }
        }
        System.out.println(maxprofit);
    }

    // trapping rainwater 

    public static void trapwater(int height[] ){
int n = height.length;
//  for leftmax

int leftmax[]= new int[n];
leftmax[0]= height[0];
for(int i = 1; i<n;i++){
    leftmax[i]= Math.max(height[i], leftmax[i-1]);
}

// for right max

int rightmax[]= new int[n];
rightmax[n-1]= height[n-1];
for(int i = n-2; i>=0;i--){
    rightmax[i]= Math.max(height[i], rightmax[i+1]);
}

// total trapped water
int watertrapped= 0;
for(int i = 0;i<n;i++){
    int waterlevel= Math.min(leftmax[i],rightmax[i]);
    watertrapped +=  waterlevel - height[i];
}
System.out.println(watertrapped);
    }

    public static void duplicate(int nums[]){
        System.out.print(nums[0]);
        int count = 1;
        for(int i = 1;i<nums.length;i++ ){
            
            if(nums[i]!=nums[i-1]){
                System.out.print(nums[i]);
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
        
    
      
    }
    public static void remove_element(int nums[], int var){
        int n = nums.length;
        int j=0;
        for(int i = 0; i<nums.length;i++){
if(nums[i]==var){
    j++;
}else{
    nums[j]= nums[i];
    System.out.print(nums[j]);
}
        }
        System.out.println();
        System.out.println((n - j));
    }


    public static int insert(int nums[], int target){

        int j = 0;
        if(nums[0]==target){
            return j;
        }

        for(int i = 1; i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target>nums[j]){
                ;
            }
        }
    }
public static void main(String[] arg){
    int nums[] = {1,2,3,1,2,1,1,5,4,6,1,8,1,5};
    int var = 1;
remove_element(nums,var);

}
}

