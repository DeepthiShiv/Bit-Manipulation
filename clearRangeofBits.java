public class clearRangeofBits {
    public static int clearBits(int n, int i, int j){
        int a= ((~0)<<(j+1));
        int b= (1<<i)-1;
        int bitmask= a|b;
        return n & bitmask;
    }
    public static void main(String args[]) {
        int n = 0b100111010011;
        int i = 2;
        int j = 7;
        int result= clearBits(n,i,j);
        System.out.print(Integer.toBinaryString(result)); 
    }
}
