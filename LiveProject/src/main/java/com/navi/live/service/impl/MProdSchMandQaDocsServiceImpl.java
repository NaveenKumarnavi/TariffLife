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
//import com.navi.live.bean.MProdSchMandQaDocs;
//import com.navi.live.repository.MProdSchMandQaDocsRepository;
//import com.navi.live.service.MProdSchMandQaDocsService;
//
//
//
//@Service
//@Transactional
//public class MProdSchMandQaDocsServiceImpl implements MProdSchMandQaDocsService {
//
//	@Autowired
//	private MProdSchMandQaDocsRepository repository;
//
//	@Override
//	public Optional<MProdSchMandQaDocs> findById(BigDecimal psmSysId) {
//		// TODO Auto-generated method stub
//		return repository.findById(psmSysId);
//	}
//
//	@Override
//	public void saveorupdate(MProdSchMandQaDocs object) {
//		// TODO Auto-generated method stub
//
//		repository.saveAndFlush(object);
//
//	}
//
//	@Override
//	public Page<MProdSchMandQaDocs> findAll(String docId, Pageable paging) {
//		// TODO Auto-generated method stub
//		return repository.findByPsmDocId(docId, paging);
//	}
//
//	@Override
//	public Page<MProdSchMandQaDocs> findSearch(String docId, String search, Pageable paging) {
//
//		String sear = "%" + search + "%";
//		return repository.findSearch(docId, sear, paging);
//	}
//
//}
