//package com.navi.live.validator;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//import javax.security.auth.Subject;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.navi.live.bean.MProdSchemes;
//import com.navi.live.dto.MProdSchemesDto;
//import com.navi.live.handler.ObjectInvalidException;
//import com.navi.live.service.MProdSchemesService;
//import com.navi.live.util.ValidationUtil;
//
//import lombok.AllArgsConstructor;
//import lombok.NonNull;
//
//@Service
//@AllArgsConstructor(onConstructor_ = { @Autowired })
//public class MProdSchemeValidator {
//
//	List<String> errors = null;
//	List<String> errorsObj = null;
//	Optional<Subject> subject = null;
//
//	private @NonNull MProdSchemesService mProdSchemesService;
//
//	public ValidationResult validate(MProdSchemesDto request) {
//
//		errors = new ArrayList<>();
//		MProdSchemes mprodsch = null;
//
//		if (ValidationUtil.isNull(request.getPschSchemeCode())) {
//			throw new ObjectInvalidException("Scheme Code required");
//		}
//		else if (ValidationUtil.isValidLength(request.getPschSchemeCode(), 12)) {
//			throw new ObjectInvalidException("Scheme Code length should be 12");
//		} else {
//			request.setPschSchemeCode(request.getPschSchemeCode());
//		}
//		
//		if (ValidationUtil.isNull(request.getPschProdCode())) {
//			throw new ObjectInvalidException("Prod  Code required");
//		}
//		else if (ValidationUtil.isValidLength(request.getPschProdCode(), 12)) {
//			throw new ObjectInvalidException("Prod Code length should be 12");
//		} else {
//			request.setPschProdCode(request.getPschProdCode());
//		}
//		
//		if(ValidationUtil.isNull(request.getPschCompCode()))
//		{
//			throw new ObjectInvalidException("Company Code required");
//		}
//		else if (ValidationUtil.isValidLength(request.getPschCompCode(), 12)) {
//			throw new ObjectInvalidException("Company Code length should be 12");
//		} else {
//			request.setPschCompCode(request.getPschCompCode());
//		}
//	
//		
//		Optional<MProdSchemes> lobOptional = mProdSchemesService.findByPschSchemeCodeAndPschProdCodeAndPschCompCode(request.getPschSchemeCode()
//				,request.getPschProdCode(),request.getPschCompCode());
//
//		if (lobOptional.isPresent()) {
//
//			mprodsch = lobOptional.get();
//		}
//		
//		
//
//		if (ValidationUtil.isValidLength(request.getPschSepDiscEntryYn(), 1)) {
//			errors.add("PschSepDiscEnter length should be 1");
//		}else if (ValidationUtil.isValidYesOrNo(request.getPschSepDiscEntryYn())) {
//			errors.add("PschSepDiscEnter the Value 0 or 1");
//		} else {
//			request.setPschSepDiscEntryYn(request.getPschSepDiscEntryYn());
//		}
//
//		if (ValidationUtil.isValidLength(request.getPschSepFeesEntryYn(), 1)) {
//			errors.add("PschSepFeesEnter length should be 1");
//		}else if (ValidationUtil.isValidYesOrNo(request.getPschSepFeesEntryYn())) {
//			errors.add("PschSepFeesEnter the Value 0 or 1");
//		} else {
//			request.setPschSepFeesEntryYn(request.getPschSepFeesEntryYn());
//		}
//		
//		if (ValidationUtil.isValidLength(request.getPschSepTaxEntryYn(), 1)) {
//			errors.add("PschSepTaxEnter length should be 1");
//		}else if (ValidationUtil.isValidYesOrNo(request.getPschSepTaxEntryYn())) {
//			errors.add("PschSepTaxEnter the Value 0 or 1");
//		} else {
//			request.setPschSepTaxEntryYn(request.getPschSepTaxEntryYn());
//		}
//		
//		if (ValidationUtil.isValidLength(request.getPschSepLoadEntryYn(), 1)) {
//			errors.add("PschSepLoadEnter length should be 1");
//		}else if (ValidationUtil.isValidYesOrNo(request.getPschSepLoadEntryYn())) {
//			errors.add("PschSepLoadEnter the Value 0 or 1");
//		} else {
//			request.setPschSepLoadEntryYn(request.getPschSepLoadEntryYn());
//		}
//		
//		if (ValidationUtil.isValidLength(request.getPschSepPremEntryYn(), 1)) {
//			errors.add("PschSepPremEnter length should be 1");
//		}else if (ValidationUtil.isValidYesOrNo(request.getPschSepPremEntryYn())) {
//			errors.add("PschSepPremEnter the Value 0 or 1");
//		} else {
//			request.setPschSepPremEntryYn(request.getPschSepPremEntryYn());
//		}
//		
//		if (ValidationUtil.isGreaterThan(request.getPschEffFmDt(), request.getPschEffToDt())) {
//			errors.add("Effective From Date is Greater than Effective Till Date");
//		}
//		
//		if (ValidationUtil.isValidLength(request.getPschSchemeName(), 240)) {
//			errors.add("Psch Scheme name  length should be 240");
//		} else {
//			request.setPschSchemeName(request.getPschSchemeName());
//		}
//		
//		if (ValidationUtil.isValidLength(request.getPschSchemeNameBl(), 240)) {
//			errors.add("Psch Scheme name Bl length should be 240");
//		} else {
//			request.setPschSchemeNameBl(request.getPschSchemeNameBl());
//		}
//		
//		if (ValidationUtil.isValidLength(request.getPschLongDesc(), 4000)) {
//			errors.add("PschLong Desc length should be 4000");
//		} else {
//			request.setPschLongDesc(request.getPschLongDesc());
//		}
//		
//		if (ValidationUtil.isValidLength(request.getPschDfltFacPool(), 60)) {
//			errors.add("PschDfltFacPool length should be 60");
//		} else {
//			request.setPschDfltFacPool(request.getPschDfltFacPool());
//		}
//		
//		if (ValidationUtil.isValidLength(request.getPschRiskUrl(), 60)) {
//			errors.add("Psch rick Url length should be 60");
//		} else {
//			request.setPschRiskUrl(request.getPschRiskUrl());
//		}
//		
//
//		ValidationResult result = new ValidationResult();
//		if (errors.size() > 0) {
//			String errorMessage = errors.stream().map(a -> String.valueOf(a)).collect(Collectors.joining(", "));
//			throw new ObjectInvalidException(errorMessage);
//		}
//
//		if (null == mprodsch) {
//
//			mprodsch = MProdSchemes.builder().pschProdCode(request.getPschProdCode())
//					.pschCompCode(request.getPschCompCode()).pschSchemeCode(request.getPschSchemeCode())
//					.pschSchemeName(request.getPschSchemeName()).pschSchemeNameBl(request.getPschSchemeNameBl())
//					.pschSepPremEntryYn(request.getPschSepPremEntryYn())
//					.pschSepDiscEntryYn(request.getPschSepDiscEntryYn())
//					.pschSepLoadEntryYn(request.getPschSepLoadEntryYn())
//					.pschSepFeesEntryYn(request.getPschSepFeesEntryYn()).pschEffFmDt(request.getPschEffFmDt())
//					.pschEffToDt(request.getPschEffToDt()).pschLongDesc(request.getPschLongDesc())
//					.pschDfltFacPool(request.getPschDfltFacPool()).pschRiskUrl(request.getPschRiskUrl())
//					.pschSepTaxEntryYn(request.getPschSepTaxEntryYn()).check(true).build();
//		} else {
//
//			mprodsch.setPschProdCode(request.getPschProdCode());
//			mprodsch.setPschCompCode(request.getPschCompCode());
//			mprodsch.setPschSchemeCode(request.getPschSchemeCode());
//			mprodsch.setPschSchemeName(request.getPschSchemeName());
//			mprodsch.setPschSchemeNameBl(request.getPschSchemeNameBl());
//			mprodsch.setPschSepPremEntryYn(request.getPschSepPremEntryYn());
//			mprodsch.setPschSepDiscEntryYn(request.getPschSepDiscEntryYn());
//			mprodsch.setPschSepLoadEntryYn(request.getPschSepLoadEntryYn());
//			mprodsch.setPschSepFeesEntryYn(request.getPschSepFeesEntryYn());
//			mprodsch.setPschEffFmDt(request.getPschEffFmDt());
//			mprodsch.setPschEffToDt(request.getPschEffToDt());
//			mprodsch.setPschLongDesc(request.getPschLongDesc());
//			mprodsch.setPschDfltFacPool(request.getPschDfltFacPool());
//			mprodsch.setPschRiskUrl(request.getPschRiskUrl());
//			mprodsch.setPschSepTaxEntryYn(request.getPschSepTaxEntryYn());
//			mprodsch.setCheck(false);
//
//		}
//
//		result.setObject(mprodsch);
//		return result;
//	}
//
//}
//
