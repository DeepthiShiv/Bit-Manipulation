public class getithBit{
    public static void main(String args[]){
      int n= 0b10001010;
      int i=3;
      int bitmask= 1<<i;
      if((n & bitmask)==0)
        System.out.print(0);
      else 
        System.out.print(1);
    }
}
