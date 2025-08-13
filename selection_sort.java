package sorting;

public class selection_sort {
    public static void sort(int arr[]){
        
        for(int i = 0; i <arr.length-1;i++){
            int min_no=i;
            for(int j= i+1;j<arr.length;j++){
                if(arr[min_no]<arr[j]){
                    min_no= j;
                }
            }
            // swaping 
            int temp = arr[min_no];
            arr[min_no]=arr[i];
            arr[i]= temp;
        }
    }
    public static void sorted(int arr[]){
for(int i = 0; i<arr.length;i++){
    System.out.print(arr[i]+ " ");
}
    }
    public static void main(String[] args) {
        int arr[] = {2,5,3,1,4};
        sort(arr);
        sorted(arr);

    }
}
