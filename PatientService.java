package com.OnlineClinicSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineClinicSystem.Entity.Patient;
import com.OnlineClinicSystem.Repository.PatientRepository;

@Service
public class PatientService {

  @Autowired
  private PatientRepository patientRepository;

  public Patient savePatient(Patient patient) {
    return patientRepository.save(patient);
  }

  public Patient getPatientById(Long id) {
    return patientRepository.findById(id).orElse(null);
  }

  public List<Patient> getAllPatients() {
    return patientRepository.findAll();
  }

  public List<Patient> getPatientsByDoctorId(Long doctorId) {
    return patientRepository.findByDoctorId(doctorId);
  }

  public void deletePatient(Long id) {
    patientRepository.deleteById(id);
  }

  public Patient updatePatientProfileInfo(Patient updatedPatient) {
    Patient patient = patientRepository.findById(updatedPatient.getId()).orElse(null);

    if (patient != null) {
      patient.setName(updatedPatient.getName());
      patient.setAge(updatedPatient.getAge());
      patient.setGender(updatedPatient.getGender());
      patient.setEmail(updatedPatient.getEmail());
      patient.setPhoneNumber(updatedPatient.getPhoneNumber());

      return patientRepository.save(patient);
    } else {
      return null;
    }
  }

  public Patient updatePatientPassword(Long patientId, String newPassword) {
    Patient patient = patientRepository.findById(patientId).orElse(null);

    if (patient != null) {
      patient.setPassword(newPassword);

      return patientRepository.save(patient);
    } else {
      return null;
    }
  }
}