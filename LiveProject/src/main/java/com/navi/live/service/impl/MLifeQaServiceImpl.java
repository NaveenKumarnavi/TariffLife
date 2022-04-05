//package com.navi.live.service.impl;
//
//import java.math.BigDecimal;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.navi.live.bean.MLifeQA;
//import com.navi.live.repository.MLifeQaRepository;
//import com.navi.live.service.MLifeQaService;
//
//
//
//@Service
//@Transactional
//public class MLifeQaServiceImpl implements MLifeQaService {
//
//	@Autowired
//	private MLifeQaRepository repository;
//
//
//	@Override
//	public void saveorupdate(MLifeQA object) {
//
//		repository.saveAndFlush(object);
//
//	}
//
//	@Override
//	public Page<MLifeQA> findAll(Pageable paging) {
//
//		return repository.findAll(paging);
//	}
//
//	@Override
//	public Page<MLifeQA> findSearch(String search, Pageable paging) {
//
//		String sear = "%" + search + "%";
//
//		return repository.findBySearch(sear, paging);
//
//	}
//
//	@Override
//	public Optional<MLifeQA> findByMlqQstCatgAndMlqQstCode(String mlqQstCatg, BigDecimal mlqQstCode) {
//
//		return repository.findByMlqQstCatgAndMlqQstCode(mlqQstCatg,mlqQstCode);
//	}
//
//	@Override
//	public Optional<MLifeQA> findByMlqSysId(BigDecimal mlqSysId) {
//	
//		return repository.findByMlqSysId(mlqSysId);
//	}
//
//	@Override
//	public Optional<MLifeQA> findByMlqQstCode(BigDecimal psaqQstCode) {
//	
//		return repository.findByMlqQstCode(psaqQstCode);
//	}
//
//}