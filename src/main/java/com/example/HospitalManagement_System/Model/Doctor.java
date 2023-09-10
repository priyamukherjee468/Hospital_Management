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
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer doctorId;
@NotNull

    String doctorName;

    String doctorCity;
    @Email
    String email;
    @NotNull
    @Size(min = 10,max = 10)
    String phoneNumber;
    @Enumerated(value = EnumType.STRING)
    Speciality speciality;
}
