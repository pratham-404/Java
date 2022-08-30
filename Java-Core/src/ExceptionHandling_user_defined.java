
public class ExceptionHandling_user_defined {
    public static void main(String[] args) {

        int i = 9, j = 0, k;

        try{
            if(j == 0){
                throw new BhaiException("Bhai Paani Peele");
            }
            k = i/j;
        }
        catch(BhaiException e){
            System.out.println(e.getMessage());
        }
    }
}
