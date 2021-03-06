import java.util.Scanner;

public class twoZeros {
	public static int recursion(int a, int b) {
		// Базовый случай
		if (a > b + 1) {
			return 0;
		}
		// Базовый случай
		if (a == 0 || b == 0) {
			return 1;
		}
		// Шаг рекурсии / рекурсивное условие
		return recursion(a, b - 1) + recursion(a - 1, b - 1);
	}
	public static void main(String[] args) {
		System.out.println(recursion(1, 3)); // вызов рекурсивной функции
	}
}
