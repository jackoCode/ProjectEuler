import java.math.BigInteger;

public class ScarySphereP360 {

    // --> Solution 878825614395267072

    private static BigInteger distanceOfElement(BigInteger x, BigInteger y, BigInteger z){
        BigInteger distance = new BigInteger("0");

        distance = x.add(y).add(z);

        return distance;
    }

    public static void main(String[] args) {
        BigInteger x = BigInteger.ZERO;
        BigInteger y = BigInteger.ZERO;
        BigInteger z = BigInteger.ZERO;
        BigInteger counter = BigInteger.ZERO;
        BigInteger radius = new BigInteger("10").pow(10);
        BigInteger summeX = new BigInteger("0");
        BigInteger summeY = new BigInteger("0");
        BigInteger summeZ = new BigInteger("0");
        BigInteger summeGesamt = new BigInteger("0");
        BigInteger solution = new BigInteger("878825614395267072");

        while (!counter.equals(radius)){
            summeX = summeX.add(distanceOfElement(counter,y,z));
            System.out.println("X: " + counter + " " + solution.subtract(summeX));
            counter = counter.add(BigInteger.ONE);
        }

        counter = BigInteger.ZERO;
        while (!counter.equals(radius)){
            summeY = summeY.add(distanceOfElement(x,counter,z));
            System.out.println("Y: " + counter + " " + solution.subtract(summeY));
            counter = counter.add(BigInteger.ONE);
        }

        counter = BigInteger.ZERO;
        while (!counter.equals(radius)){
            summeZ = summeZ.add(distanceOfElement(x,y,counter));
            System.out.println("Z: " + counter + " " + solution.subtract(summeZ));
            counter = counter.add(BigInteger.ONE);
        }

        summeGesamt.add(summeX).add(summeY).add(summeZ);

        System.out.println(summeGesamt);
    }
}
