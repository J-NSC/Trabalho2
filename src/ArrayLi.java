import java.util.ArrayList;

public class ArrayLi {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>(); // ciar uma variavel tipo array list

        list.add(10); // adiciona uma novo valor no array
        list.add(20); 
        list.add(30); 
        list.add(40); 

        for(int i = 0; i < list.size(); i++){ // metodo size retorna o tamanho total do array
            System.out.println("todos os valores"+ list.get(i) + "\n") ; // metodo .get pega o valor correspondente ao index do array
        }
       

        list.remove(2); //metodo .remove remove o valor armazenado no index

        for(int i = 0; i < list.size(); i++){ 
            System.out.println("remoção "+list.get(i) + "\n"); 
        }
    }
}
