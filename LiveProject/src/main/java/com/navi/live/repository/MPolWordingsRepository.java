//package com.navi.live.repository;
//
//import java.math.BigDecimal;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//
//import com.navi.live.bean.MPolWordings;
//import com.navi.live.bean.MPolWordingsId;
//
//
//public interface MPolWordingsRepository
//		extends JpaRepository<MPolWordings, MPolWordingsId>, JpaSpecificationExecutor<MPolWordings> {
//
//	Page<MPolWordings> findByPwProductCode(String code, Pageable paging);
//
//	List<MPolWordings> findByPwProductCode(String pwProductCode);
//
//	Optional<MPolWordings> findByPwSysId(BigDecimal pwSysId);
//
//}
