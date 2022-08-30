import java.util.Scanner;

// Reading Input
    // 1. Buffered reader => ExceptionHandling_throws.java
    // 2. Scanner => IO_scanner.java [Better Syntax]

public class IO_scanner {
    public static void main(String[] args) {
        
        // creating Scanner class object(sc)
        Scanner sc = new Scanner(System.in);

        // reading input using 'sc' object
        int n = sc.nextInt();

        // MEMORY LEAK(closing resources)
        sc.close();

        System.out.println(n);
    }  
}
