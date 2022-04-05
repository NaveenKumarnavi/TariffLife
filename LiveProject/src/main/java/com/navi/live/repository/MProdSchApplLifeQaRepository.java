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
//import com.navi.live.bean.MProdSchApplLifeQa;
//
//
//
//public interface MProdSchApplLifeQaRepository
//extends JpaRepository<MProdSchApplLifeQa, BigDecimal>, JpaSpecificationExecutor<MProdSchApplLifeQa> {
//
//@Query(value = "select * from M_Prod_Sch_appl_life_qa where PSAQ_QST_CODE=:code or upper(concat(concat(concat(PSAQ_LEVEL,PSAQ_QST_CODE),PSAQ_EFF_FM_DT),PSAQ_EFF_TO_DT)) Like Upper(:sear)", nativeQuery = true)
//Page<MProdSchApplLifeQa> findSearch(@Param("code") BigDecimal code, @Param("sear") String search, Pageable paging);
//
//Page<MProdSchApplLifeQa> findByPsaqQstCode(BigDecimal string, Pageable paging);
//
//}