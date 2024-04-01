package ma.projet.hospital.repositories;

import ma.projet.hospital.entities.Consultation;
import ma.projet.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
