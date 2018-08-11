import java.util.Scanner;

public class SU_06_Shopping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double byudgetIvo = in.nextDouble();
        int broiShokoladi = in.nextInt();
        double kgMlqko = in.nextDouble();

        final double SHOKOLAD_LV = 0.65;
        final double MLQKO_LV = 2.70;
        final double MANDARINI_LV = 0.20;

        double razhorShokoladi = broiShokoladi * SHOKOLAD_LV;
        double razhodMlqko = kgMlqko * MLQKO_LV;

        double mandarini = broiShokoladi * 0.35;
        double broiMandarini = broiShokoladi - Math.round(Math.ceil(mandarini));
        double razhodMandarini = broiMandarini * MANDARINI_LV;

        double neobhodimiPari = razhorShokoladi + razhodMlqko + razhodMandarini;
        double razlika = byudgetIvo - neobhodimiPari;

        if (byudgetIvo >= neobhodimiPari) {
            System.out.printf("You got this, %.2f money left!", razlika);
        } else {
            System.out.printf("Not enough money, you need %.2f more!", Math.abs(razlika));
        }

    }
}
