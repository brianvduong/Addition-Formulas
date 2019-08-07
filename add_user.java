import java.util.Random;
import java.util.Scanner; 

public class add_user {
	
	public static int generateRandom() {
		Random rand = new Random();
		int low = 0;
		int high = 9;
		int result = rand.nextInt(high - low) + low;
		return result;
	}
	
	public static void main(String[]args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 0-9: ");
		int i = scan.nextInt();
		
		System.out.println("  " + generateRandom());
		System.out.println("+ " + i);
		System.out.println("----");
	}
}
