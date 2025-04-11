public class clearIthBit {
    public static int clearBit(int n, int i){
        int bitMask= ~(1<<i);
        return n & bitMask;
    }

    public static void main(String args[]) {
        int n = 0b1010;
        int i = 1;
        int result = clearIthBit(n, i);
        System.out.print(Integer.toBinaryString(result)); 
    }
}
