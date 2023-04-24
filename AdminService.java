package com.OnlineClinicSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineClinicSystem.Entity.Admin;
import com.OnlineClinicSystem.Repository.AdminRepository;

@Service
public class AdminService {

  @Autowired
  private AdminRepository adminRepository;

  public Admin saveAdmin(Admin admin) {
    return adminRepository.save(admin);
  }

  public Admin getAdminById(Long id) {
    return adminRepository.findById(id).orElse(null);
  }

  public Admin getAdminByUsername(String username) {
    return adminRepository.findByUsername(username);
  }

  public void deleteAdmin(Long id) {
    adminRepository.deleteById(id);
  }
}
