package com.projectE.projectE.service.impl;

import java.time.Instant;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectE.projectE.model.EDetails;
import com.projectE.projectE.repository.Store;
import com.projectE.projectE.service.EService;

@Service
public class EServiceImpl implements EService{
	
	@Autowired
	private Store store;

	@Override
	public long saveProduct(EDetails eDetails) {
		EDetails details = eDetails.builder()
				.productName(eDetails.getProductName())
				.description(eDetails.getDescription())
				.category(eDetails.getCategory())
				.modelNumber(eDetails.getModelNumber())
				.releaseDate(Instant.now())
				.weight(eDetails.getWeight())
				.color(eDetails.getColor())
				.warrenty(eDetails.getWarrenty())
				.build();
		
		store.save(details);
		return details.getProductId();
	}

}
