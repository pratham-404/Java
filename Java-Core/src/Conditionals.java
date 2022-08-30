public class Conditionals {
    public static void main(String args[]) {
        int a = 20, b = 10;

        // if conditional
        if (a > b) {
            System.out.println("a is greater than b");
        }

        // if-else conditional 
        if (a > b)
            System.out.println("a is greater than b");
        else
            System.out.println("b is greater than a");

        // ternary operator
        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;
        System.out.println("Max: " + max + ", Min: " + min);

        // if-if_else-else ladder
        if (a > b) { // if more than one conditions are passed to a block then we use curly braces{}
            System.out.println("a is greater than b");
            System.out.println("Done");
        } else if (a < b)
            System.out.println("b is greater than a");
        else
            System.out.println("a is equal to b");

        // switch-case statements
        // switch statements support int, char but does not support double
        // String can be used in version 1.7 and later
        switch (a) {
            case 1:
                System.out.println("a is equal to one");
                break;
            case 2:
                System.out.println("a is equal to two");
                break;
            case 3:
                System.out.println("a is equal to three");
                break;
            default:
                System.out.println("a is greater than 3 or less than 1");
                break;
        }

    }
}
