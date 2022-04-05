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
//import com.navi.live.bean.MLifeQA;
//
//
//
//public interface MLifeQaRepository extends JpaRepository<MLifeQA, BigDecimal>, JpaSpecificationExecutor<MLifeQA> {
//
//	@Query(value = "select * from M_Life_Qa where upper(concat(concat(concat(concat(concat(MLQ_QST_CATG,MLQ_QST_CODE),MLQ_QST_DESC),MLQ_QST_LONG_DESC),MLQ_EFF_FM_DT),MLQ_EFF_TO_DT)) Like Upper(:sear)", nativeQuery = true)
//	Page<MLifeQA> findBySearch(@Param("sear") String sear, Pageable paging);
//
//	Optional<MLifeQA> findByMlqQstCatgAndMlqQstCode(String mlqQstCatg, BigDecimal mlqQstCode);
//
//	Optional<MLifeQA> findByMlqSysId(BigDecimal mlqSysId);
//
//	Optional<MLifeQA> findByMlqQstCode(BigDecimal psaqQstCode);
//
//}
