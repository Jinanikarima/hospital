package ma.projet.hospital.repositories;

import ma.projet.hospital.entities.Medecin;
import ma.projet.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin  findByNom(String nom);
}
