//package com.navi.live.repository;
//
//import java.math.BigDecimal;
//import java.util.Optional;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import com.navi.live.bean.MLifeDocs;
//
//
//
//public interface MLifeDocsRepository extends JpaRepository<MLifeDocs, BigDecimal>, JpaSpecificationExecutor<MLifeDocs> {
//
//	@Query(value = "select * from M_Life_Docs where upper(concat(concat(MLD_DOC_CATG,MLD_DOC_ID),MLD_DOC_DESC)) Like Upper(:sear)", nativeQuery = true)
//	Page<MLifeDocs> findSearch(@Param("sear") String sear, Pageable paging);
//
//	Optional<MLifeDocs> findByMldSysId(String mldDocId);
//
//	Optional<MLifeDocs> findByMldDocIdAndMldDocCatg(String mldDocId, String mldDocCatg);
//
//}