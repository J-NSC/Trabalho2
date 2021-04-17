import java.util.Scanner;
import java.util.ArrayList;

public class MultiploEspecial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n;
		int x;
		int c;

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			c = 1;
			while (compositeNumber(c) % x != 0) c++; // Verifica o primeiro número composto divisível pela entrada
			list.add(compositeNumber(c));
		}

		for (int i = 0; i < n; i++) System.out.println(list.get(i));

	}

	// Esta função gera o n-ésimo número composto apenas de 0 e 9
	public static int compositeNumber(int n) {

		int c; // Número composto
		int i; // Ordem

		c = 0;
		i = 1;

		while (n > 0) {
			c += (n % 2) * i * 9; // Calcula o algarismo com base na ordem
			i *= 10; // Aumenta a ordem
			n /= 2; // Decrementa o número composto
		}

		return c;

	}
}

