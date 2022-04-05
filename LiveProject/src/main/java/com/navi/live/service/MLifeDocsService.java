//package com.navi.live.service;
//
//import java.math.BigDecimal;
//import java.util.Optional;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//
//import com.navi.live.bean.MLifeDocs;
//
//
//
//public interface MLifeDocsService {
//
//	public void saveorupdate(MLifeDocs mLifeDocs);
//
//	public Optional<MLifeDocs> findById(BigDecimal mldSysId);
//
//	public Page<MLifeDocs> findAll(Pageable paging);
//
//	public Page<MLifeDocs> findSearch(String search, Pageable paging);
//
//	public Optional<MLifeDocs> findByMldDocIdAndMldDocCatg(String mldDocId, String mldDocCatg);
//
//}
