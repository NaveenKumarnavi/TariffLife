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
//@Table(name = "M_PROD_SCH_APPL_LIFE_QA")
//@EntityListeners(AuditingEntityListener.class)
//public class MProdSchApplLifeQa implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	// --- ENTITY PRIMARY KEY
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_PSAQ_ID")
//	@SequenceGenerator(sequenceName = "S_PSAQ_ID", allocationSize = 1, name = "S_PSAQ_ID")
//	@Column(name = "PSAQ_SYS_ID", nullable = false)
//	private BigDecimal psaqSysId;
//
//	// --- ENTITY DATA FIELDS
//	@Column(name = "PSAQ_COMP_CODE", length = 12)
//	private String psaqCompCode;
//
//	@Column(name = "PSAQ_PROD_CODE", length = 12)
//	private String psaqProdCode;
//
//	@Column(name = "PSAQ_SCH_FM_CODE", length = 12)
//	private String psaqSchFmCode;
//
//	@Column(name = "PSAQ_SCH_TO_CODE", length = 12)
//	private String psaqSchToCode;
//
//	@Column(name = "PSAQ_LEVEL")
//	private BigDecimal psaqLevel;
//
//	@Column(name = "PSAQ_QST_CODE")
//	private BigDecimal psaqQstCode;
//
//	@Column(name = "PSAQ_QST_MAND", length = 1)
//	private String psaqQstMand;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name = "PSAQ_EFF_FM_DT")
//	private Date psaqEffFmDt;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name = "PSAQ_EFF_TO_DT")
//	private Date psaqEffToDt;
//
//	@Column(name = "PSAQ_STATUS", length = 1)
//	private String psaqStatus;
//
//	@CreatedBy
//	@Column(name = "PSAQ_CR_UID", length = 50)
//	private String psaqCrUid;
//
//	@CreatedDate
//	@Column(name = "PSAQ_CR_DT")
//	private LocalDateTime psaqCrDt;
//
//	@LastModifiedBy
//	@Column(name = "PSAQ_UPD_UID", length = 50)
//	private String psaqUpdUid;
//
//	@LastModifiedDate
//	@Column(name = "PSAQ_UPD_DT")
//	private LocalDateTime psaqUpdDt;
//
//}
//
