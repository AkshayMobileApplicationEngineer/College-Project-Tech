import java.util.Scanner;

public class RashiFinder {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter birth date (DD-MM-YYYY): ");
        String input = scanner.nextLine();

        String[] dateParts = input.split("-");
        if (dateParts.length != 3) {
            System.out.println("Invalid date format. Please enter in DD-MM-YYYY format.");
            return;
        }

        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        @SuppressWarnings("unused")
        int year = Integer.parseInt(dateParts[2]);

        String rashi = findRashi(day, month);

        System.out.println("Your Rashi is: " + rashi);

        scanner.close();
    }

    public static String findRashi(int day, int month) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "मेष (Aries)";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "वृष (Taurus)";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "मिथुन (Gemini)";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "कर्क (Cancer)";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "सिंह (Leo)";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "कन्या (Virgo)";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "तुला (Libra)";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "वृश्चिक (Scorpio)";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "धनु (Sagittarius)";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "मकर (Capricorn)";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "कुंभ (Aquarius)";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "मीन (Pisces)";
        } else {
            return "Invalid Date";
        }
    }
}