public class setIthBit {
    public static int setBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static void main(String args[]) {
        int n = 0b10001010;
        int i = 2;
        int result = setIthBit(n, i);
        System.out.print(Integer.toBinaryString(result)); 
    }
}
