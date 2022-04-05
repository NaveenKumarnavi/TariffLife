//package com.navi.live.bean;
//
//import java.io.Serializable;
//import java.time.LocalDateTime;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EntityListeners;
//import javax.persistence.Id;
//import javax.persistence.IdClass;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.persistence.Transient;
//
//import org.hibernate.annotations.DynamicInsert;
//import org.hibernate.annotations.DynamicUpdate;
//import org.springframework.data.annotation.CreatedBy;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedBy;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
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
//@EntityListeners(AuditingEntityListener.class)
//@Table(name = "M_PROD_SCHEMES")
//@IdClass(MProdSchemesId.class)
//public class MProdSchemes implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	// --- ENTITY PRIMARY KEY
//	@Id
//	@Column(name = "PSCH_PROD_CODE", nullable = false, length = 12)
//	private String pschProdCode;
//
//	@Id
//	@Column(name = "PSCH_COMP_CODE", nullable = false, length = 12)
//	private String pschCompCode;
//
//	@Id
//	@Column(name = "PSCH_SCHEME_CODE", nullable = false, length = 12)
//	private String pschSchemeCode;
//
//	// --- ENTITY DATA FIELDS
//	@Column(name = "PSCH_SCHEME_NAME", length = 240)
//	private String pschSchemeName;
//
//	@Column(name = "PSCH_SCHEME_NAME_BL", length = 240)
//	private String pschSchemeNameBl;
//
//	@Column(name = "PSCH_SEP_PREM_ENTRY_YN", length = 1)
//	private String pschSepPremEntryYn;
//
//	@Column(name = "PSCH_SEP_DISC_ENTRY_YN", length = 1)
//	private String pschSepDiscEntryYn;
//
//	@Column(name = "PSCH_SEP_LOAD_ENTRY_YN", length = 1)
//	private String pschSepLoadEntryYn;
//
//	@Column(name = "PSCH_SEP_FEES_ENTRY_YN", length = 1)
//	private String pschSepFeesEntryYn;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name = "PSCH_EFF_FM_DT")
//	private Date pschEffFmDt;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name = "PSCH_EFF_TO_DT")
//	private Date pschEffToDt;
//
//	@CreatedBy
//	@Column(name = "PSCH_CR_UID",length = 12)
//	private String pschCrUid;
//
//	@CreatedDate
//	@Column(name = "PSCH_CR_DT")
//	private LocalDateTime pschCrDt;
//
//	@LastModifiedBy
//	@Column(name = "PSCH_UPD_UID", length = 12)
//	private String pschUpdUid;
//
//	@LastModifiedDate
//	@Column(name = "PSCH_UPD_DT")
//	private LocalDateTime pschUpdDt;
//
//	@Column(name = "PSCH_LONG_DESC", length = 4000)
//	private String pschLongDesc;
//
//	@Column(name = "PSCH_DFLT_FAC_POOL", length = 12)
//	private String pschDfltFacPool;
//
//	@Column(name = "PSCH_RISK_URL", length = 60)
//	private String pschRiskUrl;
//
//	@Column(name = "PSCH_SEP_TAX_ENTRY_YN", length = 1)
//	private String pschSepTaxEntryYn;
//
//	@Transient
//	private Boolean check;
//
////    //--- ENTITY LINKS ( RELATIONSHIP )
////    @OneToMany(mappedBy="mProdSchemes")
////    private List<MProdSchApplCover> listOfMProdSchApplCover ; 
////
////    @OneToMany(mappedBy="mProdSchemes")
////    private List<MProdSchApplDed> listOfMProdSchApplDed ; 
////
////    @OneToMany(mappedBy="mProdSchemes")
////    private List<MProdSchApplSmi> listOfMProdSchApplSmi ; 
////
////    @OneToMany(mappedBy="mProdSchemes")
////    private List<MProdSchApplCatg> listOfMProdSchApplCatg ; 
////
////    @ManyToOne
////    @JoinColumn(name="PSCH_COMP_CODE", referencedColumnName="COMP_CODE", insertable=false, updatable=false)
////    private MCompany   mCompany ; 
////
////    @OneToMany(mappedBy="mProdSchemes")
////    private List<MProdSchApplCond> listOfMProdSchApplCond ; 
////
////    @OneToMany(mappedBy="mProdSchemes")
////    private List<MProdSchApplFee> list
//}
//
//
