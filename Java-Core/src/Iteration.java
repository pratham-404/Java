public class Iteration {
    public static void main(String args[]){

        // iterations are used to remove code redundency
        int i = 0;

        // while loop
        System.out.println("While Loop");
        while(i < 3){
            System.out.println(i);
            ++i;
        }
        
        // do-while loop
        System.out.println("Do-While Loop");
        i = 0;
        do{
            System.out.println(i);
            ++i;
        }while(i < 3);
        
        // for loop
        System.out.println("For Loop");
        i = 0;
        for(;i < 3; ++i)
        {
            System.out.println(i);
        }

        // break & continue statements
        for(int j = 0; j < 5; j++)
        {
            if(j == 2)
                continue;

            if(j >= 2)
                System.out.println("Hello MF");
            
            if(j == 3)
                break;
        }
    }
}
