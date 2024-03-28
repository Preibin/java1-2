import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;
import java.util.InvalidPropertiesFormatException;


public class Main {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("invalid input, no input at all");
            System.exit(0);
        }
        if(InputValidation.InputValidation(args[0]) == false){
            System.out.println("invalid input, " + args[0] + " is not a natural number > 1");
            System.exit(0);
        }
        if(Integer.valueOf(args[0]) < 2){
            System.out.println("the input is too small, n needs to be >1");
            System.exit(0);
        }
        Primes List = new Primes(Integer.valueOf(args[0]));

        for(int i = 1; i < args.length; i++) {
            if (InputValidation.InputValidation(args[i]) == false) {
                System.out.println("invalid input");
            } else {
                try {
                    List.ShowOne(Integer.valueOf(args[i]));
                }
                catch(final Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}