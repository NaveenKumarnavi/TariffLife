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
//import com.navi.live.handler.ObjectInvalidException;
//import com.navi.live.service.MLifeQaService;
//import com.navi.live.util.ValidationUtil;
//
//import lombok.AllArgsConstructor;
//import lombok.NonNull;
//
//@Service
//@AllArgsConstructor(onConstructor_ = { @Autowired })
//public class MLifeQaValidator {
//
//	List<String> errors = null;
//	List<String> errorsObj = null;
//	Optional<Subject> subject = null;
//
//	private @NonNull MLifeQaService mLifeQaService;
//
//	public ValidationResult validate(MLifeQA request) {
//
//		errors = new ArrayList<>();
//		MLifeQA obj = null;
//
//		if (ValidationUtil.isNull(request.getMlqQstCatg())) {
//			throw new ObjectInvalidException("Qst Catg required");
//		}else if (ValidationUtil.isValidLength(request.getMlqQstCatg(), 12)) {
//			throw new ObjectInvalidException("QstCat gMax Length Should Be 12");
//
//		} else {
//			request.setMlqQstCatg(request.getMlqQstCatg());
//		}
//
//
//		if (ValidationUtil.isNull(request.getMlqQstCode())) {
//			throw new ObjectInvalidException("Qst Code required");
//	
//		} else {
//			request.setMlqQstCode(request.getMlqQstCode());
//		}
//		
//		if(ValidationUtil.isNull(request.getMlqSysId()))
//
//		{
//			Optional<MLifeQA> lobOptional = mLifeQaService
//					.findByMlqQstCatgAndMlqQstCode(request.getMlqQstCatg(),
//							request.getMlqQstCode());
//
//			if (lobOptional.isPresent()) {
//				throw new ObjectInvalidException("Already Exist ");
//			}
//
//		}
//
//		else {
//
//			Optional<MLifeQA> lobOptional = mLifeQaService.findByMlqSysId(request.getMlqSysId());
//
//			obj = lobOptional.get();
//		}
//	
//		if (ValidationUtil.isValidLength(request.getMlqAnsType(), 10)) {
//			errors.add("AnsType Max Length Should Be 10");
//
//		} else {
//			request.setMlqAnsType(request.getMlqAnsType());
//		}
//
//		if (ValidationUtil.isGreaterThan(request.getMlqEffFmDt(), request.getMlqEffToDt())) {
//			errors.add("Eff From date should be greater than Eff To date");
//		} else {
//			request.setMlqEffFmDt(request.getMlqEffFmDt());
//		}
//		
//		if (ValidationUtil.isValidLength(request.getMlqQstDesc(), 1000)) {
//			errors.add("QstDesc Max Length Should Be 1000");
//
//		} else {
//			request.setMlqQstDesc(request.getMlqQstDesc());
//		}
//		
//		if (ValidationUtil.isValidLength(request.getMlqQstLongDesc(), 2000)) {
//			errors.add("QstLongDesc Max Length Should Be 2000");
//
//		} else {
//			request.setMlqQstLongDesc(request.getMlqQstLongDesc());
//		}
//		
//		if (ValidationUtil.isValidLength(request.getMlqAnsOptions(), 4000)) {
//			errors.add("AnsOptions Max Length Should Be 4000");
//
//		} else {
//			request.setMlqAnsOptions(request.getMlqAnsOptions());
//		}
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
//			obj = MLifeQA.builder().mlqQstCatg(request.getMlqQstCatg()).mlqQstCode(request.getMlqQstCode())
//					.mlqQstDesc(request.getMlqQstDesc()).mlqQstLongDesc(request.getMlqQstLongDesc())
//					.mlqAnsType(request.getMlqAnsType()).mlqAnsOptions(request.getMlqAnsOptions())
//					.mlqSubQstCode(request.getMlqSubQstCode()).mlqEffFmDt(request.getMlqEffFmDt())
//					.mlqEffToDt(request.getMlqEffToDt()).mlqStatus("A").build();
//
//		} else {
//
//			obj.setMlqSysId(request.getMlqSysId());
//			obj.setMlqQstCatg(request.getMlqQstCatg());
//			obj.setMlqQstCode(request.getMlqQstCode());
//			obj.setMlqQstDesc(request.getMlqQstDesc());
//			obj.setMlqQstLongDesc(request.getMlqQstLongDesc());
//			obj.setMlqAnsType(request.getMlqAnsType());
//			obj.setMlqAnsOptions(request.getMlqAnsOptions());
//			obj.setMlqSubQstCode(request.getMlqSubQstCode());
//			obj.setMlqEffFmDt(request.getMlqEffFmDt());
//			obj.setMlqEffToDt(request.getMlqEffToDt());
//			obj.setMlqStatus(request.getMlqStatus());
//
//		}
//
//		result.setObject(obj);
//		return result;
//	}
//
//}
//
