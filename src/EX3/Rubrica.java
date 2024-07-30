package EX3;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {
    public static void main(String[] args) {
        HashMap<String, String> rubrica = new HashMap<>();
        aggiungiC(rubrica, "Arianna", "1111");
        aggiungiC(rubrica, "Diego", "2222");
        aggiungiC(rubrica, "Gabriel", "3333");
        aggiungiC(rubrica, "Yuri", "4444");
        System.out.println("la tua rubrica contiene i seguenti contatti: " + rubrica);
        rimuoviC(rubrica, "Diego");
        getContatto(rubrica, "Arianna");
        getNome(rubrica, "3333");
        getRubrica(rubrica);


    }

    public static void aggiungiC(HashMap<String, String> lista, String Nome, String numero) {
        lista.put(Nome, numero);
        System.out.println("contatto aggiunto con successo! " + lista);
    }

    public static void rimuoviC(HashMap<String, String> lista, String Nome) {
        lista.remove(Nome);
        System.out.println("il contatto è stato rimosso: " + Nome);
        System.out.println("la tua rubrica è stata aggiornata: " + lista);
    }

    public static void getContatto(HashMap<String, String> lista, String Nome) {
        lista.get(Nome);
        System.out.println("il numero di Arianna è: " + lista.get(Nome));
    }

    public static void getNome(HashMap<String, String> lista, String numero) {
        for (Map.Entry<String, String> entry : lista.entrySet()) {
            if (entry.getValue().equals(numero)) {
                System.out.println("Il nome associato al numero " + numero + " è: " + entry.getKey());
                return;
            }
        }
        System.out.println("Numero " + numero + " non trovato nella rubrica.");
    }

    public static void getRubrica(HashMap<String, String> lista) {
        System.out.println("la tua rubrica contiene i seguenti contatti: " + lista);
    }
}
