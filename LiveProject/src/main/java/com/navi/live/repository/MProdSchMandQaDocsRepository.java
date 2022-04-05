//package com.navi.live.repository;
//
//import java.math.BigDecimal;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import com.navi.live.bean.MProdSchMandQaDocs;
//
//
//
//public interface MProdSchMandQaDocsRepository
//extends JpaRepository<MProdSchMandQaDocs, BigDecimal>, JpaSpecificationExecutor<MProdSchMandQaDocs> {
//
//Page<MProdSchMandQaDocs> findByPsmDocId(String docId, Pageable paging);
//
//@Query(value = "select * from M_PROD_SCH_MAND_QA_DOCS where PSM_DOC_ID=:docId or Upper(concat(PSM_DOC_CATG,PSM_DOC_ID)) Like Upper(:sear)", nativeQuery = true)
//Page<MProdSchMandQaDocs> findSearch(@Param("docId") String docId, @Param("sear") String sear, Pageable paging);
//
//}
//
