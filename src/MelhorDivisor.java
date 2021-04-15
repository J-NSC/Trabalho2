import java.util.Scanner;
public class MelhorDivisor {
    
    public int somaDigito(int num) {
int soma=0;
for(int i = 0; i <= 3; i++) {
 soma += num % 10;
num /= 10;
}
return soma;
    }
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
MelhorDivisor digito = new MelhorDivisor();

int num=0;
 
 num = entrada.nextInt();
System.out.println(digito.somaDigito(num));

    }
}