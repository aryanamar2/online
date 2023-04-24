package com.Clinic.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patients {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long patientId;
	
	@Column(name = "patient_name")
	private String patientName;
	
	@Column(name = "patient_email")
	private String patientEmail;

	public Long getId() {
		return patientId;
	}

	public void setId(Long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	@Override
	public String toString() {
		return "Patients [id=" + patientId + ", patientName=" + patientName + ", patientEmail=" + patientEmail + "]";
	}
	
	
}
