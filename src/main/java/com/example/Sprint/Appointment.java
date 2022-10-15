package com.example.Sprint;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Appointment {
    @Id
	private long appointmentId;
	private String location;
	private String visitType;
	private LocalDate preferredDate;
	private LocalTime preferredTime;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "serviceName")
	private SalonService salonService;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "userId")
	private Customer customer;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="paymentId")
	private Payment payment;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(long appointmentId, String location, String visitType, LocalDate preferredDate,
			LocalTime preferredTime, SalonService salonService, Customer customer, Payment payment) {
		super();
		this.appointmentId = appointmentId;
		this.location = location;
		this.visitType = visitType;
		this.preferredDate = preferredDate;
		this.preferredTime = preferredTime;
		this.salonService = salonService;
		this.customer = customer;
		this.payment = payment;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getVisitType() {
		return visitType;
	}
	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}
	public LocalDate getPreferredDate() {
		return preferredDate;
	}
	public void setPreferredDate(LocalDate preferredDate) {
		this.preferredDate = preferredDate;
	}
	public LocalTime getPreferredTime() {
		return preferredTime;
	}
	public void setPreferredTime(LocalTime preferredTime) {
		this.preferredTime = preferredTime;
	}
	public SalonService getSalonService() {
		return salonService;
	}
	public void setSalonService(SalonService salonService) {
		this.salonService = salonService;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", location=" + location + ", visitType=" + visitType
				+ ", preferredDate=" + preferredDate + ", preferredTime=" + preferredTime + ", salonService="
				+ salonService + ", customer=" + customer + ", payment=" + payment + "]";
	}
	
	
	
}
