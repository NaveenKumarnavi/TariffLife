package com.navi.live.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@DynamicInsert
@DynamicUpdate
@Builder
@EntityListeners(AuditingEntityListener.class)
@Table(name = "M_TARIFF_LIFE_DETAIL")
public class MTariffLifeDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_MTD_ID")
	@SequenceGenerator(sequenceName = "S_MTD_ID", allocationSize = 1, name = "S_MTD_ID")
	@Column(name = "MTD_ID", nullable = false)
	private BigDecimal mtdId;

	@Column(name = "MTD_MTH_ID", nullable = false)
	private BigDecimal mtdMthId;

	@Column(name = "MTD_EFF_FM_DT", nullable = false)
	private Date mtdEffFmDt;

	@Column(name = "MTD_EFF_TO_DT", nullable = false)
	private Date mtdEffToDt;

	@Column(name = "MTD_SMOKE_FM_CODE", length = 12)
	private String mtdSmokeFmCode;

	@Column(name = "MTD_SMOKE_TO_CODE", length = 12)
	private String mtdSmokeToCode;

	@Column(name = "MTD_GENDER_FM_CODE", length = 12)
	private String mtdGenderFmCode;

	@Column(name = "MTD_GENDER_TO_CODE", length = 12)
	private String mtdGenderToCode;

	@Column(name = "MTD_AGE_FM", length = 99)
	private BigDecimal mtdAgeFm;

	@Column(name = "MTD_AGE_TO", length = 99)
	private BigDecimal mtdAgeTo;

	@Column(name = "MTD_POLICY_TERM_FM", length = 99)
	private BigDecimal mtdPolicytermFm;

	@Column(name = "MTD_POLICY_TERM_TO", length = 99)
	private BigDecimal mtdPolicyTermTo;

	@Column(name = "MTD_NO_SEATS_FM", length = 99)
	private BigDecimal mtdNoSeatsFm;

	@Column(name = "MTD_NO_SEATS_TO", length = 99)
	private BigDecimal mtdNoSeatsTo;

	@Column(name = "MTD_SUM_ASSURED_LIMIT_FM")
	private BigDecimal mtdSumAssuredLimitFm;

	@Column(name = "MTD_SUM_ASSURED_LIMIT_TO")
	private BigDecimal mtdSumAssuredLimitTo;

	@Column(name = "MTD_MATURITY_AGE_FM", length = 99)
	private BigDecimal mtdMaturityAgeFm;

	@Column(name = "MTD_MATURITY_AGE_TO", length = 99)
	private BigDecimal mtdMaturityAgeTo;

	@Column(name = "MTD_HEIGHT_FM")
	private BigDecimal mtdHeightFm;

	@Column(name = "MTD_HEIGHT_TO")
	private BigDecimal mtdHeightto;

	@Column(name = "MTD_WEIGHT_FM")
	private BigDecimal mtdWeightFm;

	@Column(name = "MTD_WEIGHT_TO")
	private BigDecimal mtdWeightTo;

	@Column(name = "MTD_INSURED_TYPE_FM_CODE", length = 12)
	private String mtdInsuredTypeFmCode;

	@Column(name = "MTD_INSURED_TYPE_TO_CODE", length = 12)
	private String mtdInsuredTypeToCode;

	@Column(name = "MTD_CHILD_AGE_FM", length = 99)
	private BigDecimal mtdChildAgeFm;

	@Column(name = "MTD_CHILD_AGE_TO", length = 99)
	private BigDecimal mtdChildAgeTo;

	@Column(name = "MTD_ADULT_CNT_FM")
	private BigDecimal mtdAdultCntFm;

	@Column(name = "MTD_ADULT_CNT_TO")
	private BigDecimal mtdAdultCntTo;

	@Column(name = "MTD_CHILD_CNT_FM")
	private BigDecimal mtdChildCntFm;

	@Column(name = "MTD_CHILD_CNT_TO")
	private BigDecimal mtdChildCntTo;

	@Column(name = "MTD_OCC_FM_CODE", length = 12)
	private String mtdOccFmCode;

	@Column(name = "MTD_OCC_TO_CODE", length = 12)
	private String mtdOccToCode;

	@Column(name = "MTD_PREM_FQ_TO_CODE", length = 12)
	private String mtdPremfqToCode;

	@Column(name = "MTD_PREM_FQ_FM_CODE", length = 12)
	private String mtdPremFqFmCode;

	@Column(name = "MTD_PARA_01_FM_CODE", length = 12)
	private String mtdPara01FmCode;

	@Column(name = "MTD_PARA_01_TO_CODE", length = 12)
	private String mtdPara01ToCode;

	@Column(name = "MTD_PARA_02_FM_CODE", length = 12)
	private String mtdPara02FmCode;

	@Column(name = "MTD_PARA_02_TO_CODE", length = 12)
	private String mtdPara02ToCode;

	@Column(name = "MTD_PARA_03_FM_CODE", length = 12)
	private String mtdPara03FmCode;

	@Column(name = "MTD_PARA_03_TO_CODE", length = 12)
	private String mtdPara03ToCode;

	@Column(name = "MTD_PARA_04_FM_CODE", length = 9999)
	private BigDecimal mtdPara04FmCode;

	@Column(name = "MTD_PARA_04_TO_CODE", length = 9999)
	private BigDecimal mtdPara04ToCode;

	@Column(name = "MTD_PARA_05_FM_CODE", length = 9999)
	private BigDecimal mtdPara05FmCode;

	@Column(name = "MTD_PARA_05_TO_CODE", length = 9999)
	private BigDecimal mtdPara05ToCode;

	@Column(name = "MTD_PARA_06_FM_CODE", length = 12)
	private String mtdPara06FmCode;

	@Column(name = "MTD_PARA_06_TO_CODE", length = 12)
	private String mtdPara06ToCode;

	@Column(name = "MTD_PARA_07_FM_CODE", length = 12)
	private String mtdPara07FmCode;

	@Column(name = "MTD_PARA_07_TO_CODE", length = 12)
	private String mtdPara07ToCode;

	@Column(name = "MTD_PARA_08_FM_CODE", length = 12)
	private String mtdPara08FmCode;

	@Column(name = "MTD_PARA_08_TO_CODE", length = 12)
	private String mtdPara08ToCode;

	@Column(name = "MTD_PREM_RATE")
	private BigDecimal mtdPremRate;

	@Column(name = "MTD_MIN_PREM_RATE")
	private BigDecimal mtdMinPremRate;

	@Column(name = "MTD_MAX_PREM_RATE")
	private BigDecimal mtdMaxPremRate;

	@Column(name = "MTD_RI_PREM_RATE")
	private BigDecimal mtdRiPremRate;

	@Column(name = "MTD_RI_PREM_RATE_PER")
	private BigDecimal mtdRiPremRatePer;

	@Column(name = "MTD_MIN_SI_LC_1")
	private BigDecimal mtdMinSiLc1;

	@Column(name = "MTD_MAX_SI_LC_1")
	private BigDecimal mtdMaxSiLc1;

	@Column(name = "MTD_MIN_PREM_LC_1")
	private BigDecimal mtdMinPremLc1;

	@Column(name = "MTD_MAX_PREM_LC_1")
	private BigDecimal mtdMaxPremLc1;

	@Column(name = "MTD_DFLT_SI")
	private BigDecimal mtdDfltSi;

	@Column(name = "MTD_DISC_CODE_1", length = 12)
	private String mtdDiscCode1;

	@Column(name = "MTD_DISC_1_VALUE")
	private BigDecimal mtdDisc1Value;

	@Column(name = "MTD_DISC_CODE_2", length = 12)
	private String mtdDiscCode2;

	@Column(name = "MTD_DISC_2_VALUE")
	private BigDecimal mtdDisc2Value;

	@Column(name = "MTD_DISC_CODE_3", length = 12)
	private String mtdDiscCode3;

	@Column(name = "MTD_DISC_3_VALUE")
	private BigDecimal mtdDisc3Value;

	@Column(name = "MTD_DISC_CODE_4", length = 12)
	private String mtdDiscCode4;

	@Column(name = "MTD_DISC_4_VALUE")
	private BigDecimal mtdDisc4Value;

	@Column(name = "MTD_DISC_CODE_5", length = 12)
	private String mtdDiscCode5;

	@Column(name = "MTD_DISC_5_VALUE")
	private BigDecimal mtdDisc5Value;

	@Column(name = "MTD_LOAD_CODE_1", length = 12)
	private String mtdLoadCode1;

	@Column(name = "MTD_LOAD_1_VALUE")
	private BigDecimal mtdLoad1Value;

	@Column(name = "MTD_LOAD_CODE_2", length = 12)
	private String mtdLoadCode2;

	@Column(name = "MTD_LOAD_2_VALUE")
	private BigDecimal mtdLoad2Value;

	@Column(name = "MTD_LOAD_CODE_3", length = 12)
	private String mtdLoadCode3;

	@Column(name = "MTD_LOAD_3_VALUE")
	private BigDecimal mtdLoad3Value;

	@Column(name = "MTD_DED_CODE_1", length = 12)
	private String mtdDedCode1;

	@Column(name = "MTD_DED_1_VALUE")
	private BigDecimal mtdDed1Value;

	@Column(name = "MTD_DED_CODE_2", length = 12)
	private String mtdDedCode2;

	@Column(name = "MTD_DED_2_VALUE")
	private BigDecimal mtdDed2Value;

	@Column(name = "MTD_DED_CODE_3", length = 12)
	private String mtdDedCode3;

	@Column(name = "MTD_DED_3_VALUE")
	private BigDecimal mtdDed3Value;

	@Column(name = "MTD_DED_CODE_4", length = 12)
	private String mtdDedCode4;

	@Column(name = "MTD_DED_4_VALUE")
	private BigDecimal mtdDed4Value;

	@CreatedBy
	@Column(name = "MTD_CR_UID")
	private String mtdCrUid;

	@CreatedDate
	@Column(name = "MTD_CR_DT")
	private LocalDateTime mtdCrDt;

	@LastModifiedBy
	@Column(name = "MTD_UPD_UID")
	private String mtdUpdUid;

	@LastModifiedDate
	@Column(name = "MTD_UPD_DT")
	private LocalDateTime mtdUpdDt;

}
