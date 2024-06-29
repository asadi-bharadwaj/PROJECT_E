package com.projectE.projectE.service;

import com.projectE.projectE.model.EDetails;

public interface EService {

	long saveProduct(EDetails eDetails);

	EDetails getDetails(Long productId);

	

}
