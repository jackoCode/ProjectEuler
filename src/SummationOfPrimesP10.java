public class SummationOfPrimesP10 {

     // Find the sum of all the primes below two million.

     public static void main(String[] args) {
          long sum =0;
          for(int i =3;i<2000000;i+=2)
          {
               if(isPrime(i))
               {
                    sum+=i;
               }
          }
          System.out.println(sum);
     }

     public static boolean isPrime(int n)
     {
          boolean prime = true;
          if (n<2) return false;
          if (n==2) return true;
          if (n%2==0) return false;
          for (int i = 3; i<=Math.sqrt(n);i+=2)
          {
               if (n%i==0)
               {
                    prime=false;
                    break;
               }
          }
          return prime;
     }
}
