import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        testdrive("get a licensed");
        scan.close();
    }

    static void testdrive(String drive) {

        System.out.println("Test result!");
        learn(drive);

        String feedback = getFeedBack(drive);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            getlicensed(drive);

            // Recursive call
            testdrive(drive);
        } else if (feedback.equals("yes")) {
            learn(drive);
        }
    }

    static void learn(String drive) {
        System.out.println("getlicense");
    }

    static String getFeedBack(String drive) {
        System.out.println("did you passed" + " the " + " testdrive (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void getlicensed(String drive) {
        System.out.print("you need some practice:");
        String driveString = scan.next();
        System.out.println("waiting for the result. Added " + "license");
    }

    static void serve(String drive) {
        System.out.println("Waiting " + "card");
    }

}


   