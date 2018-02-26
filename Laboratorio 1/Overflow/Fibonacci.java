import java.math.BigInteger;

public class Main {
        private static BigInteger Overflow_BI,a,b,i;
    
    static byte Fibo_Byte(byte n){
        byte i;
        byte a=0;
        byte b=1;
        byte result;
        if (n==0){
            result=0;
        }else{
            for (i=1;i<n;i++){
                b= (byte) (a+b);
                a= (byte) (b-a);
            }
            result=b;
        }
        return result;
    }

    static short Fibo_Short(short n){
        short i;
        short a=0;
        short b=1;
        short result;
        if (n==0){
            result=0;
        }else{
            for (i=1;i<n;i++){
                b= (short) (a+b);
                a= (short) (b-a);
            }
            result=b;
        }
        return result;
    }

    static int Fibo_Int(int n){
        int i;
        int a=0;
        int b=1;
        int result1;
        if (n==0){
            result1=0;
        }else{
            for (i=1;i<n;i++){
                b=a+b;
                a=b-a;
            }
            result1=b;
        }
       return result1;
}
    static long Fibo_Long(long n){
        long i;
        long a=0;
        long b=1;
        long result2;
        if (n==0){
            result2=0;
        }else{
            for (i=1;i<n;i++){
                b=a+b;
                a=b-a;
            }
            result2=b;
        }
        return result2;
    }

    static BigInteger Fibo_BI(BigInteger n){
        BigInteger zero = null;
        //i = new BigInteger("1");
        a = new BigInteger("0");
        b = new BigInteger("1");
        BigInteger result2;
        if (n.equals(zero)==true) {
            result2=null;
        } else {
            for (i = new BigInteger("1");i.compareTo(n)<0;i=i.add(BigInteger.ONE)){
                //System.out.println(b+"b");
                b=a.add(b);
                a=b.subtract(a);
            }
            result2=b;
        }
        return result2;
    }




    public static void main(String[] args) {
        byte Overflow_byte=12;//Overflow de byte
        short Overflow_short=24; //Overflow de short
        int Overflow_int=47;//Overflow de int
        long Overflow_long=93;//Overflow de long
        Overflow_BI=new BigInteger("3000000");
        // y ya que 3 millones no fue un overflow, asumo que BigInteger
        //no tiene overflow
        
        
        
        System.out.println(Fibo_Byte(Overflow_byte));
        System.out.println(Fibo_Short(Overflow_short));
        System.out.println(Fibo_Int(Overflow_int));
        System.out.println(Fibo_Long(Overflow_long));
        System.out.println(Fibo_BI(Overflow_BI));
    }
}
