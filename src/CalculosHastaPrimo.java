import java.util.ArrayList;
import java.util.Scanner;

public class CalculosHastaPrimo {
    static Scanner teclado = new Scanner(System.in);

    public static boolean esPrimo(int num) {
        boolean primo = true;
        for (int i = 2; i< num; i++){
            if (num % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static float media(ArrayList<Integer> numeros) {
        int total = 0;

        for (int i = 0; i < numeros.size(); i++) {
            total = numeros.get(i) + total;
        }
        float media = total/numeros.size();
        return media;
    }

    public static int maximo(ArrayList<Integer> numeros){
        int max = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > max) {
                max = numeros.get(i);
            }
        }
        return max;
    }

    public static int minimo(ArrayList<Integer> numeros) {
        int min = numeros.get(1);
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < min ) {
                min = numeros.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        boolean condicionPrima = false;

        do {

            System.out.println("Introduzca un numero: ");
            int numIntro = teclado.nextInt();

            if (esPrimo(numIntro) == false) {
                numeros.add(numIntro);
            } else {
                condicionPrima = true;
            }

        } while (!condicionPrima);

        int totalNumeros = numeros.size();
        float media = media(numeros);
        int maximo = maximo(numeros);
        int minimo = minimo(numeros);

        System.out.println("Usuario, ha introducido un total de "+totalNumeros+" numeros no primos, siendo el maximo "+maximo+" y el minimo "+minimo+", la media de los numeros introducidos es: "+media);



    }
}
