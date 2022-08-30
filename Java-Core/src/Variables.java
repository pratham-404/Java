public class Variables {
    public static void main(String args[]) {
        // variable(a) of datatype(int) and of value(10)
        int a = 10;
        System.out.println(a);

        // int b = 5.5; // ERROR
        // System.out.println(b);

        int d = 1000000000;
        System.out.println(d);
        // we can use underscore between the numeric digits for the sake of presentation
        d = 1_00_00_00_000; 
        System.out.println(d);
        d = 1_000_000_000;
        System.out.println(d);

        // long, int, short & byte
        // long w = 1000000000000; // ERROR
        long w = 1000000000000l; // long -> 8 bytes -> 64 bits
        int x = 101; // int -> 4 bytes -> 32 bits -> -2 bil to 2 bil
        short y = 10; // short -> 2 bytes -> 16 bits -> -32k to 32k
        byte z = 1; // byte -> 1 byte -> 8 bits -> -128 to 127

        //float => 4 byte
        // float e = 10.11; // ERROR: default type of decimals is double in java
        float e = 10.11f;

        //double => 8 bytes
        double c= 102.21;

        //char
        char k = 'P';
        System.out.println(k); // P
        k = 66;
        System.out.println(k); // B
        k++;
        System.out.println(k); // C

        // Implicit Conversion
        double o = 10; // here integer value is converted to double
        System.out.println(o); // 10.0

        // Explicit Conversion
        int p = (int)10.45; // here decimal value is explicitly typecasted to integer value[Floor value]
        System.out.println(p); // 10
    }
}
