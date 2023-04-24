package com.OnlineClinicSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.OnlineClinicSystem.Entity.User;
import com.OnlineClinicSystem.Service.UserService;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private UserService userService;

    // Controller method for displaying the update profile form
    @GetMapping("/update")
    public String showUpdateProfileForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "updateProfile";
    }

    // Controller method for handling the update profile form submission
    @PostMapping("/update")
    public String updateProfile(@ModelAttribute("user") User user, Model model) {
        userService.updateUser(user);
        model.addAttribute("message", "Profile updated successfully!");
        return "updateProfile";
    }

    // Controller method for displaying the update password form
    @GetMapping("/password")
    public String showUpdatePasswordForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "updatePassword";
    }

    // Controller method for handling the update password form submission
    @PostMapping("/password")
    public String updatePassword(@ModelAttribute("user") User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "updatePassword";
        }

        String newPassword = user.getNewPassword();
        String confirmPassword = user.getConfirmPassword();

        if (!newPassword.equals(confirmPassword)) {
            model.addAttribute("error", "New password and confirm password must match!");
            return "updatePassword";
        }

        userService.updatePassword(user);
        model.addAttribute("message", "Password updated successfully!");
        return "updatePassword";
    }
}