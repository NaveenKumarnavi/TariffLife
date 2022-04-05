//package com.navi.live.bean;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EntityListeners;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//import org.hibernate.annotations.DynamicInsert;
//import org.hibernate.annotations.DynamicUpdate;
//import org.springframework.data.annotation.CreatedBy;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedBy;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@Entity
//@DynamicInsert
//@DynamicUpdate
//@Builder
//@Table(name = "M_PROD_SCH_MAND_QA_DOCS")
//@EntityListeners(AuditingEntityListener.class)
//public class MProdSchMandQaDocs implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	// --- ENTITY PRIMARY KEY
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_PSM_ID")
//	@SequenceGenerator(sequenceName = "S_PSM_ID", allocationSize = 1, name = "S_PSM_ID")
//	@Column(name = "PSM_SYS_ID", nullable = false)
//	private BigDecimal psmSysId;
//
//	// --- ENTITY DATA FIELDS
//	@Column(name = "PSM_COMP_CODE", length = 12)
//	private String psmCompCode;
//
//	@Column(name = "PSM_PROD_CODE", length = 12)
//	private String psmProdCode;
//
//	@Column(name = "PSM_SCH_FM_CODE", length = 12)
//	private String psmSchFmCode;
//
//	@Column(name = "PSM_SCH_TO_CODE", length = 12)
//	private String psmSchToCode;
//
//	@Column(name = "PSM_DOC_CATG", length = 12)
//	private String psmDocCatg;
//
//	@Column(name = "PSM_DOC_ID", length = 12)
//	private String psmDocId;
//
//	@Column(name = "PSM_AGE_FM")
//	private BigDecimal psmAgeFm;
//
//	@Column(name = "PSM_AGE_TO")
//	private BigDecimal psmAgeTo;
//
//	@Column(name = "PSM_SI_FM")
//	private BigDecimal psmSiFm;
//
//	@Column(name = "PSM_SI_TO")
//	private BigDecimal psmSiTo;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name = "PSM_EFF_FM_DT")
//	private Date psmEffFmDt;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name = "PSM_EFF_TO_DT")
//	private Date psmEffToDt;
//
//	@Column(name = "PSM_STATUS", length = 1)
//	private String psmStatus;
//
//	@CreatedBy
//	@Column(name = "PSM_CR_UID", length = 50)
//	private String psmCrUid;
//
//	@CreatedDate
//	@Column(name = "PSM_CR_DT")
//	private LocalDateTime psmCrDt;
//
//	@LastModifiedBy
//	@Column(name = "PSM_UPD_UID", length = 50)
//	private String psmUpdUid;
//
//	@LastModifiedDate
//	@Column(name = "PSM_UPD_DT")
//	private LocalDateTime psmUpdDt;
//
//
//}
//
