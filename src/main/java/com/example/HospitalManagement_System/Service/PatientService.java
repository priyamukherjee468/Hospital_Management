package com.example.HospitalManagement_System.Service;

import com.example.HospitalManagement_System.Model.Patient;
import com.example.HospitalManagement_System.Repository.IPatientRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    IPatientRepo iPatientRepo;
    public String addPatient(Patient patient) {
        iPatientRepo.save(patient);
        return "patient added successfully";
    }

    public List<Patient> getPatient() {
        return iPatientRepo.findAll();
    }

    public String deletePatientById(Integer id) {
        iPatientRepo.deleteById(id);
        return "patient deleteed successfully";
    }

    @Transactional
    public String updatePatientById(Patient patient) {
        iPatientRepo.updatePatient(patient.getPatientId(),patient.getPatientName(),patient.getPatientEmail(),patient.getPatientPhoneNumber());
        return "patient updated successfully";
    }
}
