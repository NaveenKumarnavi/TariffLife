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
//import com.navi.live.bean.MProdSchApplLifeQa;
//import com.navi.live.repository.MProdSchApplLifeQaRepository;
//import com.navi.live.service.MProdSchApplLifeQaService;
//
//
//
//@Service
//@Transactional
//public class MProdSchApplLifeQaServiceImpl implements MProdSchApplLifeQaService {
//
//	@Autowired
//	private MProdSchApplLifeQaRepository repository;
//
//	@Override
//	public Optional<MProdSchApplLifeQa> findById(BigDecimal psaqSysId) {
//		// TODO Auto-generated method stub
//		return repository.findById(psaqSysId);
//	}
//
//	@Override
//	public void saveorupdate(MProdSchApplLifeQa object) {
//		// TODO Auto-generated method stub
//
//		repository.saveAndFlush(object);
//
//	}
//
//	@Override
//	public Page<MProdSchApplLifeQa> findAll(BigDecimal string, Pageable paging) {
//		// TODO Auto-generated method stub
//		return repository.findByPsaqQstCode(string, paging);
//	}
//
//	@Override
//	public Page<MProdSchApplLifeQa> findSearch(BigDecimal string, String search, Pageable paging) {
//
//		String sear = "%" + search + "%";
//
//		return repository.findSearch(string, sear, paging);
//	}
//
//}
