package ma.projet.hospital.service;

import ma.projet.hospital.entities.Consultation;
import ma.projet.hospital.entities.Medecin;
import ma.projet.hospital.entities.Patient;
import ma.projet.hospital.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
