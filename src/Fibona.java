import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;


public class Fibona {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(10);
		long a=9,b=8, result= 0;
		// for(int i = 0; i < 9; i++){
		// 	list.add(Fibo(i, i+1));
		// }


		// list.add(1);
		// list.add(11);
	
		// a = list.indexOf(13);
		// b = list.get(a);
		// System.out.println("rank do a" +a);
		// System.out.println("valor contido no"+ b);

		
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



