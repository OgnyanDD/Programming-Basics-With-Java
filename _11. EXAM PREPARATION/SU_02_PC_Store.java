import java.util.Scanner;

public class SU_02_PC_Store {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double cenaProcesor = in.nextDouble();
        double cenaVideoKarta = in.nextDouble();
        double cenaRamPamet = in.nextDouble();
        int broiRamPamet = in.nextInt();
        double procentOtstapka = in.nextDouble();

        final double USD_LV = 1.57;

        double cenaProcesorLv = cenaProcesor * USD_LV;
        double cenaVideoKartaLv = cenaVideoKarta * USD_LV;
        double cenaRamPametLv = cenaRamPamet * broiRamPamet * USD_LV;
        double otstapkaProcesor = cenaProcesorLv * procentOtstapka;
        double otstapkaVideoKarta = cenaVideoKartaLv * procentOtstapka;

        double krainaCena = (cenaProcesorLv - otstapkaProcesor) + (cenaVideoKartaLv - otstapkaVideoKarta) + cenaRamPametLv;

        System.out.printf("Money needed - %.2f leva.", krainaCena);

    }
}
