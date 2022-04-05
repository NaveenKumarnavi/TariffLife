package com.navi.live.service.impl;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.navi.live.bean.MTariffLifeDetails;
import com.navi.live.repository.MTariffLifeDetailsRepository;
import com.navi.live.service.MTariffLifeDetailsService;


@Service
@Transactional
public class MTariffLifeDetailsServiceImpl implements MTariffLifeDetailsService {

	@Autowired
	private MTariffLifeDetailsRepository repository;

	private Logger log = LogManager.getLogger(MTariffLifeDetailsServiceImpl.class);

	@Override
	public List<MTariffLifeDetails> getAll() {
		List<MTariffLifeDetails> lst;

		try {
			lst = repository.findAll();

		} catch (Exception ex) {
			log.error(ex);
			return Collections.emptyList();
		}
		return lst;
	}

	@Override
	public Optional<MTariffLifeDetails> findByMtdId(BigDecimal mtdId) {

		return repository.findByMtdId(mtdId);
	}

	@Override
	public void saveorupdate(MTariffLifeDetails obj) {

		repository.saveAndFlush(obj);

	}

//	@Override
//	public Page<MTariffLifeDetails> findAll(String mtdMthId, Pageable paging) {
//
//		return repository.findByMtdMthId(mtdMthId, paging);
//	}
//
//	@Override
//	public Page<MTariffLifeDetails> findSearch(String mtdMthId, String search, Pageable paging) {
//
//		String sear = "%" + search + "%";
//
//		return repository.findAll(mtdMthId, sear, paging);
//	}

	@Override
	public Page<MTariffLifeDetails> findAll(BigDecimal mtdMthId, Pageable paging) {

		return repository.findByMtdMthId(mtdMthId, paging);
	}

	@Override
	public Page<MTariffLifeDetails> findSearch(BigDecimal mtdMthId, String search, Pageable paging) {

		String sear = "%" + search + "%";

		return repository.findAll(mtdMthId, sear, paging);
	}

}

