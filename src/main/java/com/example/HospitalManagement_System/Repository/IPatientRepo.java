package com.example.HospitalManagement_System.Repository;

import com.example.HospitalManagement_System.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientRepo extends JpaRepository<Patient,Integer> {
    @Modifying
    @Query(value = "update patient set patient_Name =:patientName , patient_Email =:patientEmail , patient_Phone_Number =:patientPhoneNumber where patient_id =:patientId",nativeQuery = true)
    void updatePatient(Integer patientId, String patientName, String patientEmail, String patientPhoneNumber);
}
