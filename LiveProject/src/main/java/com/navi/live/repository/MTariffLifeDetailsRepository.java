package com.navi.live.repository;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.navi.live.bean.MTariffLifeDetails;


public interface MTariffLifeDetailsRepository
		extends JpaRepository<MTariffLifeDetails, BigDecimal>, JpaSpecificationExecutor<MTariffLifeDetails> {

	Optional<MTariffLifeDetails> findByMtdId(BigDecimal mtdId);

	@Query(value = "select * from M_TARIFF_LIFE_DETAILS where MTD_MTH_ID=:mtdMthId or upper(concat(MTD_ID,MTD_MTH_ID)) like upper(:search)", nativeQuery = true)
	Page<MTariffLifeDetails> findAll(@Param("mtdMthId") BigDecimal mtdMthId, String sear, Pageable paging);

	Page<MTariffLifeDetails> findByMtdMthId(BigDecimal mtdMthId, Pageable paging);

}