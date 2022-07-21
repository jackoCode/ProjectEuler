public class Grundrechnenarten {

    public static void main(String[] args) {

        double x = 10;
        double y = 2;
        char zeichen = '/';

        System.out.println(grundrechenarten(x, y, zeichen));
    }

    private static double grundrechenarten(double x, double y, char zeichen) {

        switch (zeichen){
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                if (y == 0){
                    throw new ArithmeticException("Division durch 0 ist nicht zulässig!");
                }
                return x / y;
        }
        return 0;
    }
}
