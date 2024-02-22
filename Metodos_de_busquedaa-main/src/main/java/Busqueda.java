import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ZenBook Flip 5
 */
public class Busqueda {
   
    static List<Integer> listEnteros;

    static int numeroRandom = (int)(Math.random()*10+1);;

    public static void main(String[] args) {
        
       
        
  //creamos una lista de numeros
        
  listEnteros = new ArrayList<>();
            listEnteros.add(1);
            listEnteros.add(2);
            listEnteros.add(3);
            listEnteros.add(4);
            listEnteros.add(5);
            listEnteros.add(6);
            listEnteros.add(7);
            listEnteros.add(8);
            listEnteros.add(9);
            listEnteros.add(10);

        System.out.println("El numero aletorio es " + numeroRandom);
        System.out.println("------------------------------");
        System.out.println("Metodo de busqueda Lineal");
        metodoLineal();
        System.out.println("------------------------------");
        System.out.println("Metodo de busqueda binaria");
        metodoBinario();

    }
    public static void metodoLineal(){
        
        //en esta parte se busca el numero y si encuentra uno igual lo imprime
        for (int numeroLista : listEnteros) {
            if (numeroLista == numeroRandom){
                System.out.println("El numero seleccionado es : " + numeroLista);
            }
        }
       
    }

    public static void metodoBinario(){


        //en esta parte realizamos la declaracion de las variables y se definen
        int primero, centro, ultimo, valorCentral;

        primero= 0;

        ultimo = listEnteros.size()-1;

        while (true){
            //aquí ubicamos  la mitad de la lista
            centro = (primero + ultimo)/2;

            valorCentral = listEnteros.get(centro);

            System.out.println("Comparando " + numeroRandom + " y " + valorCentral);

            if (numeroRandom == valorCentral){
                System.out.println("El numero seleccionado es: " + valorCentral);
                break;
            }
            else if (numeroRandom < valorCentral){
                ultimo = centro - 1;
            }else{
                primero = centro + 1;
            }
        }
    }
}