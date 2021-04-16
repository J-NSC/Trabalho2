import java.util.*;
import java.util.Scanner;

public class MelhorDivisor {
    
	public int somaDigito(int num) {
		int soma=0;
		while (num > 0) {
			soma += num % 10;
			num /= 10;
		}
		return soma;
    }
    
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		MelhorDivisor digito = new MelhorDivisor();
		ArrayList<Integer> number = new ArrayList<Integer>();
		ArrayList<Integer> somas = new ArrayList<Integer>();
		int num;
		int max;

		num = entrada.nextInt();

		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				number.add(i);
				somas.add(digito.somaDigito(i));
			}
		}

		max = Collections.max(somas);

		System.out.println(number.get(somas.indexOf(max)));

    }
}