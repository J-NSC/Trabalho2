import java.util.ArrayList;

public class Fibona {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 9; i++){
			list.add(Cal.Fibo(i));
		}

		System.out.println(list.get(1));


	}

	

}



