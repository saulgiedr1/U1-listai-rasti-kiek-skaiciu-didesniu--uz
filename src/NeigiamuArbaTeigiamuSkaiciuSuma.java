import java.util.Scanner;
import java.util.ArrayList;

public class NeigiamuArbaTeigiamuSkaiciuSuma {
    public static void main(String[] args) {
        ArrayList<Integer> skaicius = new ArrayList<>();

        skaicius.add(-4);
        skaicius.add(11);
        skaicius.add(3);
        skaicius.add(-26);
        skaicius.add(-17);
        skaicius.add(20);
        skaicius.add(-20);


        System.out.println("skaicius = " + skaicius);

    }
    public static int neigiamuSkaiciuSuma(ArrayList<Integer> skaicius){
        int neigiami=0;
        for (int i=0;  i < skaicius.size(); i++){
            if(skaicius.get(i) < 0){
                return neigiami++;
            }
        }
        return neigiami;
    }
}
