package com.navi.live.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.navi.live.bean.MTariffLifeDetails;



public interface MTariffLifeDetailsService {

	List<MTariffLifeDetails> getAll();

	Optional<MTariffLifeDetails> findByMtdId(BigDecimal mtdId);

	void saveorupdate(MTariffLifeDetails obj);

//	Page<MTariffLifeDetails> findAll(String mtdMthId, Pageable paging);
//
//	Page<MTariffLifeDetails> findSearch(String mtdMthId, String search, Pageable paging);

	Page<MTariffLifeDetails> findAll(BigDecimal convertBigDecimal, Pageable paging);

	Page<MTariffLifeDetails> findSearch(BigDecimal convertBigDecimal, String search, Pageable paging);

}
