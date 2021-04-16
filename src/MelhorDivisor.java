import java.util.*;

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
ArrayList<Integer> number = new ArrayList<Integer>();
ArrayList<Integer> somas = new ArrayList<Integer>();
 num = entrada.nextInt();

for(int i = 1; i < num; i++) {
if(num % i == 0) {
number.add(i);
somas.add(digito.somaDigito(number.get(number.indexOf(i))));
}
}


for(int i = 0; i < number.size(); i++) {

System.out.println(somas.get(i));

}

    }
}