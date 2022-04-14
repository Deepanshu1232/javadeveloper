package hello;

public class looops {

	public static void loop1(int deep, int value) {

		
		do {

			System.out.println(deep);
			deep++;

		} while (deep <= value);

	}

	public static void main(String[] args) {
		
		loop1(1,10);
		System.out.println("************************");
		loop1(20,40);

	}

}
