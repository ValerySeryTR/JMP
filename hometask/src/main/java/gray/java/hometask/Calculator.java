package gray.java.hometask;

public class Calculator {
	enum Operation {
		ADD, MINUS, MULT, DIV
	}

	private int result;
	private Operation operation;

	public void setOperation(int opr) {
		if (1 <= opr & opr <= 4)
			operation = Operation.values()[opr - 1];
		else
			operation = Operation.ADD;
	}

	private void add(int param1, int param2) {
		result += param1 + param2;
	}

	private void minus(int param1, int param2) {
		result += param1 - param2;
	}

	private void mult(int param1, int param2) {
		result += param1 * param2;
	}

	private void div(int param1, int param2) {
		result += param1 / param2;
	}

	public int getResult() {
		return result;
	}

	public void clearResult() {
		result = 0;
	}

	public void operation(int param1, int param2) {
		switch (operation) {
		case ADD:
			add(param1, param2);
			break;

		case MINUS:
			minus(param1, param2);
			break;

		case MULT:
			mult(param1, param2);
			break;

		case DIV:
			div(param1, param2);
			break;

		default:
			break;
		}
	}

}
