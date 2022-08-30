class Abc{
    public int add(int i, int j)
    {
        return i+j;
    }

    // what if more than 2 arguments are passed to function 
    // In this senario we take use of varargs[variable length arguments] (...) => so all the arguments passed to function are stored in an array and then further can be used to obtain desired result
    public int addNew(int ... n)
    {
        int sum = 0;
        for(int i : n)
        {
            sum += i;
        }
        return sum;
    }
}

public class VarArgs {
    public static void main(String[] args) {
        Abc x = new Abc();
        System.out.println(x.add(3, 4));

        System.out.println(x.addNew(1,2,3,4));
        System.out.println(x.addNew(4));
        System.out.println(x.addNew(11,2,3,4,92,20));
    }
}
