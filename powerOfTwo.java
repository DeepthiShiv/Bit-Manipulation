public class powerOfTwo {
    public static boolean powerTwo(int n){
        return (n& (n-1))==0;
    }
    public static void main(String args[]) {
        int n = 4;
        System.out.print(powerTwo(n)); 
    }
}
