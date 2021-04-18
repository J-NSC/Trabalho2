import java.util.LinkedList;

public class LinkedLi {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<>(); // declara um variavel tipo LinkedList

        list.add(10); //adiciona novo elemento na lista
        list.add(20); 
        list.add(30); 
        list.add(40); 

        for(int i = 0; i < list.size(); i++){ // metodo size retorna o tamanho total do array
            System.out.println("todos os valores"+ list.get(i) + "\n") ; // metodo .get pega o valor correspondente ao index do array
        }

        list.remove(1); //remove o elemento armazenado no index da lista

        for(int i = 0; i < list.size(); i++){ // metodo size retorna o tamanho total do array
            System.out.println("remoção "+ list.get(i) + "\n") ; // metodo .get pega o valor correspondente ao index do array
        }
    }
}
