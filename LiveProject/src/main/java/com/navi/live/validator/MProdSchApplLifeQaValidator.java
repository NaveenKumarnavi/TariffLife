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
//import com.navi.live.bean.MLifeQA;
//import com.navi.live.bean.MProdSchApplLifeQa;
//import com.navi.live.bean.MProdSchemes;
//import com.navi.live.handler.ObjectInvalidException;
//import com.navi.live.repository.MProdSchemesRepository;
//import com.navi.live.service.MLifeQaService;
//import com.navi.live.service.MProdSchApplLifeQaService;
//import com.navi.live.util.ValidationUtil;
//
//import lombok.AllArgsConstructor;
//import lombok.NonNull;
//
//@Service
//@AllArgsConstructor(onConstructor_ = { @Autowired })
//public class MProdSchApplLifeQaValidator {
//
//	List<String> errors = null;
//	List<String> errorsObj = null;
//	Optional<Subject> subject = null;
//
//	private @NonNull MProdSchApplLifeQaService service;
//	private @NonNull MProdSchemesRepository schRepo;
//	private @NonNull MLifeQaService mLifeQaService;
//
//	public ValidationResult validate(MProdSchApplLifeQa request) {
//
//		errors = new ArrayList<>();
//		MProdSchApplLifeQa obj = null;
//		
//		if (ValidationUtil.isNull(request.getPsaqCompCode())) {
//			throw new ObjectInvalidException("CompCode required");
//		}else if (ValidationUtil.isValidLength(request.getPsaqCompCode(),12)) {
//			throw new ObjectInvalidException("CompCode Max length should be 12");
//		}
//		else {
//			request.setPsaqCompCode(request.getPsaqCompCode());
//		}
//
//		if (ValidationUtil.isNull(request.getPsaqProdCode())) {
//			throw new ObjectInvalidException("Prod Code required");
//		}else if (ValidationUtil.isValidLength(request.getPsaqCompCode(),12)) {
//			throw new ObjectInvalidException("CompCode Max length should be 12");
//		}
//		else {
//			request.setPsaqCompCode(request.getPsaqCompCode());
//		}
//		
//
//		if (ValidationUtil.isNull(request.getPsaqSchFmCode())) {
//			throw new ObjectInvalidException("SchFmCode required");
//		}else if (ValidationUtil.isValidLength(request.getPsaqSchFmCode(),12)) {
//			throw new ObjectInvalidException("SchFmCode Max length should be 12");
//		}
//		else {
//			request.setPsaqSchFmCode(request.getPsaqSchFmCode());
//		}
//
//		if (ValidationUtil.isNull(request.getPsaqSchToCode())) {
//			throw new ObjectInvalidException("SchToCode required");
//		}else if (ValidationUtil.isValidLength(request.getPsaqSchFmCode(),12)) {
//			throw new ObjectInvalidException("SchToCode Max length should be 12");
//		}
//		else {
//			request.setPsaqSchToCode(request.getPsaqSchToCode());
//		}
//		
//		if (ValidationUtil.isNull(request.getPsaqQstCode())) {
//			throw new ObjectInvalidException("Qst Code required");
//		}else if (ValidationUtil.isValidLength(request.getPsaqQstCode(),12)) {
//			throw new ObjectInvalidException("QstCode Max length should be 12");
//		}
//		else {
//			request.setPsaqQstCode(request.getPsaqQstCode());
//		}
//
//		
//
//		if (!ValidationUtil.isNull(request.getPsaqSysId())) {
//
//			Optional<MProdSchApplLifeQa> sysId = service.findById(request.getPsaqSysId());
//			obj = sysId.get();
//		}
//		
//		Optional<MProdSchemes> scheme = schRepo.findByPschCompCodeAndPschProdCodeAndPschSchemeCode(
//				request.getPsaqCompCode(),request.getPsaqProdCode(),request.getPsaqSchFmCode());
//		if (!scheme.isEmpty()) {
//			throw new ObjectInvalidException("Please enter the valid company and product and scheme");
//		}
//		
//		Optional<MLifeQA> lobOptional = mLifeQaService.findByMlqQstCode(request.getPsaqQstCode());
//		if(!lobOptional.isPresent()) {
//			throw new ObjectInvalidException("QstCode required");
//		}
//		
//		
//		
//		if (ValidationUtil.isGreaterThan(request.getPsaqEffFmDt(), request.getPsaqEffToDt())) {
//			errors.add("Eff From date should be greater than Eff To date");
//		} else {
//			request.setPsaqEffFmDt(request.getPsaqEffFmDt());
//		}
//		
//		if (ValidationUtil.isValidLength(request.getPsaqProdCode(), 12)) {
//			errors.add("ProdCode Max Length Should Be 12");
//
//		} else {
//			request.setPsaqProdCode(request.getPsaqProdCode());
//		}
//		
//		if (ValidationUtil.isValidLength(request.getPsaqQstMand(), 1)) {
//			errors.add("QstMand Max Length Should Be 1");
//		}
//		else if(ValidationUtil.isValidYesOrNo(request.getPsaqQstMand())) {
//				errors.add("QstMand defaut A");
//			}
//		 else {
//			request.setPsaqQstMand(request.getPsaqQstMand());
//		}
//
//		if (ValidationUtil.isValidLength(request.getPsaqLevel(), 99)) {
//			errors.add("Level Max Length Should Be 99");
//
//		} else {
//			request.setPsaqLevel(request.getPsaqLevel());
//		}
//		
//		
//
//		ValidationResult result = new ValidationResult();
//		if (errors.size() > 0) {
//			String errorMessage = errors.stream().map(a -> String.valueOf(a)).collect(Collectors.joining(", "));
//			throw new ObjectInvalidException(errorMessage);
//		}
//
//		if (null == obj) {
//
//			obj = MProdSchApplLifeQa.builder().psaqCompCode(request.getPsaqCompCode())
//					.psaqProdCode(request.getPsaqProdCode()).psaqSchFmCode(request.getPsaqSchFmCode())
//					.psaqSchToCode(request.getPsaqSchToCode()).psaqLevel(request.getPsaqLevel())
//					.psaqQstCode(request.getPsaqQstCode()).psaqQstMand(request.getPsaqQstMand())
//					.psaqEffFmDt(request.getPsaqEffFmDt()).psaqEffToDt(request.getPsaqEffToDt()).psaqStatus("A")
//					.build();
//
//		} else {
//			obj.setPsaqSysId(request.getPsaqSysId());
//			obj.setPsaqCompCode(request.getPsaqCompCode());
//			obj.setPsaqProdCode(request.getPsaqProdCode());
//			obj.setPsaqSchFmCode(request.getPsaqSchFmCode());
//			obj.setPsaqSchToCode(request.getPsaqSchToCode());
//			obj.setPsaqLevel(request.getPsaqLevel());
//			obj.setPsaqQstCode(request.getPsaqQstCode());
//			obj.setPsaqQstMand(request.getPsaqQstMand());
//			obj.setPsaqEffFmDt(request.getPsaqEffFmDt());
//			obj.setPsaqEffToDt(request.getPsaqEffToDt());
//			obj.setPsaqStatus(request.getPsaqStatus());
//
//		}
//
//		result.setObject(obj);
//		return result;
//	}
//
//}
//
