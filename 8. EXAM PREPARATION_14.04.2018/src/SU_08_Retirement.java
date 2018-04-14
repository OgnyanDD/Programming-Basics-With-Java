import java.util.Scanner;

public class SU_08_Retirement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String gender = in.nextLine();
        int age = Integer.parseInt(in.nextLine());
        int workExperience = Integer.parseInt(in.nextLine());
        final int FEMALE_AGE = 61;
        final int FEMALE_WORKEXP = 35;
        final int MALE_AGE = 64;
        final int MALE_WORKEXP = 38;

        int femaleAgeDiff = FEMALE_AGE - age;
        int femaleWorkExp = FEMALE_WORKEXP - workExperience;
        int maleAgeDiff = MALE_AGE - age;
        int maleWorkExp = MALE_WORKEXP - workExperience;

        switch (gender) {
            case "female":
                if (age >= 61 && workExperience >= 35) {
                    System.out.printf("Ready to retire at %d and %d years of experience!", age, workExperience);
                } else if (age < 61 && workExperience >= 35) {
                    System.out.printf("Worked enough, but not old enough. Years left to retirement: %d.", femaleAgeDiff);
                } else if (age >= 61 && workExperience < 35) {
                    System.out.printf("Old enough, but haven't worked enough. Work experience left to retirement: %d.", femaleWorkExp);
                } else {
                    System.out.printf("Too early. Years left to retirement: %d. Work experience left to retirement: %d.", femaleAgeDiff, femaleWorkExp);
                }
                break;
            case "male":
                if (age >= 64 && workExperience >= 38) {
                    System.out.printf("Ready to retire at %d and %d years of experience!", age, workExperience);
                } else if (age < 64 && workExperience >= 38) {
                    System.out.printf("Worked enough, but not old enough. Years left to retirement: %d.", maleAgeDiff);
                } else if (age >= 64 && workExperience < 38) {
                    System.out.printf("Old enough, but haven't worked enough. Work experience left to retirement: %d.", maleWorkExp);
                } else {
                    System.out.printf("Too early. Years left to retirement: %d. Work experience left to retirement: %d.", maleAgeDiff, maleWorkExp);
                }
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }

    }
}
