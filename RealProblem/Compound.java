public class Compound {
    public static double amount = 1;
    public static double rate = 5;
    public static double time = 12;
    public static double interest;
    public static double principal;
    public static int days;
    public static double compoundInterest;

    public static void main(String[] args) {
        days = (int) (30 * time);

        principal = calculatePrincipal(0, amount, days);

        interest = principal * rate * time / 100;
        compoundInterest = principal + interest;
        System.out.println("Interest is: " + compoundInterest);
    }

    private static double calculatePrincipal(int currentDay, double currentAmount, int totalDays) {
        if (currentDay == totalDays) {
            return currentAmount+currentAmount;
        }

        return calculatePrincipal(currentDay + 1, currentAmount + (currentAmount++), totalDays);
    }
}
