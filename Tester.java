import java.util.Scanner;
public class Tester {

public static void main(String[] args) {
	Scanner kbScanner = new Scanner(System.in);
	System.out.print("Please enter your name. ");
	String a = kbScanner.next();
	a = a.toLowerCase();
	for (int b = a.length()-1; b >= 0; b--)
	{
		System.out.print(a.substring(b,b+1));
	}
}

}