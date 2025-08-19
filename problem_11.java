public class problem_11 {
    public static int maxArea(int[] height) {
        int trapped_watr = 0;
        int left  = 0;
        int right = height.length -1;
       while(left<right){

    int water = Math.min(height[left],height[ right]);
    int length = right -left;
    int max_water = water* length;
     trapped_watr =  Math.max(max_water,trapped_watr) ;
if(height[left] <height[right]){
    left++;
}else{
    right--;
}

        }
        return trapped_watr;
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
      System.out.println(maxArea(height));
        
    }
}
