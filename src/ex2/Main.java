package ex2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        generatoreNumeri();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        listaInversa(array);
        booleanList(array, false);//CHIEDERE A RICCARDO COME SI COPIANO LE LISTE(SPREED OP)
    }

    public static void generatoreNumeri() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero così da generare tot numeri casuali pari al numero digitato");
        int numeroElem = scanner.nextInt();
        TreeSet<Integer> numeriCasuali = new TreeSet<>();
        for (int i = 0; i < numeroElem; i++) {
            Random random = new Random();
            numeriCasuali.add(random.nextInt(100));
        }
        System.out.println(numeriCasuali);
    }

    public static void listaInversa(ArrayList<Integer> array) {
        List<Integer> listaInversa = new ArrayList<>();
        listaInversa = array.reversed();
        List<Integer> nuovaLista = new ArrayList<>();
        nuovaLista = array;
        nuovaLista.addAll(listaInversa);
        System.out.println(nuovaLista);
    }

    public static void booleanList(ArrayList<Integer> array, boolean valore) {
        if (valore) {
            System.out.println("elementi con posizioni pari");
            for (int i = 0; i < array.size(); i = i + 2) {
                System.out.println(array.get(i));
            }
        } else {
            System.out.println("elementi con posizioni dispari");
            for (int i = 1; i < array.size(); i = i + 2) {
                System.out.println(array.get(i));
            }
        }
    }

}
