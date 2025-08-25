package Two_d_array;

public class Sorted_search {
    public static boolean search(int arr[][], int key){
        // for the case of starting point is right top corner cell
//         int row = 0,column = arr[0].length -1;
// while(row < arr.length && column >=0){
//     if(arr[row][column]==key){
//         System.out.print("key found at " + row + ","+ column);
//         return true;
//     }
//     else if(arr[row][column]>key){
// column --;
//     }else{
//         row ++;
//     }
// }
// System.out.print("key not found");
// return false;

// case when we start the code from left bottom corner 
int row = arr.length -1,column = 0;
while(row >=0 && column <arr[0].length ){
    if(arr[row][column]==key){
        System.out.print("key found at " + row + ","+ column);
        return true;
    }
    else if(arr[row][column]>key){
row --;
    }else{
        column ++;
    }
}
System.out.print("key not found");
return false;
    }

    public static void main(String[] args) {
        int arr[][]= {{1, 2, 3}, 
        {5, 6, 7}, 
        {9, 10, 11}};
        int key = 1;
        search(arr, key);
    }
}
