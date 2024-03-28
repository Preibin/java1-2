public class Main {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("invalid input, no input at all");
            System.exit(0);
        }
        if(InputValidation.InputValidation(args[0]) == false){
            System.out.println("invalid argument, cant create the layer");
            System.exit(0);
        }
        PascalTriangle Layer =new PascalTriangle(Integer.valueOf(args[0]));
        for(int i = 1; i < args.length; i++){
    if(InputValidation.InputValidation(args[i]) == false){
        System.out.println("invalid input, " + args[i] + "is not a natural number");
            } else {
                try {
                    Layer.ShowOne(Integer.valueOf(args[i]));
                } catch (final Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}