package results;

public class results {
	public int physics;
	public int chemistry;
	public int biology;
	public int total;
	public float percentage;
	
	public static void main(String[] args) {
		int physics =15;
		int chemistry = 15;	
		int biology = 25;	
		int total = physics + chemistry + biology;
		float percentage = 0;
		results.method1(physics, chemistry, biology, total);
		results.method2(percentage, total);
	}

	public static void method1(int physics, int chemistry, int biology, int total) {
		System.out.println("EXAM RESULTS \n============\nPhysics result = " + physics + "/150.");
		System.out.println("Chemistry result = " + chemistry + "/150.\nBiology result = " + biology + "/150.");
		System.out.println("\nTotal result is " + total +"/450.");
	}
	
	public static void method2(float percentage, int total) {
		percentage = (total *100)/450;
		if (percentage >60) {
		System.out.println("This gives an overall percentage of " + percentage + "%. Congratulations, you've passed!");
		} else {
			System.out.println("\nYou only got an overall percentage of " + percentage + "%.\n           You have failed.");
		}
	}
}
