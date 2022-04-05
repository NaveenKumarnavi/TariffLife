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
//import com.navi.live.bean.MLifeDocs;
//import com.navi.live.enumeration.Status;
//import com.navi.live.handler.ObjectInvalidException;
//import com.navi.live.service.MLifeDocsService;
//import com.navi.live.util.ValidationUtil;
//
//import lombok.AllArgsConstructor;
//import lombok.NonNull;
//
//@Service
//@AllArgsConstructor(onConstructor_ = { @Autowired })
//public class MLifeDocsValidator {
//
//	List<String> errors = null;
//	List<String> errorsObj = null;
//	Optional<Subject> subject = null;
//
//	private @NonNull MLifeDocsService mlifeDocsService;
//
//	public ValidationResult validate(MLifeDocs request) {
//
//		errors = new ArrayList<>();
//		MLifeDocs obj = null;
//
//		if (ValidationUtil.isNull(request.getMldDocId())) {
//			throw new ObjectInvalidException("Doc Id required");
//		}if (ValidationUtil.isValidLength(request.getMldDocId(), 12)) {
//			throw new ObjectInvalidException("MldDocId Max Length Should Be 12");
//
//		} else {
//			request.setMldDocId(request.getMldDocId());
//		}
//		                                                           
//		if(ValidationUtil.isNull(request.getMldSysId()))
//
//		{
//			Optional<MLifeDocs> lobOptional = mlifeDocsService
//					.findByMldDocIdAndMldDocCatg(request.getMldDocId(),request.getMldDocCatg());
//
//			if (lobOptional.isPresent()) {
//				throw new ObjectInvalidException("Already Exist ");
//			}
//
//		}
//
//		else {
//
//			Optional<MLifeDocs> sysId = mlifeDocsService.findById(request.getMldSysId());
//
//			obj = sysId.get();
//		}                 
//		
//		if (ValidationUtil.isNull(request.getMldDocCatg())) {
//			throw new ObjectInvalidException("Doc Catg required");
//		}else if (ValidationUtil.isValidLength(request.getMldDocCatg(), 12)) {
//			throw new ObjectInvalidException("DocCatg Max Length Should Be 12");
//
//		} else {
//			request.setMldDocCatg(request.getMldDocCatg());
//		}
//
//		if (ValidationUtil.isGreaterThan(request.getMldEffFmDt(), request.getMldEffToDt())) {
//			errors.add("MldEffFmDt should be greater than MldEffToDt");
//		} else {
//			request.setMldEffFmDt(request.getMldEffFmDt());
//		}
//		
//		if (ValidationUtil.isValidLength(request.getMldDocId(), 12)) {
//			errors.add("DocId Max Length Should Be 12");
//
//		} else {
//			request.setMldDocId(request.getMldDocId());
//		}
//		
//		if (ValidationUtil.isValidLength(request.getMldDocDesc(), 100)) {
//			errors.add("DocDesc Max Length Should Be 100");
//
//		} else {
//			request.setMldDocDesc(request.getMldDocDesc());
//		}
//		
//		if (ValidationUtil.isValidLength(request.getMldDocCatgIdentif(), 4000)) {
//			errors.add("DocCatgIdentif Max Length Should Be 4000");
//
//		} else {
//			request.setMldDocCatgIdentif(request.getMldDocCatgIdentif());
//		}
//
//		if (ValidationUtil.isValidLength(request.getMldDocCatgMandYn(),1)) {
//			errors.add("DocCatgMandYn Max Length Should Be 1");
//		}
//		else if(ValidationUtil.isValidYesOrNo(request.getMldDocCatgMandYn())) {
//				errors.add("DocCatgMandYn defaut A");
//			}
//		 else {
//			request.setMldDocCatgMandYn(request.getMldDocCatgMandYn());
//		}
//		
//		ValidationResult result = new ValidationResult();
//		if (errors.size() > 0) {
//			String errorMessage = errors.stream().map(a -> String.valueOf(a)).collect(Collectors.joining(", "));
//			throw new ObjectInvalidException(errorMessage);
//		}
//
//		if (null == obj) {
//
//			obj = MLifeDocs.builder().mldDocCatg(request.getMldDocCatg()).mldDocId(request.getMldDocId())
//					.mldDocDesc(request.getMldDocDesc()).mldDocCatgIdentif(request.getMldDocCatgIdentif())
//					.mldDocCatgMandYn(request.getMldDocCatgMandYn()).mldStatus(Status.A)
//					.mldEffFmDt(request.getMldEffFmDt()).mldEffToDt(request.getMldEffToDt()).build();
//
//		} else {
//			obj.setMldSysId(request.getMldSysId());
//			obj.setMldDocCatg(request.getMldDocCatg());
//			obj.setMldDocId(request.getMldDocId());
//			obj.setMldDocDesc(request.getMldDocDesc());
//			obj.setMldDocCatgIdentif(request.getMldDocCatgIdentif());
//			obj.setMldDocCatgMandYn(request.getMldDocCatgMandYn());
//			obj.setMldStatus(request.getMldStatus());
//			obj.setMldEffFmDt(request.getMldEffFmDt());
//			obj.setMldEffToDt(request.getMldEffToDt());
//
//		}
//
//		result.setObject(obj);
//		return result;
//	}
//
//}
//
