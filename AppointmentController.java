package com.OnlineClinicSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.OnlineClinicSystem.Entity.Appointment;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {

    private Appointment appointmentService;
    
	public AppointmentController(Appointment appointmentService) {
		this.appointmentService = appointmentService;
	}
	

	// Controller method for displaying the book appointment form
    @GetMapping("/book")
    public String showBookAppointmentForm(Model model) {
        Appointment appointment = new Appointment();
        model.addAttribute("appointment", appointment);
        return "bookAppointment";
    }

    // Controller method for handling the book appointment form submission
    @PostMapping("/book")
    public String bookAppointment(@ModelAttribute("appointment") Appointment appointment, Model model) {
        appointmentService.bookAppointment(appointment);
        model.addAttribute("message", "Appointment booked successfully!");
        return "bookAppointment";
    }

    // Controller method for displaying the delete appointment form
    @GetMapping("/delete")
    public String showDeleteAppointmentForm(Model model) {
        Appointment appointment = new Appointment();
        model.addAttribute("appointment", appointment);
        return "deleteAppointment";
    }

    // Controller method for handling the delete appointment form submission
    @PostMapping("/delete")
    public String deleteAppointment(@ModelAttribute("appointment") Appointment appointment, Model model) {
        appointmentService.deleteAppointment(appointment);
        model.addAttribute("message", "Appointment deleted successfully!");
        return "deleteAppointment";
    }

}
