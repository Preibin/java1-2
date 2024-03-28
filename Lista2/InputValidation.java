public class InputValidation {

    static boolean InputValidation(String input){
        for(int i = 0 ; i < input.length(); i++){
            if(Character.isDigit(input.charAt(i)) == false){
                return false;
            }
        }
        return true;
    }
}
