//package com.navi.live.repository;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//
//import com.navi.live.bean.MProdSchemes;
//import com.navi.live.bean.MProdSchemesId;
//
//
//
//public interface MProdSchemesRepository
//extends JpaRepository<MProdSchemes, MProdSchemesId>, JpaSpecificationExecutor<MProdSchemes> {
//
//List<MProdSchemes> findByPschProdCode(String prodCode);
//
////Page<MProdSchemes> findByPschEffToDtGreaterThanAndPschProdCode(Date date, String string, Pageable paging);
//
////Page<MProdSchemes> findByPschEffToDtGreaterThanAndPschProdCodeAndPschSchemeCodeContainingIgnoreCaseOrPschSchemeNameContainingIgnoreCase(
////	Date date, String string, String search, String search2, Pageable paging);
//
//Page<MProdSchemes> findByPschProdCode(String string, Pageable paging);
//
//Page<MProdSchemes> findByPschProdCodeAndPschSchemeCodeContainingIgnoreCaseOrPschSchemeNameContainingIgnoreCase(
//	String string, String search, String search2, Pageable paging);
//
//Optional<MProdSchemes> findByPschSchemeCodeAndPschProdCodeAndPschCompCode(String pschSchemeCode, String pschProdCode,
//		String pschCompCode);
//
//Optional<MProdSchemes> findByPschCompCodeAndPschProdCodeAndPschSchemeCode(String psaqCompCode, String psaqProdCode,
//		String psaqSchFmCode);
//
//Optional<MProdSchemes> findByPschSchemeCode(String schCode);
//
//}
