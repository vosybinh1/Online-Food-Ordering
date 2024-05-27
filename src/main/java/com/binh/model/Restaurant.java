package com.binh.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne
	private User owner;

	private String name;

	private String description;

	private String cuisineType;

	@OneToOne
	private Address address;

	@Embedded
	private ContactInformation contactInformation;

	private String openingHours;

	@OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Order> orders = new ArrayList<>();

	@ElementCollection
	@Column(length = 1000)
	private List<String> images;

	private LocalDateTime registrationDate;

	private boolean open;

	@JsonIgnore
	@OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Food> foods = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public User getOwner() {
		return owner;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public Address getAddress() {
		return address;
	}

	public ContactInformation getContactInformation() {
		return contactInformation;
	}

	public String getOpeningHours() {
		return openingHours;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public List<String> getImages() {
		return images;
	}

	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	public boolean isOpen() {
		return open;
	}

	public List<Food> getFoods() {
		return foods;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}

	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}
}
