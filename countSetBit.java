public class countSetBit {
    public static void countSetBits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n= n>>1;
        }
        System.out.println(count);
        System.out.print(Integer.toBinaryString(n));
    }
    public static void main(String args[]) {
        int n = 0b1010;
        countSetBits(n);
    }
}
