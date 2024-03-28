import java.util.ArrayList;

public class PascalTriangle {

    private ArrayList<Integer> Layer;

public PascalTriangle(int n) {
    Layer = new ArrayList<>();//czemu bez tego wywalało errora?

    if (n == 0) {
        Layer.add(1);
    } else {
        Layer.add(1);
        Layer.add(n);
        int work = n;
        for (int i = 2; i <= n; i++) {
            work = work * (n - i + 1);
            work = work / i;
            Layer.add(work);
        }
    }
}
public void ShowAll(){
    for(int element: Layer){
        System.out.println(element);
    }
}
public void ShowOne(int n){
    if(n > Layer.size()){
        throw new IllegalArgumentException("there are " + Layer.size() + " elements, you asked for the " + n +"th");
    }
    System.out.println(Layer.get(n-1));
}
}

