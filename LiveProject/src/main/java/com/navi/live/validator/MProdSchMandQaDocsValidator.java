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
//import com.navi.live.bean.MProdSchMandQaDocs;
//import com.navi.live.bean.MProdSchemes;
//import com.navi.live.handler.ObjectInvalidException;
//import com.navi.live.repository.MProdSchemesRepository;
//import com.navi.live.service.MLifeDocsService;
//import com.navi.live.service.MProdSchMandQaDocsService;
//import com.navi.live.util.ValidationUtil;
//
//import lombok.AllArgsConstructor;
//import lombok.NonNull;
//
//@Service
//@AllArgsConstructor(onConstructor_ = { @Autowired })
//public class MProdSchMandQaDocsValidator {
//
//	List<String> errors = null;
//	List<String> errorsObj = null;
//	Optional<Subject> subject = null;
//
//	private @NonNull MProdSchMandQaDocsService companyService;
//	private @NonNull MProdSchemesRepository schRepo;
//	private @NonNull MLifeDocsService mlifeDocsService;
//
//	public ValidationResult validate(MProdSchMandQaDocs request) {
//
//		errors = new ArrayList<>();
//		MProdSchMandQaDocs obj = null;
//		
//		if (ValidationUtil.isNull(request.getPsmProdCode())) {
//			throw new ObjectInvalidException("Prod  Code required");
//		}
//		else if (ValidationUtil.isValidLength(request.getPsmProdCode(), 12)) {
//			throw new ObjectInvalidException("Prod Code length should be 12");
//		} else {
//			request.setPsmProdCode(request.getPsmProdCode());
//		}
//		
//		if(ValidationUtil.isNull(request.getPsmCompCode()))
//		{
//			throw new ObjectInvalidException("CompCode required");
//		}
//		else if (ValidationUtil.isValidLength(request.getPsmCompCode(), 12)) {
//			throw new ObjectInvalidException("CompCode length should be 12");
//		} else {
//			request.setPsmCompCode(request.getPsmCompCode());
//		}
//		
//		if (ValidationUtil.isNull(request.getPsmSchFmCode())) {
//			throw new ObjectInvalidException("Scheme Fm Code required");
//		}
//		else if (ValidationUtil.isValidLength(request.getPsmSchFmCode(), 12)) {
//			throw new ObjectInvalidException("Scheme Fm Code length should be 12");
//		} else {
//			request.setPsmSchFmCode(request.getPsmSchFmCode());
//		}
//		
//		if (ValidationUtil.isNull(request.getPsmSchToCode())) {
//			throw new ObjectInvalidException("Scheme To Code required");
//		}
//		else if (ValidationUtil.isValidLength(request.getPsmSchToCode(), 12)) {
//			throw new ObjectInvalidException("Scheme To Code length should be 12");
//		} else {
//			request.setPsmSchToCode(request.getPsmSchToCode());
//		}
//
//		Optional<MProdSchMandQaDocs> sysId = companyService.findById(request.getPsmSysId());
//
//		if (!sysId.isPresent()) {
//
//			Optional<MProdSchemes> scheme = schRepo.findByPschCompCodeAndPschProdCodeAndPschSchemeCode(
//					request.getPsmCompCode(), request.getPsmProdCode(), request.getPsmSchFmCode());
//			if (scheme.isPresent()) {
//				throw new ObjectInvalidException("Please enter the valid company and product and scheme");
//			}
//			
//			
//		} else {
//
//			obj = sysId.get();
//		}
//		
////		Optional<MLifeDocs> lobOptional = mlifeDocsService.findByMldDocIdAndMldDocCatg(request.getPsmDocId(),request.getPsmDocCatg());
////		if(!lobOptional.isPresent()) {
////			throw new ObjectInvalidException("Invalied Code");
////		}
//
//
//		if (ValidationUtil.isValidLength(request.getPsmDocCatg(),12)) {
//			errors.add("Doc Catg Max Length Should Be 12");
//		} else {
//			request.setPsmDocCatg(request.getPsmDocCatg());
//		}
//
//		if (ValidationUtil.isValidLength(request.getPsmDocId(),12)) {
//			errors.add("DocId Max Length Should Be 12");
//		} else {
//			request.setPsmDocId(request.getPsmDocId());
//		}
//		
//		if (ValidationUtil.isGreaterThan(request.getPsmEffFmDt(), request.getPsmEffToDt())) {
//			errors.add("Eff From date should be greater than Eff To date");
//		} else {
//			request.setPsmEffFmDt(request.getPsmEffFmDt());
//		}
//		
////		if(!ValidationUtil.isNull(request.getPsmAgeFm())) {
////			if(!ValidationUtil.isNull(request.getPsmAgeTo()))
////			{
//				if (ValidationUtil.isGreaterThan(request.getPsmAgeFm(), request.getPsmAgeTo())) {
//				errors.add(" Minimum AgeFm is Greater than  Maximum AgeTo");
//				}
////			}
////		}
//
////		if(!ValidationUtil.isNull(request.getPsmSiFm())) {
////			if(!ValidationUtil.isNull(request.getPsmSiTo()))
////			{
//				if (ValidationUtil.isGreaterThan(request.getPsmSiFm(), request.getPsmSiTo())) {
//				errors.add(" Minimum SiFm is Greater than  Maximum SiTo");
//				}
////			}
////		}
//		
//		ValidationResult result = new ValidationResult();
//		if (errors.size() > 0) {
//			String errorMessage = errors.stream().map(a -> String.valueOf(a)).collect(Collectors.joining(", "));
//			throw new ObjectInvalidException(errorMessage);
//		}
//
//		if (null == obj) {
//
//			obj = MProdSchMandQaDocs.builder().psmCompCode(request.getPsmCompCode())
//					.psmProdCode(request.getPsmProdCode()).psmSchFmCode(request.getPsmSchFmCode())
//					.psmSchToCode(request.getPsmSchToCode()).psmDocCatg(request.getPsmDocCatg())
//					.psmDocId(request.getPsmDocId()).psmAgeFm(request.getPsmAgeFm()).psmAgeTo(request.getPsmAgeTo())
//					.psmSiFm(request.getPsmSiFm()).psmSiTo(request.getPsmSiTo()).psmEffFmDt(request.getPsmEffFmDt())
//					.psmEffToDt(request.getPsmEffToDt()).psmStatus("A").build();
//
//		} else {
//			obj.setPsmSysId(request.getPsmSysId());
//			obj.setPsmCompCode(request.getPsmCompCode());
//			obj.setPsmProdCode(request.getPsmProdCode());
//			obj.setPsmSchFmCode(request.getPsmSchFmCode());
//			obj.setPsmSchToCode(request.getPsmSchToCode());
//			obj.setPsmDocCatg(request.getPsmDocCatg());
//			obj.setPsmDocId(request.getPsmDocId());
//			obj.setPsmAgeFm(request.getPsmAgeFm());
//			obj.setPsmAgeTo(request.getPsmAgeTo());
//			obj.setPsmSiFm(request.getPsmSiFm());
//			obj.setPsmSiTo(request.getPsmSiTo());
//			obj.setPsmEffFmDt(request.getPsmEffFmDt());
//			obj.setPsmEffToDt(request.getPsmEffToDt());
//			obj.setPsmStatus(request.getPsmStatus());
//
//		}
//
//		result.setObject(obj);
//		return result;
//	}
//
//}
//
