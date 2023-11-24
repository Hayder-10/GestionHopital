package test;

public class Main {
    public static void main(String[] args) {
       
        Patient patient1 = new Patient(100, "Leith", "Bendaya", 111);
        Patient patient2 = new Patient(200, "Mohamed", "Bentourkia", 222);

        ListPatients listePatients = new ListPatients();
        listePatients.ajouterPatient(patient1);
        listePatients.ajouterPatient(patient2);
        listePatients.afficherPatients();

        // Test de la classe Medecin
        Medecin medecin1 = new Medecin(300, "Karim", "BenAmor", 333);
        Medecin medecin2 = new Medecin(400, "Ahmed", "BenAyed", 444);

        // Test de la classe SetMedecins
        SetMedecins setMedecins = new SetMedecins();
        setMedecins.ajouterMedecin(medecin1);
        setMedecins.ajouterMedecin(medecin2);
        System.out.println("Nombre de médecins : " + setMedecins.nombreMedecins());

        // Test de la classe Hopital
        Hopital hopital = new Hopital();
        hopital.ajouterMedecin(medecin1);
        hopital.ajouterPatient(medecin1, patient1);
        hopital.ajouterPatient(medecin1, patient2);
        hopital.afficherMap();
        hopital.afficherMedcinPatients(medecin1);
    }
}
