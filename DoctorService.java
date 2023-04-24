package com.OnlineClinicSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineClinicSystem.Entity.Doctor;
import com.OnlineClinicSystem.Repository.DoctorRepository;

@Service
public class DoctorService {

  @Autowired
  private DoctorRepository doctorRepository;

  public Doctor saveDoctor(Doctor doctor) {
    return doctorRepository.save(doctor);
  }

  public Doctor getDoctorById(Long id) {
    return doctorRepository.findById(id).orElse(null);
  }

  public List<Doctor> getAllDoctors() {
    return doctorRepository.findAll();
  }

  public void deleteDoctor(Long id) {
    doctorRepository.deleteById(id);
  }

  public Doctor updateDoctorProfileInfo(Doctor updatedDoctor) {
    Doctor doctor = doctorRepository.findById(updatedDoctor.getId()).orElse(null);

    if (doctor != null) {
      doctor.setName(updatedDoctor.getName());
      doctor.setSpecialization(updatedDoctor.getSpecialization());
      doctor.setEmail(updatedDoctor.getEmail());
      doctor.setPhoneNumber(updatedDoctor.getPhoneNumber());

      return doctorRepository.save(doctor);
    } else {
      return null;
    }
  }

  public Doctor updateDoctorPassword(Long doctorId, String newPassword) {
    Doctor doctor = doctorRepository.findById(doctorId).orElse(null);

    if (doctor != null) {
      doctor.setPassword(newPassword);

      return doctorRepository.save(doctor);
    } else {
      return null;
    }
  }
}
