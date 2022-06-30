import java.util.Scanner;
import java.util.ArrayList;

public class NeigiamuArbaTeigiamuSkaiciuSuma {
    public static void main(String[] args) {
        ArrayList<Integer> skaicius = new ArrayList<>();

        skaicius.add(-4);
        skaicius.add(11);
        skaicius.add(3);
        skaicius.add(-25);
        skaicius.add(-98);
        skaicius.add(20);
        skaicius.add(-15);


        System.out.println("Skaiciai liste = " + skaicius);
        System.out.println( "neigiamu suma = "+  neigiamuSkaiciuSuma(skaicius));
        System.out.println( "teigiamu suma = "+ teigiamuSkaiciuSuma(skaicius));
    }
    public static int neigiamuSkaiciuSuma(ArrayList<Integer> skaicius){
        int neigiami=0;
        for (int i=0;  i < skaicius.size(); i++){
            if(skaicius.get(i) < 0){
                neigiami+= skaicius.get(i);
            }
        }
        return neigiami;
    }
    public static int teigiamuSkaiciuSuma(ArrayList<Integer> skaicius){
        int teigiami=0;
        for (int i=0;  i < skaicius.size(); i++){
            if(skaicius.get(i) > 0){
                teigiami+= skaicius.get(i);
            }
        }
        return teigiami;
    }
}


