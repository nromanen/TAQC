package kata.impl.SerhiiZdoima;

import java.math.BigInteger;

public class FiveKataImpl {
    int artificialRain(final int[] v){return 0;}

    long[] gap(int g, long m, long n){return null;}

    int zeros(int n){
        {
            int count = 0;
            for (int a = 5; n / a >= 1; a *= 5)
                count += n / a;
            return count;
        }
    }

   public BigInteger perimeter(BigInteger n){
        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.ONE;
        BigInteger fourth = BigInteger.ONE;
        BigInteger sum = BigInteger.ONE;
        for(BigInteger i=new BigInteger("0");i.compareTo(n)<0;i=i.add(BigInteger.ONE)){
            sum =sum.add(second);
            fourth=new BigInteger(first.toString());
            first=new BigInteger(second.toString());
            second=first.add(fourth);
        }
        return sum.multiply( new BigInteger("4"));
    }

    double solve(double m){return 0;}

    long[] smallest(long n){return null;}
}

