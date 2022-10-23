import java.util.function.BinaryOperator;

public class Prg_02_Non_Capturing_Lambda {

	public static void calculate(BinaryOperator<Integer> op) {
		int x = 12, y = 5, res;
		res = op.apply(x, y);
		System.out.println(res);
	}

	public static void substract(BinaryOperator<Integer> op) {
		int x = 12, y = 5, res;
		res = op.apply(x, y);
		System.out.println(res);
	}

	public static void main(String[] args) {

		BinaryOperator<Integer> op = (a, b) -> a + b; // Non-Capturing Lambda Expression
		calculate(op);

		int c = 5;
		BinaryOperator<Integer> sub = (a, b) -> a + b + c; // Capturing Lambda Expression
		substract(sub);
	}

}
