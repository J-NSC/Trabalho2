/*
 * Autor: souzags
 * 
 * Crivo de Eratóstenes implementado com ArrayList
 *
 */


import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayCrivo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ListIterator iter;
		int max;
		long t1, t2;

		max = sc.nextInt();

		t1 = System.currentTimeMillis();

		for(int i = 1; i <= max; i++) list.add(i); // preenche a lista

		list.remove(0); // remove o número 1

		while (list.size() != 0) {
			iter = list.listIterator(); // reseta o iterator para o início da lista
			int num = list.get(0);
			
			sb.append(num);
			sb.append(" ");

			while(iter.hasNext()) {
				if((Integer)iter.next() % num == 0) iter.remove(); // remove todos os múltiplos do primo atual
			}
		}

		sb.deleteCharAt(sb.length() - 1); // remove o último espaço em branco

		t2 = System.currentTimeMillis();

		System.out.println(sb.toString());
		System.out.println(t2-t1);

	}
}