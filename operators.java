package bit_manipulation;

public class operators {

    // question check odd and even number 
    public static void oddOrEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number ");
        }
    }
    public static void main(String[] args) {
        oddOrEven(25);
        oddOrEven(12);
    }
}
