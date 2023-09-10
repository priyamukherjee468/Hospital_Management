package com.example.HospitalManagement_System.Service;

import com.example.HospitalManagement_System.Model.Doctor;
import com.example.HospitalManagement_System.Repository.IDoctorRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    IDoctorRepo iDoctorRepo;
    public String saveDoctor(Doctor doctor) {
        iDoctorRepo.save(doctor);
        return "Doctor added successfully!!";
    }

    public List<Doctor> getDoctorAll() {
        return iDoctorRepo.findAll();
    }

    @Transactional
    public String deleteDoctorById(Integer id) {
        iDoctorRepo.deleteAllById(id);
        return "Doctor deleted successfully!!";
    }

    @Transactional
    public String updateDoctorById(Doctor doctor) {
        iDoctorRepo.updateDoctor(doctor.getDoctorId(),doctor.getDoctorName(),doctor.getEmail(),doctor.getPhoneNumber());
        return "Doctor Updated successfully!!";
    }
}
