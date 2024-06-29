package com.projectE.projectE.model;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	@Column(name  = "PRODUCT_NAME")
	private String productName;
	@Column(name  = "DESCRIPTION")
	private String description;
	@Column(name  = "CATEGORY")
	private String category;
	@Column(name  = "MODEL_NUMBER")
	private String modelNumber;
	@Column(name  = "RELEASE_DATE")
	private Instant releaseDate;
	@Column(name  = "WEIGHT")
	private double weight;
	@Column(name  = "COLOR")
	private String color;
	@Column(name  = "WARRENTY")
	private String warrenty;
	
	
}
