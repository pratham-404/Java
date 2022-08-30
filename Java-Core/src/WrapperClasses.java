
// data types      => int, float, double, etc
// Wrapper Classes => Integer, Float, Double, Etc

public class WrapperClasses {
    public static void main(String[] args) {
        int i1 = 5; // 'i1' primitive variable

        // Integer i2 = new Integer(5); // deprecated since Java version 9
        Integer i2 = Integer.valueOf(55); // 'i2' reference variable

        Integer i3 = Integer.valueOf(i1); // Boxing / Wrapping
        int i4 = i3.intValue(); // Unboxing / Unwrapping

        Integer i5 = i4; // Auto-Boxing
        int i6 = i5; // Auto-Unboxing

        // primitive are faster than wrapper classes but some frameworks just work with
        // wrapper classes

        // parsing int from string
        String str = "123";
        System.out.println(str + 1);
        int n = Integer.parseInt(str);
        System.out.println(n + 1);
    }
}
