package com.binh.model;

import lombok.Data;

@Data
public class ContactInformation {

	private String email;

	private String mobile;

	private String twitter;

	private String instagram;

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public String getTwitter() {
		return twitter;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
}
