import java.util.ArrayList;

public class NumerosEntre10y1 {

    public static int numeroRandom() {
        int max = 10;
        int min = 1;
        int random = (int) ((Math.random() * (max - min)) + min);
        return random;
    }

    public static void main(String[] args) {

        ArrayList<Integer> veinteNumeros = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            int numRan = numeroRandom();
            veinteNumeros.add(numRan);
        }

        System.out.println(veinteNumeros);

        int nums1 = 0;
        int nums2 = 0;
        int nums3 = 0;
        int nums4 = 0;
        int nums5 = 0;
        int nums6 = 0;
        int nums7 = 0;
        int nums8 = 0;
        int nums9 = 0;
        int nums10 = 0;

        for (int i = 0; i < veinteNumeros.size(); i++) {
            int numCheck = veinteNumeros.get(i);
            switch (numCheck) {
                case 1:
                    nums1++;
                    break;
                case 2:
                    nums2++;
                    break;
                case 3:
                    nums3++;
                    break;
                case 4:
                    nums4++;
                    break;
                case 5:
                    nums5++;
                    break;
                case 6:
                    nums6++;
                    break;
                case 7:
                    nums7++;
                    break;
                case 8:
                    nums8++;
                    break;
                case 9:
                    nums9++;
                    break;
                case 10:
                    nums10++;
                    break;
                default:

            }
        }
        System.out.println("El numero 1 se repite "+nums1);
        System.out.println("El numero 2 se repite "+nums2);
        System.out.println("El numero 3 se repite "+nums3);
        System.out.println("El numero 4 se repite "+nums4);
        System.out.println("El numero 5 se repite "+nums5);
        System.out.println("El numero 6 se repite "+nums6);
        System.out.println("El numero 7 se repite "+nums7);
        System.out.println("El numero 8 se repite "+nums8);
        System.out.println("El numero 9 se repite "+nums9);
        System.out.println("El numero 10 se repite "+nums10);
    }
}
