import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandling_throws {
    // Throws exception is used when we know an exception might occur while executing a function(Checked Exception)
    // In this case user is asked for an integer hence problem may occur (IOExceptions)
    // public static void main(String[] args) throws Exception{ //NOTE(throws Exception), here throws exception is used for br.readLine()
    public static void main(String[] args) throws Exception{ //NOTE(we can also use try catch block), here throws exception is used fro br.close()
        System.out.println("Enter a Number");

        int n = 0;

        // BufferedReader br = null;
        // try{
        //     br = new BufferedReader(new InputStreamReader(System.in));
        //     n = Integer.parseInt(br.readLine());
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // finally{
        //     br.close(); // closing resources in finally block
        // }

        // try with resource(Better Syntax)
        // with this syntax resources are closed automatically when we leave scope of try block
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            n = Integer.parseInt(br.readLine());
        }
        
        System.out.println(n);
    }    
}
