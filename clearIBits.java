public class clearIBits {
    public static int clearBits(int n, int i){
        int bitmask= (~0)<<i;
        return n&bitmask;
    }
    public static void main(String args[]) {
        int n = 0b1111;
        int i = 2;
        int result= cleariBits(n,i);
        System.out.print(Integer.toBinaryString(result)); 
    }
}
