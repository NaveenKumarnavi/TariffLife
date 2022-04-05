//package com.navi.live.service;
//
//import java.math.BigDecimal;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//
//import com.navi.live.bean.MPolWordings;
//
//
//public interface MPolWordingsService {
//
//	MPolWordings create(MPolWordings d);
//
//	MPolWordings update(MPolWordings d);
//
////MPolWordings getOne(long id) ;
//	List<MPolWordings> getAll();
//
//	long getTotal();
//
////boolean delete(long id);
//	List<MPolWordings> findByPwProductCode(String pwProductCode);
//
//	Optional<MPolWordings> findByPwSysId(BigDecimal pwSysId);
//
//	public void saveorupdate(MPolWordings object);
//
//	Page<MPolWordings> findAll(String code, Pageable paging);
//
//	Page<MPolWordings> findSearch(String code, String search, Pageable paging);
//
//}
//
