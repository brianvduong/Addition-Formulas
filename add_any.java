import java.util.Random;

public class add_any {
	
	public static void main (String [] args) {
		
		Random rand = new Random();
		int low = 0;
		int high = 9;
		int result = rand.nextInt(high - low) + low;
		int num1 = 1;
		
		System.out.println("  " + result);
		System.out.println("+ " + num1);
		System.out.println("----");
	}
}
