import java.util.Scanner;

public class FatoresPrimos {
	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		int c=0, n=0;

		c = scan.nextInt();

		for(int i = 0; i < 2; i++ ){
			if(c % 2 != 0){
				n++;
			}
		}

		System.out.println(n);
	}
}