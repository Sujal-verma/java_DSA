public class todays_prb {
    public static int findClosest(int x, int y, int z) {
         int person1 = 0;
         int person2 = 0;
    if (z>= x){
        person1 = z-x;
    }else{
person1 = x-z;
    }
    if(z>= y){
        person2 = z-y;
    }else{
        person2 = y-z;
    }
    if(person1 < person2){
return 1;
    }
    else if(person1 > person2){
        return 2;
    }
    return 0;
    }
    public static void main(String[] args) {
        int x=1,y=5,z=3;
        System.out.println(findClosest(x,y,z));
    }

}
