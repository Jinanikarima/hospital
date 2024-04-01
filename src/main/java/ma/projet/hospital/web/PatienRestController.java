package ma.projet.hospital.web;

import ma.projet.hospital.entities.Patient;
import ma.projet.hospital.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatienRestController {
    @Autowired
    private PatientRepository patientRepository;
@GetMapping("/patients")
    public List<Patient> patientList(){
        return patientRepository.findAll();
    }

}
