//package com.navi.live.service.impl;
//
//import java.util.Date;
//import java.util.List;
//import java.util.Optional;
//
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.navi.live.bean.MProdSchemes;
//import com.navi.live.repository.MProdSchemesRepository;
//import com.navi.live.service.MProdSchemesService;
//
//
//
//
//@Service
//@Transactional
//public class MProdSchemesServiceImpl implements MProdSchemesService {
//
//	@Autowired
//	private MProdSchemesRepository repository;
//
//	Date date = new Date();
//
//	private Logger log = LogManager.getLogger(MProdSchemesServiceImpl.class);
//
//	@Override
//	public void saveorupdate(MProdSchemes object) {
//
//		repository.saveAndFlush(object);
//
//	}
//
//	@Override
//	public Page<MProdSchemes> findAll(String string, Pageable paging) {
//
////		return repository.findByPschEffToDtGreaterThanAndPschProdCode(date, string, paging);
//		return repository.findByPschProdCode(string, paging);
//
//	}
//
//	@Override
//	public Page<MProdSchemes> findSearch(String string, String search, Pageable paging) {
//
////		return repository
////				.findByPschEffToDtGreaterThanAndPschProdCodeAndPschSchemeCodeContainingIgnoreCaseOrPschSchemeNameContainingIgnoreCase(
////						date, string, search, search, paging);
//
//		return repository.findByPschProdCodeAndPschSchemeCodeContainingIgnoreCaseOrPschSchemeNameContainingIgnoreCase(
//				string, search, search, paging);
//	}
//
//	@Override
//	public List<MProdSchemes> getAll() {
//
//		return repository.findAll();
//	}
//
//	@Override
//	public Optional<MProdSchemes> findByPschSchemeCodeAndPschProdCodeAndPschCompCode(String pschSchemeCode,
//			String pschProdCode, String pschCompCode) {
//		return repository.findByPschSchemeCodeAndPschProdCodeAndPschCompCode(pschSchemeCode,pschProdCode,pschCompCode);
//	}
//
//}
