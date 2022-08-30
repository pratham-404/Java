class Student {
    int roll_no = 0;
    String name = "NA";
}

public class Arrays {
    public static void main(String[] args) {
        // Array: collection of values of same type that are stored in contigous memory
        // location
        int arr[] = new int[5]; // a fixed size(i.e 5) of array of int type is created and all the array values
                                // are initially set to 0
        int arr1[] = { 4, 3, 5, 6, 2, 1 }; // declaration & initialization if array elements are known beforehand

        System.out.print("Empty Array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

        // Initializing array
        arr[0] = 11;
        arr[3] = 1;
        arr[1] = 6;
        arr[2] = 9;
        arr[4] = 4;

        System.out.print("Initialized Array: ");
        // for-each loop
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.print("\n");

        // Updating array
        arr[0] = 2;

        System.out.print("Updated Array: ");
        // for-each loop
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.print("\n");

        // array of objects
        Student cls[] = new Student[3]; // array of Student objects of size 10 is created

        Student s1 = new Student();
        s1.roll_no = 1;
        s1.name = "Pratham";
        cls[0] = s1;

        Student s2 = new Student();
        s2.roll_no = 2;
        s2.name = "Kunal";
        cls[1] = s2;

        Student s3 = new Student();
        s3.roll_no = 3;
        s3.name = "Siya";
        cls[2] = s3;

        // for-each loop
        for (Student a : cls) {
            System.out.println("Roll no: " + a.roll_no + ", Name: " + a.name);
        }

        // 2 Dimentional Arrays
        int matrix[][] = new int[5][5];

        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // for-each loop for 2D array
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // jaggged arrays: where different rows may contain different no. of columns
        int jagged[][] = {
                { 1, 2, 3 },
                { 4, 5, 6, 7 },
                { 8, 9 }
        };

        // for (int i = 0; i < jagged.length; i++) {
        //     for (int j = 0; j < jagged[i].length; j++) {
        //         System.out.print(jagged[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // for-each loop for jaggged array
        for (int[] i : jagged) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
