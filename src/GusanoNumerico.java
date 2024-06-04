import java.util.Scanner;

public class GusanoNumerico {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca un numero para ser devorado: ");
        int numeroIntro = teclado.nextInt();

        String numeroString = String.valueOf(numeroIntro);
        StringBuilder numeroDevorado = new StringBuilder();

        for(int i = 0; i < numeroString.length(); i++) {
            char numChequeo = numeroString.charAt(i);
            int intchequeo = Integer.parseInt(String.valueOf(numChequeo));
            if (intchequeo != 0 && intchequeo != 8){
                numeroDevorado.append(numChequeo);
            }
        }

        System.out.println(numeroDevorado);
    }
}
