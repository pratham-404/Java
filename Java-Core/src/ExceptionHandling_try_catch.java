
// Unchecked Exceptions => cannot be found at compile time 
// only runtime exception subclasses are unchecked exceptions 

public class ExceptionHandling_try_catch {
    public static void main(String[] args) {
        
        System.out.println("Hi");

        try{
            int arr[] = new int[5];
            System.out.println(arr[5]);
            
            int i = 9/0;
        }
        // catch(Exception e){
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){ // we can add multiple exceptions this way(Java 1.7+)
            // System.out.println("Bhai Paani Peele");
            System.err.println("Bhai Paani Peele"); //RED
        }
        // for safety we can always check for Exceptions at the end of catch block
        catch(Exception e){
            System.out.println("Error !");
        }
        finally{ // Block that runs redardless of exception
            System.err.println("Bye");
        }
        // System.err.println("Bye");
        
    }
}
