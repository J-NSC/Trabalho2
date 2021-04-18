import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;


public class Fibona {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int a,b,n;
		
		a = scan.nextInt();
		b = scan.nextInt();
		n = scan.nextInt();
		
		System.out.println(fibo(a, b, n));
		
	}


	public static int fibo (int a, int b, int n){
		int res =0;
		for(int i=0; i < n-1; i++){
			res = a +b;
			a=b;
			b=res;
		}

		return res;
	}



}



