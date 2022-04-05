//package com.navi.live.bean;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EntityListeners;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
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
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import com.navi.live.enumeration.Status;
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
//@Table(name = "M_LIFE_DOCS")
//@EntityListeners(AuditingEntityListener.class)
//public class MLifeDocs implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	// --- ENTITY PRIMARY KEY
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_MLD_ID")
//	@SequenceGenerator(sequenceName = "S_MLD_ID", allocationSize = 1, name = "S_MLD_ID")
//	@Column(name = "MLD_SYS_ID", nullable = false)
//	private BigDecimal mldSysId;
//
//	@Column(name = "MLD_DOC_CATG", length = 12)
//	private String mldDocCatg;
//
//	@Column(name = "MLD_DOC_DESC", length = 100)
//	private String mldDocDesc;
//
//	@Column(name = "MLD_DOC_ID", length = 12)
//	private String mldDocId;
//
//	@Column(name = "MLD_DOC_CATG_IDENTIF", length = 4000)
//	private String mldDocCatgIdentif;
//
//	@Column(name = "MLD_DOC_CATG_MAND_YN", length = 1)
//	private String mldDocCatgMandYn;
//
//	@Enumerated(EnumType.STRING)
//	@Column(name = "MLD_STATUS", length = 1)
//	private Status mldStatus;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name = "MLD_EFF_FM_DT")
//	private Date mldEffFmDt;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name = "MLD_EFF_TO_DT")
//	private Date mldEffToDt;
//
//	@Column(name = "MLD_CR_UID", length = 50)
//	private String mldCrUid;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name = "MLD_CR_DT")
//	private Date mldCrDt;
//
//	@Column(name = "MLD_UPD_UID", length = 50)
//	private String mldUpdUid;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name = "MLD_UPD_DT")
//	private Date mldUpdDt;
//
//	// --- ENTITY LINKS ( RELATIONSHIP )
//
//}
//
