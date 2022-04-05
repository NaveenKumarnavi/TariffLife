//package com.navi.live.bean;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
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
//@Table(name = "M_LIFE_QA")
//public class MLifeQA implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	// --- ENTITY PRIMARY KEY
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_MLQ_ID")
//	@SequenceGenerator(sequenceName = "S_MLQ_ID", allocationSize = 1, name = "S_MLQ_ID")
//	@Column(name = "MLQ_SYS_ID", nullable = false)
//	private BigDecimal mlqSysId;
//
//	// --- ENTITY DATA FIELDS
//	@Column(name = "MLQ_QST_CATG", length = 12)
//	private String mlqQstCatg;
//
//	@Column(name = "MLQ_QST_CODE")
//	private BigDecimal mlqQstCode;
//
//	@Column(name = "MLQ_QST_DESC", length = 1000)
//	private String mlqQstDesc;
//
//	@Column(name = "MLQ_QST_LONG_DESC", length = 2000)
//	private String mlqQstLongDesc;
//
//	@Column(name = "MLQ_ANS_TYPE", length = 10)
//	private String mlqAnsType;
//
//	@Column(name = "MLQ_ANS_OPTIONS", length = 4000)
//	private String mlqAnsOptions;
//
//	@Column(name = "MLQ_SUB_QST_CODE")
//	private BigDecimal mlqSubQstCode;
//
//	@Column(name = "MLQ_STATUS", length = 1)
//	private String mlqStatus;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name = "MLQ_EFF_FM_DT")
//	private Date mlqEffFmDt;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name = "MLQ_EFF_TO_DT")
//	private Date mlqEffToDt;
//
//	@CreatedBy
//	@Column(name = "MLQ_CR_UID", length = 50)
//	private String mlqCrUid;
//
//	@CreatedDate
//	@Column(name = "MLQ_CR_DT")
//	private LocalDateTime mlqCrDt;
//
//	@LastModifiedBy
//	@Column(name = "MLQ_UPD_UID", length = 50)
//	private String mlqUpdUid;
//
//	@LastModifiedDate
//	@Column(name = "MLQ_UPD_DT")
//	private LocalDateTime mlqUpdDt;
//
//}
//
