package com.example.HospitalManagement_System.Controller;

import com.example.HospitalManagement_System.Model.Patient;
import com.example.HospitalManagement_System.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/addPatient")
    public String addPatient(@RequestBody Patient patient){
        return patientService.addPatient(patient);
    }
    @GetMapping("/getPatient")
    public List<Patient> getPatient(){
        return patientService.getPatient();
    }
    @DeleteMapping("/deletePatientById/{id}")
    public String deletePatientById(@PathVariable Integer id){
        return patientService.deletePatientById(id);
    }
    @PutMapping("/updatePatientById")
    public String updatePatientById(@RequestBody Patient patient){
        return patientService.updatePatientById(patient);
    }
}
