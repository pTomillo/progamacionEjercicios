import java.util.ArrayList;

public class RandomNumberMultiplos {
    public static int numeroRandom() {
        int max = 100;
        int min = 1;
        int random = (int) ((Math.random() * (max - min)) + min);
        return random;
    }

    public static ArrayList<Integer> multiplo2(ArrayList arrayDe20){
        ArrayList<Integer> multiplosDe2 = new ArrayList<>();
        for (int i = 0; i < arrayDe20.size(); i++) {
            int numArray = (int) arrayDe20.get(i);
            if (numArray % 2 == 0){
                multiplosDe2.add(numArray);
            }
        }
        return multiplosDe2;
    }

    public static ArrayList<Integer> multiplo3(ArrayList arrayDe20){
        ArrayList<Integer> multiplosDe3 = new ArrayList<>();
        for (int i = 0; i < arrayDe20.size(); i++) {
            int numArray = (int) arrayDe20.get(i);
            if (numArray % 3 == 0){
                multiplosDe3.add(numArray);
            }
        }
        return multiplosDe3;
    }

    public static ArrayList<Integer> multiplo5(ArrayList arrayDe20){
        ArrayList<Integer> multiplosDe5 = new ArrayList<>();
        for (int i = 0; i < arrayDe20.size(); i++) {
            int numArray = (int) arrayDe20.get(i);
            if (numArray % 5 == 0){
                multiplosDe5.add(numArray);
            }
        }
        return multiplosDe5;
    }



    public static void main(String[] args) {
        ArrayList<Integer> arrayDe20 = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int numRam = numeroRandom();
            arrayDe20.add(numRam);
        }

        System.out.println("Array generado: "+arrayDe20);

        System.out.println("Multiplos de 2: "+multiplo2(arrayDe20));
        System.out.println("Multiplos de 3: "+multiplo3(arrayDe20));
        System.out.println("Multiplos de 5: "+multiplo5(arrayDe20));
    }
}
