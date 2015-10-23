import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HelloUser {
	static String userName = "";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greetUser();
	}
	public static void greetUser() {
		System.out.println("Hello ASE2015 - how are you? :)\nPlease enter your name: ");
	    try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			userName = bufferRead.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hallo " + userName + "!");
	}

}
