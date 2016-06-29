package gray.java.hometask;

import java.util.Scanner;

public class InteractRunner {
	public static void main(String[] args) {

		try (Scanner reader = new Scanner(System.in)) {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("1st arg:");
				String first = reader.next();
				System.out.println("2nd arg:");
				String second = reader.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("result: " + calc.getResult());
				calc.clearResult();
				System.out.println("exit? yes/no");
				exit = reader.next();
			}
		}
	}
}
