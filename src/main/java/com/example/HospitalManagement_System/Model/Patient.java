package com.example.HospitalManagement_System.Model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer patientId;
    @NotNull
    @Size(min = 2)
    String patientName;
    @NotNull
    String patientCity;
    @Email
    String patientEmail;
    @NotNull
    @Size(min = 10,max = 10)
    String patientPhoneNumber;
    String symptom;
    @OneToOne
    @JoinColumn(name = "doctor_doctor_Id",nullable = false)
    private Doctor doctor;
}
