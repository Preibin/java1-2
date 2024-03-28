import java.util.ArrayList;

public class Primes {

    private ArrayList<Integer> Primes;

    public Primes(int n) {

        if(n <2){
            throw new IllegalArgumentException("n should be > than 1");
        }

        Primes = new ArrayList<>();      //czemu bez tego wywalało errora?
        boolean[] Sieve = Sito.sito(n);
        for (int i = 0; i < n; i++) {
            if (Sieve[i] == true) {
                Primes.add(i);

            }
        }
    }
    public void ShowAll(){
        for(int element: Primes){
            System.out.println(element + " ");
        }
    }
    public void ShowOne(int n){
            if(n == 0){
                throw new IllegalArgumentException("n should be > than 0");
            }
            if( n > Primes.size()){
                throw new IllegalArgumentException("n is out of scope, there are" + Primes.size() + " elements, you requested the " + n + "th");
            }
            System.out.println(Primes.get(n-1));
    }

}
