import java.util.ArrayList;
import java.util.Scanner;
public class KiekDidesniuUzPirma {
    public static void main(String[] args) {

        ArrayList<Double> skaicius = new ArrayList<>();

        skaicius.add(9.5);
        skaicius.add(11.9);
        skaicius.add(3.8);
        skaicius.add(26.6);
        skaicius.add(17.9);
        skaicius.add(20.1);
        skaicius.add(1.3);


        System.out.println("skaicius = " + skaicius);
        System.out.println(didesniUz(skaicius));
    }
        public static double didesniUz(ArrayList<Double> skaicius ) {
            double didesniUzPirma = 0;
            for (int i = 0; i < skaicius.size(); i++) {
                if (skaicius.get(i) > skaicius.get(0) ){
                    didesniUzPirma++;
                }

            }
            return didesniUzPirma;


    }
}
