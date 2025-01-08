// Definizione della classe Studente
public class Studente {
    // Attributi privati
    private String nome;
    private String cognome;
    private double voto;

    // Costruttore
    public Studente(String nome, String cognome, double voto) {
        this.nome = nome;
        this.cognome = cognome;
        this.voto = voto;
    }

    // Getter per il nome
    public String getNome() {
        return nome;
    }

    // Setter per il nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter per il cognome
    public String getCognome() {
        return cognome;
    }

    // Setter per il cognome
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    // Getter per il voto
    public double getVoto() {
        return voto;
    }

    // Setter per il voto
    public void setVoto(double voto) {
        if (voto >= 0 && voto <= 10) { // Validazione del voto
            this.voto = voto;
        } else {
            System.out.println("Errore: Il voto deve essere compreso tra 0 e 10.");
        }
    }

    // Metodo per stampare le informazioni dello studente
    public void stampaInformazioni() {
        System.out.println("Nome: " + nome + ", Cognome: " + cognome + ", Voto: " + voto);
    }
}

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Classe Tester per verificare la funzionalità della classe Studente
public class TesterStudente {
    public static void main(String[] args) {
        // Creazione di un oggetto Studente
        Studente studente1 = new Studente("Mario", "Rossi", 8.5);

        // Uso dei metodi getter
        System.out.println("Nome: " + studente1.getNome());
        System.out.println("Cognome: " + studente1.getCognome());
        System.out.println("Voto: " + studente1.getVoto());

        // Modifica degli attributi usando i setter
        studente1.setNome("Giulia");
        studente1.setCognome("Bianchi");
        studente1.setVoto(9.0);

        // Stampa delle informazioni aggiornate
        studente1.stampaInformazioni();

        // Esempio di validazione del voto
        studente1.setVoto(12); // Genererà un messaggio di errore
    }
}

