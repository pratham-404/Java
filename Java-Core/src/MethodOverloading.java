class Casio{
    int num1;
    int num2;
    String Operation;

    // Constructor Overloading: Similar like method overloading & very frequently used in java
    // acccording to parameters passed to constructor specific constructor is instantiated
    public Casio()
    {
        num1 = 0;
        num2 = 0;
        Operation = "nothing";
    }

    public Casio(int i)
    {
        num1 = i;
        num2 = 0;
        Operation = "nothing";
    }

    public Casio(int i, int j)
    {
        num1 = i;
        num2 = j;
        Operation = "nothing";
    }

    public Casio(int i, int j, String k)
    {
        num1 = i;
        num2 = j;
        Operation = k;
    }

    // Method Overloading => Same Method name but differnet input parameters
    public int add(int a, int b)
    {
        return a+b;
    }

    public int add(int a, int b, int c)
    {
        return a+b+c;
    }

    public double add(double a, double b)
    {
        return a+b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        
        Casio c = new Casio();

        System.out.println(c.add(10, 12));
        System.out.println(c.add(10, 12,19));
        System.out.println(c.add(10.23, 1.42));
    }
}
