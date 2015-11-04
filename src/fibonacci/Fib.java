package fibonacci;

public class Fib {
	public static void main(String[] args) {
		Fib f = new Fib();
		int n = 10;

		System.out.println(n + "th fib = " + f.fib(n));

	}

	public int fib(int n) {
		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		else {
			return fib(n - 1) + fib(n - 2);
		}
	}

}
