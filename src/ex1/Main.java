package ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            HashSet<String> paroleSet = new HashSet<String>();
            ArrayList<String> paroleScartate = new ArrayList<String>();
            System.out.println("inserisci un numero intero che rappresenti il numero di elementi da inserire");
            int numeroElem = scanner.nextInt();
            scanner.nextLine();
            System.out.println("inserisci " + numeroElem + " parole da inserire dentro l'array di tipo Set");
            for (int i = 0; i < numeroElem; i++) {
                System.out.println("inserisci parola numero" + (i + 1));
                String parola = scanner.nextLine();
                if (paroleSet.contains(parola)) {
                    System.out.println("questa parola è già presente all'interno di SET");
                    paroleScartate.add(parola);
                } else {
                    paroleSet.add(parola);
                }
            }
            System.out.println("Le parole inserite sono: " + paroleSet);
            System.out.println("il numero di parole inserite è: " + paroleSet.size());
            System.out.println("le parole scartate in quanto duplicate sono: " + paroleScartate);
        } catch (Exception e) {
            System.out.println("Errore inatteso: " + e.getMessage());
        }
    }
}
