//package com.navi.live.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//
//import com.navi.live.bean.MProdSchemes;
//
//
//public interface MProdSchemesService {
//
//	void saveorupdate(MProdSchemes object);
//
//	Page<MProdSchemes> findAll(String string, Pageable paging);
//
//	Page<MProdSchemes> findSearch(String string, String search, Pageable paging);
//
//	List<MProdSchemes> getAll();
//
//	Optional<MProdSchemes> findByPschSchemeCodeAndPschProdCodeAndPschCompCode(String pschSchemeCode,
//			String pschProdCode, String pschCompCode);
//
//}