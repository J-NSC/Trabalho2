import java.util.ArrayList;
import java.util.Scanner;

public class FatoresPrimos {
<<<<<<< HEAD
    public static void main(String[] args) throws Exception {
        

        int c= 0;
        long num;

        Scanner scan = new Scanner(System.in);

        ArrayList<Long> numeros = new ArrayList();

        c = scan.nextInt();

        for(int i = 0; i <c ; i++){
            num = scan.nextLong();
            numeros.add(num);
        }


        for(Long i : numeros){
            System.out.println("i " + i + " n:" +fatoPrimo(i));

        }
        // System.out.println("n:" +fatoPrimo());
        
    }


    public static int fatoPrimo(long num){

        long m = 1;
        int n = 0;
        boolean isPrimo;

        int i = 2;

       if(num ==1){
        return 0;
       }

       while(true){

            isPrimo = true;
            i++;
            
            for(int j = 2 ; j < i ; i ++){

                if(i% j == 0){
                    isPrimo = false;
                    break;
                }

                if(isPrimo){

                    if(m * j> num){
                        System.out.println("NFunc:" +n);

                        return n;
                    }

                n++;
                m*=i;
                }
            }

       }

    }


   
=======
	public static void main(String[] args) {
		System.out.println("Os primos são" + primos);
	}
>>>>>>> f34757db5c07fa1fe895ec80c1fd8e4cde1af1ad
}
