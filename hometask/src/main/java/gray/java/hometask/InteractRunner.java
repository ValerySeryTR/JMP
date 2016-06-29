package gray.java.hometask;

import java.util.Scanner;

public class InteractRunner {
	public static void main(String[] args) {

		try (Scanner reader = new Scanner(System.in)) {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Choose operaiton:");
				System.out.println("1. Add(default)");
				System.out.println("2. Minus");
				System.out.println("3. Multiply");
				System.out.println("4. Division");
				String opr = reader.next();
				calc.setOperation(Integer.valueOf(opr));

				System.out.println("1st arg:");
				String first = reader.next();
				System.out.println("2nd arg:");
				String second = reader.next();
				calc.operation(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("result: " + calc.getResult());

				System.out.println("Clear result? yes/no");
				exit = reader.next();
				if (exit.toLowerCase().equals("yes"))
					calc.clearResult();

				System.out.println("exit? yes/no");
				exit = reader.next();
			}
		}
	}
}
