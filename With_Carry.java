import java.util.Random;

public class With_Carry {
	public static int generateRandom() {
		Random rand = new Random();
		int low = 0;
		int high = 9;
		int result = rand.nextInt(high - low) + low;
		return result;
	}
	
	public static void main (String [] args) {
		
		int number1 = generateRandom();
		int number2 = generateRandom();
		int number3 = generateRandom();
		int number4 = generateRandom();
		
		System.out.println("  " + number1 + "" + number3);
		System.out.println("+ " + number2 + "" + number4);
		System.out.println("-----");
	}
}
