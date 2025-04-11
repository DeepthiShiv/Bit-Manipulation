public class updateIthBit {
    public static int clearIthBit(int n, int i){
        int bitMask= ~(1<<i);
        return n & bitMask;
    }
    public static int updateBit(int n, int i, int newbit){
        n= clearIthBit(n, i);
        int bitmask= newbit<<i;
        return n|bitmask;
    }
    public static void main(String args[]) {
        int n = 0b1010;
        int i = 0;
        int result= updateBit(n,i,1);
        System.out.print(Integer.toBinaryString(result)); 
    }
}
