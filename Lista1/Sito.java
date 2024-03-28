import java.util.Arrays;

public class Sito {
    static boolean[] sito(int n){
        boolean[] sito = new boolean[n];
        Arrays.fill(sito, true);
        sito[0] = false;
        sito[1] = false;
        for (int i = 2; i < Math.sqrt(n); i++ ){

            if(sito[i] == true){

                for (int j = i+1; j < sito.length - 1; j++){
                    if(j % i == 0){
                        sito[j] = false;
                    }
                }

            }
        }
        return sito;
    }
}