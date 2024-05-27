package com.binh.dto;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class RestaurantDto {

	private String title;

	@Column(length = 1000)
	private List<String> images;

	private String desciption;

	private Long id;

	public String getTitle() {
		return title;
	}

	public List<String> getImages() {
		return images;
	}

	public String getDesciption() {
		return desciption;
	}

	public Long getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
