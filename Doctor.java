package com.Clinic.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "doctor_name")
	private String doctorName;
	
	@Column(name = "doctor_email")
	private String doctorEmail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorEmail() {
		return doctorEmail;
	}

	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorName=" + doctorName + ", doctorEmail=" + doctorEmail + "]";
	}
	
	
}
