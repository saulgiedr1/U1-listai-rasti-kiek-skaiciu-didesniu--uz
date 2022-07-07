import java.util.ArrayList;
import java.util.Scanner;
public class Listai {
    public static void main(String[] args) {

        ArrayList<Integer> skaicius = listoNuskaitymas();

        int skaitmuo;

        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite skaitmeni: ");
        skaitmuo = skaitytuvas.nextInt();
        System.out.println("x = " +skaitmuo);

        System.out.println("skaicius = " + skaicius);

        System.out.println("Didesniu uz skaitmeni yra :"+didesniUz(skaicius,skaitmuo));

    }
    public static ArrayList<Integer> listoNuskaitymas() {
        Scanner skaitytuvas = new Scanner(System.in);
        ArrayList<Integer> listas = new ArrayList<>();
        System.out.println("Įveskite kiek bus list'e skaičių: ");
        int n = skaitytuvas.nextInt();

        skaitytuvas.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite listo " + i + "-ąjį skaiciu");
            listas.add(skaitytuvas.nextInt());
        }
        return listas;
    }
  
    public static int didesniUz(ArrayList<Integer> skaicius , int x) {
        int didesni = 0;
        for (int i = 0; i < skaicius.size(); i++) {
            if (skaicius.get(i) > x) {
                didesni++;
            }

        }
        return didesni;
    }

}
