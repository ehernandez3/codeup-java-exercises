import java.util.Scanner;

public class Bob {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

// 2.
// Create a class named Bob with a main method for the following exercise.
// Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//		-Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//		-He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//		-He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//		-He answers 'Whatever.' to anything else.

//		 Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

//========== My Solution

//		String questionResponse = "Sure.";
//		String yellResponse = "Whoa, chill out!";
//		String ignoreRespone = "Fine. Be that way!";
//		String otherResponse = "Whatever.";
//
//		System.out.println("Hello, I'm Bob.");
//		boolean exit;
//
//		do {
//			String message = sc.nextLine();
//			boolean question = message.endsWith("?");
//			boolean yell =  message.endsWith("!");
//			boolean ignore = message.equals("");
//			exit = message.equals("bye");
//
//			if(question) {
//				System.out.println(questionResponse);
//			}else if (yell) {
//				System.out.println(yellResponse);
//			}else if (ignore) {
//				System.out.println(ignoreRespone);
//			} else {
//				System.out.println(otherResponse);
//			}
//		} while (!exit);

//==================== Justin's Solution

		// Scanner at the top

		boolean willContinue = true;
		do {
			System.out.println("Say something to Bob!");
			String userQuery = sc.nextLine();
			String bobResponse;


			if (userQuery.endsWith("?")) {
				bobResponse = "Sure.";
			} else if (userQuery.endsWith("!")) {
				bobResponse = "Whoa, chill out!";
			} else if (userQuery.equals("")) {
				bobResponse = "Fine. Be that way!";
			} else {
				bobResponse = "Whatever.";
			}

			System.out.println(bobResponse);
			System.out.println("Do you still want to talk to Bob?");
			willContinue = (sc.nextLine().equals("yes"));

		} while (willContinue);


	}
}
