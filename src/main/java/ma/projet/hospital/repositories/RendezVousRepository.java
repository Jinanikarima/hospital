package ma.projet.hospital.repositories;

import ma.projet.hospital.entities.Patient;
import ma.projet.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,String> {
}
