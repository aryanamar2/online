package com.OnlineClinicSystem.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.OnlineClinicSystem.Entity.User;
import com.OnlineClinicSystem.Repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void updatePassword(User user) {
		// TODO Auto-generated method stub
		
	}
}
