import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] tablicaStringow = new String[5];


        tablicaStringow[0] = "Element 1";
        tablicaStringow[1] = "Element 5";
        tablicaStringow[2] = "Element 3";
        tablicaStringow[3] = "Element 4";
        tablicaStringow[4] = "Element 2";

        // Sortowanie elementów tablicy
        Arrays.sort(tablicaStringow);

        for (int i = 0; i < tablicaStringow.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + tablicaStringow[i]);
        }

        // Wyszukiwanie elementu
        String szukanyElement = "Element 3";
        boolean znaleziono = false;

        for (int i = 0; i < tablicaStringow.length; i++) {
            if (tablicaStringow[i].equals(szukanyElement)) {
                znaleziono = true;
                System.out.println("Znaleziono element '" + szukanyElement + "' na pozycji " + i);
                break;
            }
        }

        if (!znaleziono) {
            System.out.println("Nie znaleziono elementu '" + szukanyElement + "' w tablicy.");
        }
    }
}