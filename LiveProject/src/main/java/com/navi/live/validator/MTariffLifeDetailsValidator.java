package com.navi.live.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navi.live.bean.MTariffLifeDetails;
import com.navi.live.handler.ObjectInvalidException;
import com.navi.live.repository.MTariffLifeDetailsRepository;
import com.navi.live.service.MTariffLifeDetailsService;
import com.navi.live.util.ValidationUtil;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@Service
@AllArgsConstructor(onConstructor_ = { @Autowired })
public class MTariffLifeDetailsValidator {
	List<String> errors = null;
	List<String> errorsObj = null;
	Optional<Subject> subject = null;

	
	private @NonNull MTariffLifeDetailsService MTariffLifeDetailsService;
	private @NonNull MTariffLifeDetailsRepository repo;

	public ValidationResult validate(MTariffLifeDetails request) {

		errors = new ArrayList<>();
		MTariffLifeDetails obj = null;

		if (!ValidationUtil.isNull(request.getMtdId())) {

			Optional<MTariffLifeDetails> lobOptional = repo.findByMtdId(request.getMtdId());

			obj = lobOptional.get();

		}
		if (ValidationUtil.isNull(request.getMtdEffFmDt())) {
			throw new ObjectInvalidException("Effective From date is required");
		}
		if (ValidationUtil.isNull(request.getMtdEffToDt())) {
			throw new ObjectInvalidException("Effective From To is required");
		}
		if (ValidationUtil.isNull(request.getMtdMthId())) {
			throw new ObjectInvalidException("Mth Id is required");
		}
		if (ValidationUtil.isGreaterThan(request.getMtdEffFmDt(), request.getMtdEffToDt())) {
			errors.add("Eff From date should be greater than Eff To date");
		}

		if (ValidationUtil.isValidLength(request.getMtdSmokeFmCode(), 12)) {
			errors.add("MtdSmokeFmCode length should be 12");
		} else {
			request.setMtdSmokeFmCode(request.getMtdSmokeFmCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdSmokeToCode(), 12)) {
			errors.add("MtdSmokeToCode should be 12");
		} else {
			request.setMtdSmokeToCode(request.getMtdSmokeToCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdGenderFmCode(), 12)) {
			errors.add("MtdGenderFmCode length should be 12");
		} else {
			request.setMtdGenderFmCode(request.getMtdGenderFmCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdGenderToCode(), 12)) {
			errors.add("MtdGenderToCode length should be 12");
		} else {
			request.setMtdGenderToCode(request.getMtdGenderToCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdAgeFm(), 99)) {
			errors.add("MtdAgeFm length should be 99");
		} else {
			request.setMtdAgeFm(request.getMtdAgeFm());
		}

		if (ValidationUtil.isValidLength(request.getMtdAgeTo(), 99)) {
			errors.add("MtdAgeTo length should be 99");
		} else {
			request.setMtdAgeTo(request.getMtdAgeTo());
		}

		if (ValidationUtil.isValidLength(request.getMtdPolicytermFm(), 99)) {
			errors.add("MtdPolicytermFm length should be 99");
		} else {
			request.setMtdPolicytermFm(request.getMtdPolicytermFm());
		}

		if (ValidationUtil.isValidLength(request.getMtdPolicyTermTo(), 99)) {
			errors.add("MtdPolicyTermTo length should be 99");
		} else {
			request.setMtdPolicyTermTo(request.getMtdPolicyTermTo());
		}

		if (ValidationUtil.isValidLength(request.getMtdNoSeatsFm(), 99)) {
			errors.add("MtdNoSeatsFm length should be 99");
		} else {
			request.setMtdNoSeatsFm(request.getMtdNoSeatsFm());
		}

		if (ValidationUtil.isValidLength(request.getMtdNoSeatsTo(), 99)) {
			errors.add("MtdNoSeatsTo length should be 99");
		} else {
			request.setMtdNoSeatsTo(request.getMtdNoSeatsTo());
		}

		if (ValidationUtil.isValidLength(request.getMtdSumAssuredLimitFm(), 99)) {
			errors.add("MtdSumAssuredLimitFm length should be 99");
		} else {
			request.setMtdSumAssuredLimitFm(request.getMtdSumAssuredLimitFm());
		}

		if (ValidationUtil.isValidLength(request.getMtdSumAssuredLimitTo(), 99)) {
			errors.add("MtdSumAssuredLimitTo length should be 99");
		} else {
			request.setMtdSumAssuredLimitTo(request.getMtdSumAssuredLimitTo());
		}

		if (ValidationUtil.isValidLength(request.getMtdMaturityAgeFm(), 99)) {
			errors.add("MtdMaturityAgeFm length should be 99");
		} else {
			request.setMtdMaturityAgeFm(request.getMtdMaturityAgeFm());
		}

		if (ValidationUtil.isValidLength(request.getMtdInsuredTypeFmCode(), 12)) {
			errors.add("MtdInsuredTypeFmCode length should be 12");
		} else {
			request.setMtdInsuredTypeFmCode(request.getMtdInsuredTypeFmCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdInsuredTypeToCode(), 12)) {
			errors.add("MtdInsuredTypeToCode length should be 12");
		} else {
			request.setMtdInsuredTypeToCode(request.getMtdInsuredTypeToCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdChildAgeFm(), 99)) {
			errors.add("MtdChildAgeFm length should be 99");
		} else {
			request.setMtdChildAgeFm(request.getMtdChildAgeFm());
		}

		if (ValidationUtil.isValidLength(request.getMtdOccFmCode(), 12)) {
			errors.add("MtdOccFmCode length should be 12");
		} else {
			request.setMtdOccFmCode(request.getMtdOccFmCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdOccToCode(), 12)) {
			errors.add("MtdOccToCode length should be 12");
		} else {
			request.setMtdOccToCode(request.getMtdOccToCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPremFqFmCode(), 12)) {
			errors.add("MtdPremFqFmCode length should be 12");
		} else {
			request.setMtdPremFqFmCode(request.getMtdPremFqFmCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPremfqToCode(), 12)) {
			errors.add("MtdPremfqToCode length should be 12");
		} else {
			request.setMtdPremfqToCode(request.getMtdPremfqToCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPara01FmCode(), 12)) {
			errors.add("MtdPara01FmCode length should be 12");
		} else {
			request.setMtdPara01FmCode(request.getMtdPara01FmCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPara01ToCode(), 12)) {
			errors.add("MtdPara01ToCode length should be 12");
		} else {
			request.setMtdPara01ToCode(request.getMtdPara01ToCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPara02FmCode(), 12)) {
			errors.add("MtdPara02FmCode length should be 12");
		} else {
			request.setMtdPara02FmCode(request.getMtdPara02FmCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPara02ToCode(), 12)) {
			errors.add("MtdPara02ToCode length should be 12");
		} else {
			request.setMtdPara02ToCode(request.getMtdPara02ToCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPara03FmCode(), 12)) {
			errors.add("MtdPara03FmCode length should be 12");
		} else {
			request.setMtdPara03FmCode(request.getMtdPara03FmCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPara03ToCode(), 12)) {
			errors.add("MtdPara03ToCode length should be 12");
		} else {
			request.setMtdPara03ToCode(request.getMtdPara03ToCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPara04FmCode(), 9999)) {
			errors.add("MtdPara04FmCode length should be 9999");
		} else {
			request.setMtdPara04FmCode(request.getMtdPara04FmCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPara04ToCode(), 9999)) {
			errors.add("MtdPara04ToCode length should be 9999");
		} else {
			request.setMtdPara04ToCode(request.getMtdPara04ToCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPara05FmCode(), 99)) {
			errors.add("MtdPara05FmCode length should be 99");
		} else {
			request.setMtdPara05FmCode(request.getMtdPara05FmCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPara05ToCode(), 99)) {
			errors.add("MtdPara05ToCode length should be 99");
		} else {
			request.setMtdPara05ToCode(request.getMtdPara05ToCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPara06FmCode(), 12)) {
			errors.add("MtdPara06FmCode length should be 12");
		} else {
			request.setMtdPara06FmCode(request.getMtdPara06FmCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPara06ToCode(), 12)) {
			errors.add("MtdPara06ToCode length should be 12");
		} else {
			request.setMtdPara06ToCode(request.getMtdPara06ToCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPara07FmCode(), 12)) {
			errors.add("MtdPara07FmCode length should be 12");
		} else {
			request.setMtdPara07FmCode(request.getMtdPara07FmCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPara07ToCode(), 12)) {
			errors.add("MtdPara07ToCode length should be 12");
		} else {
			request.setMtdPara07ToCode(request.getMtdPara07ToCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdPara08FmCode(), 12)) {
			errors.add("MtdPara08FmCode length should be 12");
		} else {
			request.setMtdPara08FmCode(request.getMtdPara08FmCode());
		}

		if (ValidationUtil.isValidLength(request.getMtdDiscCode1(), 12)) {
			errors.add("MtdDiscCode1 length should be 12");
		} else {
			request.setMtdDiscCode1(request.getMtdDiscCode1());
		}

		if (ValidationUtil.isValidLength(request.getMtdDiscCode2(), 12)) {
			errors.add("MtdDiscCode2 length should be 12");
		} else {
			request.setMtdDiscCode2(request.getMtdDiscCode2());
		}

		if (ValidationUtil.isValidLength(request.getMtdDiscCode3(), 12)) {
			errors.add("MtdDiscCode3 length should be 12");
		} else {
			request.setMtdDiscCode3(request.getMtdDiscCode3());
		}

		if (ValidationUtil.isValidLength(request.getMtdDiscCode4(), 12)) {
			errors.add("MtdDiscCode4 length should be 12");
		} else {
			request.setMtdDiscCode4(request.getMtdDiscCode4());
		}

		if (ValidationUtil.isValidLength(request.getMtdDiscCode5(), 12)) {
			errors.add("MtdDiscCode5 length should be 12");
		} else {
			request.setMtdDiscCode5(request.getMtdDiscCode5());
		}

		if (ValidationUtil.isValidLength(request.getMtdLoadCode1(), 12)) {
			errors.add("MtdLoadCode1 length should be 12");
		} else {
			request.setMtdLoadCode1(request.getMtdLoadCode1());
		}

		if (ValidationUtil.isValidLength(request.getMtdLoadCode2(), 12)) {
			errors.add("MtdLoadCode2 length should be 12");
		} else {
			request.setMtdLoadCode2(request.getMtdLoadCode2());
		}

		if (ValidationUtil.isValidLength(request.getMtdLoadCode3(), 12)) {
			errors.add("MtdLoadCode3 length should be 12");
		} else {
			request.setMtdLoadCode3(request.getMtdLoadCode3());
		}

		if (ValidationUtil.isValidLength(request.getMtdDedCode1(), 12)) {
			errors.add("MtdDedCode1 length should be 12");
		} else {
			request.setMtdDedCode1(request.getMtdDedCode1());
		}

		if (ValidationUtil.isValidLength(request.getMtdDedCode2(), 12)) {
			errors.add("MtdDedCode2 length should be 12");
		} else {
			request.setMtdDedCode2(request.getMtdDedCode2());
		}

		if (ValidationUtil.isValidLength(request.getMtdDedCode3(), 12)) {
			errors.add("MtdDedCode3 length should be 12");
		} else {
			request.setMtdDedCode3(request.getMtdDedCode3());
		}

		if (ValidationUtil.isValidLength(request.getMtdDedCode4(), 12)) {
			errors.add("MtdDedCode4 length should be 12");
		} else {
			request.setMtdDedCode4(request.getMtdDedCode4());
		}

		ValidationResult result = new ValidationResult();
		if (errors.size() > 0) {
			String errorMessage = errors.stream().map(a -> String.valueOf(a)).collect(Collectors.joining(", "));
			throw new ObjectInvalidException(errorMessage);
		}

		if (null == obj) {

			obj = MTariffLifeDetails.builder().mtdMthId(request.getMtdMthId()).mtdEffFmDt(request.getMtdEffFmDt())
					.mtdEffToDt(request.getMtdEffToDt()).mtdSmokeFmCode(request.getMtdSmokeFmCode())
					.mtdSmokeToCode(request.getMtdSmokeToCode()).mtdGenderFmCode(request.getMtdGenderFmCode())
					.mtdGenderToCode(request.getMtdGenderToCode()).mtdAgeFm(request.getMtdAgeFm())
					.mtdAgeTo(request.getMtdAgeTo()).mtdPolicytermFm(request.getMtdPolicytermFm())
					.mtdPolicyTermTo(request.getMtdPolicyTermTo()).mtdNoSeatsFm(request.getMtdNoSeatsFm())
					.mtdNoSeatsTo(request.getMtdNoSeatsTo()).mtdSumAssuredLimitFm(request.getMtdSumAssuredLimitFm())
					.mtdSumAssuredLimitTo(request.getMtdSumAssuredLimitTo())
					.mtdMaturityAgeFm(request.getMtdMaturityAgeFm()).mtdMaturityAgeTo(request.getMtdMaturityAgeTo())
					.mtdHeightFm(request.getMtdHeightFm()).mtdHeightto(request.getMtdHeightto())
					.mtdWeightFm(request.getMtdWeightFm()).mtdWeightTo(request.getMtdWeightTo())
					.mtdInsuredTypeFmCode(request.getMtdInsuredTypeFmCode())
					.mtdInsuredTypeToCode(request.getMtdInsuredTypeToCode()).mtdChildAgeFm(request.getMtdChildAgeFm())
					.mtdChildAgeTo(request.getMtdChildAgeTo()).mtdAdultCntFm(request.getMtdAdultCntFm())
					.mtdAdultCntTo(request.getMtdAdultCntTo()).mtdChildCntFm(request.getMtdChildCntFm())
					.mtdChildCntTo(request.getMtdChildCntTo()).mtdOccFmCode(request.getMtdOccFmCode())
					.mtdOccToCode(request.getMtdOccToCode()).mtdPremfqToCode(request.getMtdPremfqToCode())
					.mtdPremFqFmCode(request.getMtdPara01FmCode()).mtdPara01FmCode(request.getMtdPara01FmCode())
					.mtdPara01ToCode(request.getMtdPara01ToCode()).mtdPara02FmCode(request.getMtdPara02FmCode())
					.mtdPara02ToCode(request.getMtdPara02ToCode()).mtdPara03FmCode(request.getMtdPara03FmCode())
					.mtdPara03ToCode(request.getMtdPara03ToCode()).mtdPara04FmCode(request.getMtdPara04FmCode())
					.mtdPara04ToCode(request.getMtdPara04ToCode()).mtdPara05FmCode(request.getMtdPara05FmCode())
					.mtdPara05ToCode(request.getMtdPara05ToCode()).mtdPara06FmCode(request.getMtdPara06FmCode())
					.mtdPara06ToCode(request.getMtdPara06ToCode()).mtdPara07FmCode(request.getMtdPara07FmCode())
					.mtdPara07ToCode(request.getMtdPara07ToCode()).mtdPara08FmCode(request.getMtdPara08FmCode())
					.mtdPara08ToCode(request.getMtdPara08ToCode()).mtdPremRate(request.getMtdMaxPremRate())
					.mtdMinPremRate(request.getMtdMinPremRate()).mtdMaxPremRate(request.getMtdPremRate())
					.mtdMinSiLc1(request.getMtdMinSiLc1()).mtdMaxSiLc1(request.getMtdMaxSiLc1())
					.mtdMinPremLc1(request.getMtdMinPremLc1()).mtdMaxPremLc1(request.getMtdMaxPremLc1())
					.mtdDfltSi(request.getMtdDfltSi()).mtdDiscCode1(request.getMtdDiscCode1())
					.mtdDisc1Value(request.getMtdDisc1Value()).mtdDiscCode2(request.getMtdDiscCode2())
					.mtdDisc2Value(request.getMtdDisc2Value()).mtdDiscCode3(request.getMtdDiscCode3())
					.mtdDisc3Value(request.getMtdDisc3Value()).mtdDiscCode4(request.getMtdDiscCode4())
					.mtdDisc4Value(request.getMtdDisc4Value()).mtdDiscCode5(request.getMtdDiscCode5())
					.mtdDisc5Value(request.getMtdDisc5Value()).mtdLoadCode1(request.getMtdLoadCode1())
					.mtdLoad1Value(request.getMtdLoad1Value()).mtdLoadCode2(request.getMtdLoadCode2())
					.mtdLoad2Value(request.getMtdLoad2Value()).mtdLoadCode3(request.getMtdLoadCode3())
					.mtdLoad3Value(request.getMtdLoad3Value()).mtdDedCode1(request.getMtdDedCode1())
					.mtdDed1Value(request.getMtdDed1Value()).mtdDedCode2(request.getMtdDedCode2())
					.mtdDed2Value(request.getMtdDed2Value()).mtdDedCode3(request.getMtdDedCode3())
					.mtdDed3Value(request.getMtdDed3Value()).mtdDedCode4(request.getMtdDedCode4())
					.mtdDed4Value(request.getMtdDed4Value()).build();

		} else {
			obj.setMtdId(request.getMtdId());
			obj.setMtdMthId(request.getMtdMthId());
			obj.setMtdEffFmDt(request.getMtdEffFmDt());
			obj.setMtdEffToDt(request.getMtdEffToDt());
			obj.setMtdSmokeFmCode(request.getMtdSmokeFmCode());
			obj.setMtdSmokeToCode(request.getMtdSmokeToCode());
			obj.setMtdGenderFmCode(request.getMtdGenderFmCode());
			obj.setMtdGenderToCode(request.getMtdGenderToCode());
			obj.setMtdAgeFm(request.getMtdAgeFm());
			obj.setMtdAgeTo(request.getMtdAgeTo());
			obj.setMtdPolicytermFm(request.getMtdPolicytermFm());
			obj.setMtdPolicyTermTo(request.getMtdPolicyTermTo());
			obj.setMtdNoSeatsFm(request.getMtdNoSeatsFm());
			obj.setMtdNoSeatsTo(request.getMtdNoSeatsTo());
			obj.setMtdSumAssuredLimitFm(request.getMtdSumAssuredLimitFm());
			obj.setMtdSumAssuredLimitTo(request.getMtdSumAssuredLimitTo());
			obj.setMtdMaturityAgeFm(request.getMtdMaturityAgeFm());
			obj.setMtdMaturityAgeTo(request.getMtdMaturityAgeTo());
			obj.setMtdHeightFm(request.getMtdHeightFm());
			obj.setMtdHeightto(request.getMtdHeightto());
			obj.setMtdWeightFm(request.getMtdWeightFm());
			obj.setMtdWeightTo(request.getMtdWeightTo());
			obj.setMtdInsuredTypeFmCode(request.getMtdInsuredTypeFmCode());
			obj.setMtdInsuredTypeToCode(request.getMtdInsuredTypeToCode());
			obj.setMtdChildAgeFm(request.getMtdChildAgeFm());
			obj.setMtdChildAgeTo(request.getMtdChildAgeTo());
			obj.setMtdAdultCntFm(request.getMtdAdultCntFm());
			obj.setMtdAdultCntTo(request.getMtdAdultCntTo());
			obj.setMtdChildCntFm(request.getMtdChildCntFm());
			obj.setMtdChildCntTo(request.getMtdChildCntTo());
			obj.setMtdOccFmCode(request.getMtdOccFmCode());
			obj.setMtdOccToCode(request.getMtdOccToCode());
			obj.setMtdPremFqFmCode(request.getMtdPremFqFmCode());
			obj.setMtdPremfqToCode(request.getMtdPremfqToCode());
			obj.setMtdPara01FmCode(request.getMtdPara01FmCode());
			obj.setMtdPara01ToCode(request.getMtdPara01ToCode());
			obj.setMtdPara02FmCode(request.getMtdPara02FmCode());
			obj.setMtdPara02ToCode(request.getMtdPara02ToCode());
			obj.setMtdPara03FmCode(request.getMtdPara03FmCode());
			obj.setMtdPara03ToCode(request.getMtdPara03ToCode());
			obj.setMtdPara04FmCode(request.getMtdPara04FmCode());
			obj.setMtdPara04ToCode(request.getMtdPara04ToCode());
			obj.setMtdPara05FmCode(request.getMtdPara05FmCode());
			obj.setMtdPara05ToCode(request.getMtdPara05ToCode());
			obj.setMtdPara06FmCode(request.getMtdPara06FmCode());
			obj.setMtdPara06ToCode(request.getMtdPara06ToCode());
			obj.setMtdPara07FmCode(request.getMtdPara07FmCode());
			obj.setMtdPara07ToCode(request.getMtdPara07ToCode());
			obj.setMtdPara08FmCode(request.getMtdPara08FmCode());
			obj.setMtdPara08ToCode(request.getMtdPara08ToCode());
			obj.setMtdPremRate(request.getMtdPremRate());
			obj.setMtdMinPremRate(request.getMtdMinPremRate());
			obj.setMtdMaxPremRate(request.getMtdMaxPremRate());
			obj.setMtdRiPremRate(request.getMtdRiPremRate());
			obj.setMtdRiPremRatePer(request.getMtdRiPremRatePer());
			obj.setMtdMinSiLc1(request.getMtdMinSiLc1());
			obj.setMtdMaxSiLc1(request.getMtdMaxSiLc1());
			obj.setMtdMinPremLc1(request.getMtdMinPremLc1());
			obj.setMtdMaxPremLc1(request.getMtdMaxPremLc1());
			obj.setMtdDfltSi(request.getMtdDfltSi());
			obj.setMtdDiscCode1(request.getMtdDiscCode1());
			obj.setMtdDisc1Value(request.getMtdDisc1Value());
			obj.setMtdDiscCode2(request.getMtdDiscCode2());
			obj.setMtdDisc2Value(request.getMtdDisc2Value());
			obj.setMtdDiscCode3(request.getMtdDiscCode3());
			obj.setMtdDisc3Value(request.getMtdDisc3Value());
			obj.setMtdDiscCode4(request.getMtdDiscCode4());
			obj.setMtdDisc4Value(request.getMtdDisc4Value());
			obj.setMtdDiscCode5(request.getMtdDiscCode5());
			obj.setMtdDisc5Value(request.getMtdDisc5Value());
			obj.setMtdLoadCode1(request.getMtdLoadCode1());
			obj.setMtdLoad1Value(request.getMtdLoad1Value());
			obj.setMtdLoadCode2(request.getMtdLoadCode2());
			obj.setMtdLoad2Value(request.getMtdLoad2Value());
			obj.setMtdLoadCode3(request.getMtdLoadCode3());
			obj.setMtdLoad3Value(request.getMtdLoad3Value());
			obj.setMtdDedCode1(request.getMtdDedCode1());
			obj.setMtdDed1Value(request.getMtdDed1Value());
			obj.setMtdDedCode2(request.getMtdDedCode2());
			obj.setMtdDed2Value(request.getMtdDed2Value());
			obj.setMtdDedCode3(request.getMtdDedCode3());
			obj.setMtdDed3Value(request.getMtdDed3Value());
			obj.setMtdDedCode4(request.getMtdDedCode4());
			obj.setMtdDed4Value(request.getMtdDed4Value());

		}

		result.setObject(obj);
		return result;
	}

}
