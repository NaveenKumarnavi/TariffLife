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
//import com.navi.live.bean.MLifeDocs;
//import com.navi.live.repository.MLifeDocsRepository;
//import com.navi.live.service.MLifeDocsService;
//
//
//
//@Service
//@Transactional
//public class MLifeDocsServiceImpl implements MLifeDocsService {
//
//	@Autowired
//	private MLifeDocsRepository repository;
//
//	@Override
//	public void saveorupdate(MLifeDocs mLifeDocs) {
//
//		repository.saveAndFlush(mLifeDocs);
//
//	}
//
//	@Override
//	public Optional<MLifeDocs> findById(BigDecimal mldSysId) {
//
//		return repository.findById(mldSysId);
//	}
//
//	@Override
//	public Page<MLifeDocs> findAll(Pageable paging) {
//		return repository.findAll(paging);
//	}
//
//	@Override
//	public Page<MLifeDocs> findSearch(String search, Pageable paging) {
//		String sear = "%" + search + "%";
//		return repository.findSearch(sear, paging);
//	}
//
//	@Override
//	public Optional<MLifeDocs> findByMldDocIdAndMldDocCatg(String mldDocId, String mldDocCatg) {
//		
//		return repository.findByMldDocIdAndMldDocCatg(mldDocId,mldDocCatg);
//	}
//
//}