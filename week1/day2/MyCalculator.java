package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {

		Calculator addition = new Calculator();
		Calculator subtraction = new Calculator();
		Calculator multiply = new Calculator();
		Calculator division = new Calculator();

		System.out.println(addition.addthreeNumbers(1, 2, 3));
		System.out.println(subtraction.subthreenumbers(10, 1, 1));
		System.out.println(multiply.multhreenumbers(1.23, 2.3, 3.2));
		System.out.println(division.dividethreenumbers(500, 5, 3));

	}

}
