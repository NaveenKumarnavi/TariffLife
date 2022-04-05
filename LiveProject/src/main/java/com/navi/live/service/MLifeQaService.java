//package com.navi.live.service;
//
//import java.math.BigDecimal;
//import java.util.Optional;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//
//import com.navi.live.bean.MLifeQA;
//
//
//public interface MLifeQaService {
//
//
//	void saveorupdate(MLifeQA object);
//
//	Page<MLifeQA> findAll(Pageable paging);
//
//	Page<MLifeQA> findSearch(String search, Pageable paging);
//
//	Optional<MLifeQA> findByMlqQstCatgAndMlqQstCode(String mlqQstCatg, BigDecimal mlqQstCode);
//
//	Optional<MLifeQA> findByMlqSysId(BigDecimal mlqSysId);
//
//	Optional<MLifeQA> findByMlqQstCode(BigDecimal psaqQstCode);
//
//}
