	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter student email: ");
	        String studentemail = scan.nextLine();

	        // Long method
	        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
	        Matcher matcher = pattern.matcher(studentemail);

	        boolean match = matcher.matches();

	        if (match) {
	            System.out.println("valid student email");
	        } else {
	            System.out.println("invalid student email");
	        }

	        
	        System.out.print("Enter student cp number: ");
	        String studentcpNum = scan.nextLine();

	        // Long method
	         pattern = Pattern.compile("09\\d{9}");
	         matcher = pattern.matcher(studentcpNum);

	         match = matcher.matches();

	        if (match) {
	            System.out.println("valid student cpnumber");
	        } else {
	            System.out.println("invalid student cpnumber");
	    }
	}
	}
