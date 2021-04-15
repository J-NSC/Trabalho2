/*
 * Autor: souzags
 * 
 * Crivo de Eratóstenes
 *
 */


import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Crivo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int numberList[];
		int max;

		max = sc.nextInt();
		numberList = new int[max];

		numberList[0] = 0;

		for (int i = 1; i < max; i++) {
			numberList[i] = i + 1;
		}

		for (int i = 0; i < max; i++) {
			if (numberList[i] != 0) {
				sb.append(numberList[i]);
				sb.append(" ");
				for (int j = i + 1; j < max; j++) {
					if(numberList[j] % numberList[i] == 0) numberList[j] = 0;
				}
			}
		}

		sb.deleteCharAt(sb.length() - 1);

		System.out.println(sb.toString());
	}
}