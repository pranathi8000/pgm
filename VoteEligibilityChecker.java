public class VoteEligibilityChecker {
    public static void main(String[] args) {
        int age = 20; // Set user age here

        if (isEligibleToVote(age)) {
            System.out.println("User is eligible to vote.");
        } else {
            System.out.println("User is not eligible to vote.");
        }
    }

    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }
}
