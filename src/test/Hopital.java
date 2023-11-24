package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hopital {
    public Map<Medecin, List<Patient>> medecinPatients;

    public Hopital() {
        medecinPatients = new HashMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatients.put(m, new ArrayList<>());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatients.containsKey(m)) {
            List<Patient> patients = medecinPatients.get(m);
            patients.add(p);
            medecinPatients.put(m, patients);
        } else {
            List<Patient> patients = new ArrayList<>();
            patients.add(p);
            medecinPatients.put(m, patients);
        }
    }

    public void afficherMap() {
        medecinPatients.forEach((medecin, patients) -> {
            System.out.println("Medecin: " + medecin.getNom());
            patients.forEach(patient -> System.out.println("\tPatient: " + patient.getNom()));
        });
    }

    public void afficherMedcinPatients(Medecin m) {
        List<Patient> patientsDuMedecin = medecinPatients.getOrDefault(m, new ArrayList<>());

        List<Patient> filteredPatients = patientsDuMedecin.stream()
                .filter(patient -> patient.getNom().equalsIgnoreCase("mohamed"))
                .collect(Collectors.toList());

        System.out.println("Patients du médecin " + m.getNom() + " dont le nom est 'Mohamed':");
        filteredPatients.forEach(System.out::println);
    }
}
