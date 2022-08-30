public class Operators {
    public static void main(String args[]) {
        int a = 10, b = 4;

        // Arithmetic Operators(+, -, *, /, %)
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        System.out.println("a / b = " + (a / b));
        System.out.println("a / b = " + ((double) a / b));

        System.out.println("a % b = " + (a % b));

        // Shorthand Operators(+=, -=, *=, /=, %=)
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a += b");
        a += b; // a = a + b
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a -= b");
        a -= b; // a = a - b
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a *= b");
        a *= b; // a = a * b
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a /= b");
        a /= b; // a = a / b
        System.out.println("a = " + a + ", b = " + b);

        // pre & post increment/decrement
        System.out.println("a = " + a + ", ++a, a = " + ++a);
        System.out.println("a = " + a + ", a++, a = " + a++);
        System.out.println("a = " + a + ", --a, a = " + --a);
        System.out.println("a = " + a + ", a--, a = " + a--);
    }
}
