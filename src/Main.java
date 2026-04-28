public class Main {

	public static void main(String args[]) {
		Telecommande t = new Telecommande();

		Lampe l1 = new Lampe("Lampe1");
		t.ajouterA(l1);

		/****** A COMPLETER ******/
		// Ajout d'une deuxième lampe pour varier
		t.ajouterA(new Lampe("Lampe2"));

		// Ajout de la Hifi
		t.ajouterA(new Hifi());

		// Ajout de la Cheminee via son adaptateur
		t.ajouterA(new AdapterCheminee(new Cheminee()));

		// TelecommandeGraphique utilisera le getNombre() de t pour dessiner la grille
		TelecommandeGraphique tg = new TelecommandeGraphique(t);
	}
}