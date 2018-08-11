import java.util.Scanner;

public class SU_01_Hearthstone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pochivka = in.nextInt();
        double cenaKarti = in.nextDouble();
        double cenaPrikl = in.nextDouble();
        double cenaKafe = in.nextDouble();

        final int PUZA_KAFE = 5;
        final int VREME_KARTI = 2;
        final int VREME_PRIKL = 2;

        double pari = cenaKafe + 3 * cenaKarti + 2 * cenaPrikl;
        int vreme = pochivka - PUZA_KAFE - 3 * VREME_KARTI - 2 * VREME_PRIKL;

        System.out.printf("%.2f%n",pari);
        System.out.println(vreme);

    }
}
