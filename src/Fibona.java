import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;


public class Fibona {

	public static void main(String[] args) {
		System.out.println(fibo(3, 7, 5));
		
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



