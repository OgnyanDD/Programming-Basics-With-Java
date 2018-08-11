import java.util.Scanner;

public class SU_04_Picture_In_The_Wall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int L_dupka = in.nextInt();
        int H_dupka = in.nextInt();
        int L_H_kartina = in.nextInt();
        int broiKartini = in.nextInt();

        int areaDupka = L_dupka * H_dupka;
        int areaKartini = (L_H_kartina * L_H_kartina) * broiKartini;
        int razlika = areaDupka - areaKartini;

        if (areaDupka < areaKartini) {
            System.out.printf("The pictures don't fit in the hole. Picture area is %d bigger than hole area.", Math.abs(razlika));
        } else {
            System.out.printf("The pictures fit in the hole. Hole area is %d bigger than pictures area.", Math.abs(razlika));
        }

    }
}
