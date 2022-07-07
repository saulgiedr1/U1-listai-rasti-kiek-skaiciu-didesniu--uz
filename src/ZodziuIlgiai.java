import java.util.ArrayList;
import java.util.Scanner;

public class ZodziuIlgiai {
    public static void main(String[] args) {

        ArrayList<String> zodis = new ArrayList<>();

        zodis.add("namas");
        zodis.add("lova");
        zodis.add("kaimas");
        zodis.add("miestas");
        zodis.add("langas");
        zodis.add("varnalesa");
        zodis.add("furgonas");

        System.out.println("zodziu listas yra: " + zodis);
        System.out.println("zodziu skaicius = " + zodis.size());

        ArrayList<Integer> ilgis = zodziuIlgis(zodis);
        System.out.println("Zodziu ilgiai = " + ilgis);

        int skaitmuo = 8;

        System.out.println("Ilgesni uz paduodama skaitmeni : " + didesniUz(ilgis, skaitmuo));

    }

    public static ArrayList<Integer> zodziuIlgis(ArrayList<String> zodis) {
        ArrayList<Integer> ilgiai = new ArrayList<>();
        for (int i = 0; i < zodis.size(); i++) {
            zodis.get(i).length();
            ilgiai.add(zodis.get(i).length());
        }
        return ilgiai;
    }

    public static int didesniUz(ArrayList<Integer> ilgis, int x) {
        int didesni = 0;
        for (int i = 0; i < ilgis.size(); i++) {
            if (ilgis.get(i) > x) {
                didesni++;
            }
        }
        return didesni;
    }
}