public class Main {

    public static void main(String[] args) {
        int topScore = 100;
        int secondTopScore = 60;

        // 1. Logical AND operator - "&&" - Ensures operands on each side returns "true".
        if ((topScore > secondTopScore) && (secondTopScore < 100)) {
            System.out.println("Greater than second top score and less than 100.");
        }

        // Condition evaluates to "false".
        if ((topScore < secondTopScore) && (secondTopScore < 100)) {
            System.out.println("Less than second top score and 100.");
        }

        // 2. Logical OR operator - "||" - Ensures operands on either side return "true".
        if ((topScore > 90) || (secondTopScore >= 90)) {
            System.out.println("Either or both of the conditions are true. X1");
        }

        // Updating "topScore".
        topScore = 23;

        // Condition evaluates to "false".
        if ((topScore > 90) || (secondTopScore >= 90)) {
            System.out.println("Either or both of the conditions are true. X2");
        }
    }
}
