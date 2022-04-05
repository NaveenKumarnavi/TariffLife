//package com.navi.liv.excelHelper;
//
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.text.ParseException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.navi.live.bean.MTariffLifeDetails;
//import com.navi.live.service.MTariffLifeDetailsService;
//import com.navi.live.util.ValidationUtil;
//
//
//@Service
//public class ExcelHelper {
//
////	@Autowired
////	private MProdSchApplCondService entityService;
////
////	@Autowired
////	private MPolWordingsService mPolWordingsService;
//	
//	@Autowired
//	private MTariffLifeDetailsService lifeService;
//
////	public byte[] downloadExcelConditions(List<MProdSchApplCond> obj) {
////
////		try {
////
////			Resource resource = new ClassPathResource("Condition_Template.xlsx");
////			InputStream fileStream = resource.getInputStream();
////
////			XSSFWorkbook workbook = new XSSFWorkbook(fileStream);
////			XSSFSheet worksheet = workbook.getSheetAt(0);
////			int rowvariable = 1;
////			Cell cell = null;
////			for (MProdSchApplCond newObj : obj) {
////				Row row = worksheet.createRow(rowvariable);
////
////				cell = row.createCell(0);
////				cell.setCellValue(ValidationUtil.convertString(newObj.getPsacSysId()));
////				cell = row.createCell(1);
////				cell.setCellValue(newObj.getPsacProdCode());
////				cell = row.createCell(2);
////				cell.setCellValue(newObj.getPsacCompCode());
////				cell = row.createCell(3);
////				cell.setCellValue(newObj.getPsacSchCode());
////				cell = row.createCell(4);
////				cell.setCellValue(newObj.getPsacCode());
////				cell = row.createCell(5);
////				cell.setCellValue(newObj.getPsacCvrCode());
////				cell = row.createCell(6);
////				cell.setCellValue(newObj.getPsacLvl());
////				cell = row.createCell(7);
////				cell.setCellValue(newObj.getPsacType());
////				cell = row.createCell(8);
////				cell.setCellValue(newObj.getPsacDfltYn());
////				cell = row.createCell(9);
////				cell.setCellValue(newObj.getPsacDesc());
////				cell = row.createCell(10);
////				cell.setCellValue(newObj.getPsacDescBl());
////				cell = row.createCell(11);
////				cell.setCellValue(newObj.getPsacShortDesc());
////				cell = row.createCell(12);
////				cell.setCellValue(newObj.getPsacShortDescBl());
////				cell = row.createCell(13);
////				cell.setCellValue(newObj.getPsacLongDesc());
////				cell = row.createCell(14);
////				cell.setCellValue(newObj.getPsacLongDescBl());
////				cell = row.createCell(15);
////				cell.setCellValue(ValidationUtil.format(newObj.getPsacEffFmDt()));
////				cell = row.createCell(16);
////				cell.setCellValue(ValidationUtil.format(newObj.getPsacEffToDt()));
////				cell = row.createCell(17);
////				cell.setCellValue(ValidationUtil.convertString(newObj.getPsacSrNo()));
////				cell = row.createCell(18);
////				cell.setCellValue(ValidationUtil.format(newObj.getPsacCrDt()));
////				cell = row.createCell(19);
////				cell.setCellValue(newObj.getPsacCrUid());
////				cell = row.createCell(20);
////				cell.setCellValue(ValidationUtil.format(newObj.getPsacUpdDt()));
////				cell = row.createCell(21);
////				cell.setCellValue(newObj.getPsacUpdUid());
////				cell = row.createCell(22);
////				cell.setCellValue(newObj.getPascConvType());
////				cell = row.createCell(23);
////				cell.setCellValue(newObj.getRemarks());
////
////				rowvariable++;
////
////			}
////
////			ByteArrayOutputStream bos = new ByteArrayOutputStream();
////			workbook.write(bos);
////			workbook.close();
////			byte[] barray = bos.toByteArray();
////
////			return barray;
////		}
////
////		catch (Exception e) {
////			throw new RuntimeException("fail to export data to Excel file: " + e.getMessage());
////		}
////
////	}
//
//	public byte[] downloadExcelPolWordings(List<MPolWordings> obj) {
//
//		try {
//
//			Resource resource = new ClassPathResource("Polwordings_Template.xlsx");
//			InputStream fileStream = resource.getInputStream();
//
//			XSSFWorkbook workbook = new XSSFWorkbook(fileStream);
//			XSSFSheet worksheet = workbook.getSheetAt(0);
//			int rowvariable = 1;
//			Cell cell = null;
//			for (MPolWordings newObj : obj) {
//				Row row = worksheet.createRow(rowvariable);
//
//				cell = row.createCell(0);
//				cell.setCellValue(ValidationUtil.convertString(newObj.getPwSysId()));
//				cell = row.createCell(1);
//				cell.setCellValue(newObj.getPwProductCode());
//				cell = row.createCell(2);
//				cell.setCellValue(newObj.getPwWordingType());
//				cell = row.createCell(3);
//				cell.setCellValue(newObj.getPwPageName());
//				cell = row.createCell(4);
//				cell.setCellValue(ValidationUtil.convertString(newObj.getPwPageno()));
//				cell = row.createCell(5);
//				cell.setCellValue(newObj.getPwPageOrder());
//				cell = row.createCell(6);
//				cell.setCellValue(ValidationUtil.convertString(newObj.getPwPageLineNo()));
//				cell = row.createCell(7);
//				cell.setCellValue(newObj.getPwDisplayText1());
//				cell = row.createCell(8);
//				cell.setCellValue(newObj.getPwDisplayText2());
//				cell = row.createCell(9);
//				cell.setCellValue(newObj.getPwDisplayText3());
//				cell = row.createCell(10);
//				cell.setCellValue(newObj.getPwAllignment());
//				cell = row.createCell(11);
//				cell.setCellValue(newObj.getPwFontsize());
//				cell = row.createCell(12);
//				cell.setCellValue(newObj.getPwTextformat());
//				cell = row.createCell(13);
//				cell.setCellValue(newObj.getPwLvl());
//				cell = row.createCell(14);
//				cell.setCellValue(newObj.getPwCoverCode());
//				cell = row.createCell(15);
//				cell.setCellValue(newObj.getPwDynamicColumn1());
//				cell = row.createCell(16);
//				cell.setCellValue(newObj.getPwDynamicColumn2());
//				cell = row.createCell(17);
//				cell.setCellValue(newObj.getPwDynamicColumn3());
//				cell = row.createCell(18);
//				cell.setCellValue(newObj.getRemarks());
//
//				rowvariable++;
//
//			}
//
//			ByteArrayOutputStream bos = new ByteArrayOutputStream();
//			workbook.write(bos);
//			workbook.close();
//			byte[] barray = bos.toByteArray();
//
//			return barray;
//		}
//
//		catch (Exception e) {
//			throw new RuntimeException("fail to export data to Excel file: " + e.getMessage());
//		}
//
//	}
//
//	public MProdSchApplConExcelDto uploadExcelConditions(MultipartFile file, String prodCode, String schCode,
//			String compCode) {
//
//		List<String> errors = null;
//
//		int totalRecords = 0;
//		int uploadRecords = 0;
//		int errorRecords = 0;
//
//		MProdSchApplConExcelDto value = new MProdSchApplConExcelDto();
//
//		List<MProdSchApplCond> list = new ArrayList<MProdSchApplCond>();
//
//		try (XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream())) {
//			XSSFSheet worksheet = workbook.getSheetAt(0);
//
//			DataFormatter formatter = new DataFormatter();
//
//			totalRecords = worksheet.getPhysicalNumberOfRows() - 1;
//
//			for (int i = 1; i < worksheet.getPhysicalNumberOfRows(); i++) {
//
//				MProdSchApplCond obj = new MProdSchApplCond();
//
//				XSSFRow row = worksheet.getRow(i);
//
////				String psacProdCode = formatter.formatCellValue(row.getCell(1));
////				String psacCompCode = formatter.formatCellValue(row.getCell(2));
////				String psacSchCode = formatter.formatCellValue(row.getCell(3));
//				String psacCode = formatter.formatCellValue(row.getCell(4));
//				String psacCvrCode = formatter.formatCellValue(row.getCell(5));
//				String psacLvl = formatter.formatCellValue(row.getCell(6));
//				String psacType = formatter.formatCellValue(row.getCell(7));
//				String psacDfltYn = formatter.formatCellValue(row.getCell(8));
//				String psacDesc = formatter.formatCellValue(row.getCell(9));
//				String psacDescBl = formatter.formatCellValue(row.getCell(10));
//				String psacShortDesc = formatter.formatCellValue(row.getCell(11));
//				String psacShortDescBl = formatter.formatCellValue(row.getCell(12));
//				String psacLongDesc = formatter.formatCellValue(row.getCell(13));
//				String psacLongDescBl = formatter.formatCellValue(row.getCell(14));
//				String psacEffFmDt = formatter.formatCellValue(row.getCell(15));
//				String psacEffToDt = formatter.formatCellValue(row.getCell(16));
//				String psacSrNo = formatter.formatCellValue(row.getCell(17));
//				String pascConvType = formatter.formatCellValue(row.getCell(22));
//
//				errors = new ArrayList<>();
//
//				Optional<MProdSchApplCond> optional = entityService.findByData(psacCode, prodCode, schCode, compCode);
//
//				if (optional.isPresent()) {
//					errors.add("Already Exist");
//				}
//
//				if (ValidationUtil.isNull(psacCode)) {
//					errors.add(" Condition Code is required");
//				}
//
//				if (ValidationUtil.isValidLength(psacCode, 12)) {
//					errors.add("Condition Code Maximum length should be 12");
//				}
//
//				if (ValidationUtil.isValidLength(psacCvrCode, 12)) {
//					errors.add("Cover Code Maximum length should be 12");
//				}
//
//				if (ValidationUtil.isValidLength(psacLvl, 1)) {
//					errors.add("Level Maximum length should be 1");
//				}
//
//				if (ValidationUtil.isValidLength(psacType, 12)) {
//					errors.add("Contiton Type Maximum length should be 12");
//				}
//
//				if (ValidationUtil.isValidLength(psacDesc, 240)) {
//					errors.add("Description Maximum length should be 240");
//				}
//
//				if (ValidationUtil.isValidLength(psacDescBl, 240)) {
//					errors.add("Desc Bl Maximum length should be 240");
//				}
//
//				if (ValidationUtil.isValidLength(psacShortDesc, 60)) {
//					errors.add("Short Desc Maximum length should be 60");
//				}
//
//				if (ValidationUtil.isValidLength(psacShortDescBl, 60)) {
//					errors.add("Short Desc Bl Type Maximum length should be 60");
//				}
//
//				if (ValidationUtil.isValidLength(psacLongDesc, 4000)) {
//					errors.add("Long Desc Maximum length should be 4000");
//				}
//
//				if (ValidationUtil.isValidLength(psacLongDescBl, 4000)) {
//					errors.add("LongDescBl Maximum length should be 4000");
//				}
//
//				if (ValidationUtil.isValidYesOrNo(psacDfltYn)) {
//					errors.add("Please enter the default value 0 or 1");
//				}
//				if (ValidationUtil.isNull(psacLvl)) {
//					errors.add("Please enter the Level S or C");
//				}
//
//				if (ValidationUtil.isCheckChar(psacLvl)) {
//					errors.add("Please enter the Level S or C");
//				}
//
//				if (psacLvl.charAt(0) == 'S') {
//					if (!ValidationUtil.isNull(psacCvrCode)) {
//						errors.add("Please remove the Cover Code");
//					}
//				}
//
//				if (psacLvl.charAt(0) == 'C') {
//					if (ValidationUtil.isNull(psacCvrCode)) {
//						errors.add("Please enter the cover code");
//					}
//				}
//
//				if (ValidationUtil.isNull(ValidationUtil.covertDate(psacEffFmDt))) {
//					errors.add("Effective from date is required");
//				}
//
//				if (ValidationUtil.isNull(ValidationUtil.covertDate(psacEffToDt))) {
//					errors.add("Effective To date is required");
//				}
//
//				if (ValidationUtil.isGreaterThan(ValidationUtil.covertDate(psacEffFmDt),
//						ValidationUtil.covertDate(psacEffToDt))) {
//					errors.add("From Date is Greater than To Date");
//				}
//
//				obj.setPsacProdCode(prodCode);
//				obj.setPsacCompCode(compCode);
//				obj.setPsacSchCode(schCode);
//				obj.setPsacCode(psacCode);
//				obj.setPsacCvrCode(psacCvrCode);
//				obj.setPsacLvl(psacLvl);
//				obj.setPsacType(psacType);
//				obj.setPsacDfltYn(psacDfltYn);
//				obj.setPsacDesc(psacDesc);
//				obj.setPsacDescBl(psacDescBl);
//				obj.setPsacShortDesc(psacShortDesc);
//				obj.setPsacShortDescBl(psacShortDescBl);
//				obj.setPsacLongDesc(psacLongDesc);
//				obj.setPsacLongDescBl(psacLongDescBl);
//				obj.setPsacEffFmDt(ValidationUtil.covertDate(psacEffFmDt));
//				obj.setPsacEffToDt(ValidationUtil.covertDate(psacEffToDt));
//				obj.setPsacSrNo(psacSrNo != "" ? ValidationUtil.convertBigDecimal(psacSrNo) : null);
//				obj.setPascConvType(pascConvType);
//
//				if (errors.size() > 0) {
//
//					String errorMessage = errors.stream().map(a -> String.valueOf(a)).collect(Collectors.joining(", "));
//					obj.setRemarks(errorMessage);
//					list.add(obj);
//					errorRecords++;
//
//				} else {
//
//					entityService.saveorupdate(obj);
//					uploadRecords++;
//				}
//
//				value.setConditionsList(list);
//				value.setErrorRecords(errorRecords);
//				value.setTotalRecords(totalRecords);
//				value.setUploadRecords(uploadRecords);
//
//			}
//		} catch (IOException | ParseException e) {
//
//			e.printStackTrace();
//
//		}
//
//		return value;
//	}
//
//	public MPolwordingsExcelDto uploadExcelPolwordings(MultipartFile file, String prodCode) {
//
//		List<String> errors = null;
//
//		int totalRecords = 0;
//		int uploadRecords = 0;
//		int errorRecords = 0;
//
//		List<MPolWordings> list = new ArrayList<MPolWordings>();
//
//		MPolwordingsExcelDto value = new MPolwordingsExcelDto();
//
//		try (XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream())) {
//			XSSFSheet worksheet = workbook.getSheetAt(0);
//
//			totalRecords = worksheet.getPhysicalNumberOfRows() - 1;
//			DataFormatter formatter = new DataFormatter();
//
//			for (int i = 1; i < worksheet.getPhysicalNumberOfRows(); i++) {
//
//				MPolWordings obj = new MPolWordings();
//
//				XSSFRow row = worksheet.getRow(i);
//
////				String pwProductCode = formatter.formatCellValue(row.getCell(1));
//				String pwWordingType = formatter.formatCellValue(row.getCell(2));
//				String pwPageName = formatter.formatCellValue(row.getCell(3));
//				String pwPageNo = formatter.formatCellValue(row.getCell(4));
//				String pwPageOrder = formatter.formatCellValue(row.getCell(5));
//				String pwPageLineNo = formatter.formatCellValue(row.getCell(6));
//				String pwDisplayText1 = formatter.formatCellValue(row.getCell(7));
//				String pwDisplayText2 = formatter.formatCellValue(row.getCell(8));
//				String pwDisplayText3 = formatter.formatCellValue(row.getCell(9));
//				String pwAllignment = formatter.formatCellValue(row.getCell(10));
//				String pwFontSize = formatter.formatCellValue(row.getCell(11));
//				String pwTextFormat = formatter.formatCellValue(row.getCell(12));
//				String pwLvl = formatter.formatCellValue(row.getCell(13));
//				String pwCoverCode = formatter.formatCellValue(row.getCell(14));
//				String pwDynamicColumn1 = formatter.formatCellValue(row.getCell(15));
//				String pwDynamicColumn2 = formatter.formatCellValue(row.getCell(16));
//				String pwDynamicColumn3 = formatter.formatCellValue(row.getCell(17));
//
//				errors = new ArrayList<>();
//
//				Optional<MPolWordings> optional = mPolWordingsService
//						.findByPwProductCodeAndPwWordingTypeAndPwCoverCode(prodCode, pwWordingType, pwCoverCode);
//				if (optional.isPresent()) {
//					errors.add("Already Exist");
//				}
//
//				if (ValidationUtil.isValidLength(pwWordingType, 50)) {
//					errors.add("PwWordingType length should be 50");
//				}
//
//				if (ValidationUtil.isValidLength(pwPageName, 50)) {
//					errors.add("PwPageName length should be 50");
//				}
//
//				if (ValidationUtil.isValidLength(pwPageOrder, 10)) {
//					errors.add("PwPageOrder length should be 10");
//				}
//
//				if (ValidationUtil.isValidLength(ValidationUtil.convertBigDecimal(pwPageLineNo), 9999)) {
//					errors.add("PwPageLineNo length should be 9999");
//				}
//
//				if (ValidationUtil.isValidLength(pwDisplayText1, 4000)) {
//					errors.add("PwDisplayText1 Max Length Should Be 4000");
//
//				}
//
//				if (ValidationUtil.isValidLength(pwDisplayText2, 4000)) {
//					errors.add("PwDisplayText2 Max Length Should Be 4000");
//
//				}
//
//				if (ValidationUtil.isValidLength(pwDisplayText3, 4000)) {
//					errors.add("PwDisplayText3 Max Length Should Be 4000");
//
//				}
//
//				if (ValidationUtil.isValidLength(pwAllignment, 1)) {
//					errors.add("Allignment Max Length Should be 1");
//				}
//
//				if (ValidationUtil.isValidLength(pwTextFormat, 1)) {
//					errors.add("PwTextformat Max Length Should be 1");
//				}
//
//				if (ValidationUtil.isValidLength(pwFontSize, 10)) {
//					errors.add("PwFontsize Max Length Should be 10");
//				}
//
//				if (ValidationUtil.isValidLength(pwLvl, 1)) {
//					errors.add("Pwlevel Max Length Should be 1");
//				}
//
//				if (ValidationUtil.isValidLength(pwCoverCode, 240)) {
//					errors.add("PwCoverCode Max Length Should be 240");
//				}
//				if (ValidationUtil.isValidLength(pwDynamicColumn1, 2000)) {
//					errors.add("PwDynamicColumn1 Max Length Should Be 2000");
//
//				}
//
//				if (ValidationUtil.isValidLength(pwDynamicColumn2, 2000)) {
//					errors.add("PwDynamicColumn2 Max Length Should Be 2000");
//				}
//
//				if (ValidationUtil.isValidLength(pwDynamicColumn3, 2000)) {
//					errors.add("PwDynamicColumn3 Max Length Should Be 2000");
//				}
//				if (ValidationUtil.isNull(pwLvl)) {
//					errors.add("Please enter the Level S or C");
//				} else if (ValidationUtil.isCheckChar(pwLvl)) {
//					errors.add("Please enter the Level S or C");
//				}
//
//				if (!ValidationUtil.isNull(pwLvl)) {
//					if (pwLvl.charAt(0) == 'S') {
//						if (!ValidationUtil.isNullCoverCode(pwCoverCode)) {
//							errors.add("Please remove the Cover Code");
//						} else if (pwLvl.charAt(0) == 'C') {
//							if (ValidationUtil.isNullCoverCode(pwCoverCode)) {
//								errors.add("Please enter the cover code");
//							}
//						}
//					}
//				}
//
//				obj.setPwProductCode(prodCode);
//				obj.setPwWordingType(pwWordingType);
//				obj.setPwPageName(pwPageName);
//				obj.setPwAllignment(pwAllignment);
//				obj.setPwCoverCode(pwCoverCode);
//				obj.setPwDisplayText1(pwDisplayText1);
//				obj.setPwDisplayText2(pwDisplayText2);
//				obj.setPwDisplayText3(pwDisplayText3);
//				obj.setPwDynamicColumn1(pwDynamicColumn1);
//				obj.setPwDynamicColumn2(pwDynamicColumn2);
//				obj.setPwDynamicColumn3(pwDynamicColumn3);
//				obj.setPwFontsize(pwFontSize);
//				obj.setPwLvl(pwLvl);
//				obj.setPwPageLineNo(pwPageLineNo != "" ? ValidationUtil.convertBigDecimal(pwPageLineNo) : null);
//				obj.setPwPageName(pwPageName);
//				obj.setPwPageno(pwPageNo != "" ? ValidationUtil.convertBigDecimal(pwPageNo) : null);
//				obj.setPwPageOrder(pwPageOrder);
//				obj.setPwTextformat(pwTextFormat);
//				obj.setPwWordingType(pwWordingType);
//
//				if (errors.size() > 0) {
//
//					String errorMessage = errors.stream().map(a -> String.valueOf(a)).collect(Collectors.joining(", "));
//					obj.setRemarks(errorMessage);
//					list.add(obj);
//					errorRecords++;
//
//				} else {
//
//					mPolWordingsService.saveorupdate(obj);
//					uploadRecords++;
//
//				}
//
//				value.setPolwordingsList(list);
//				value.setErrorRecords(errorRecords);
//				value.setTotalRecords(totalRecords);
//				value.setUploadRecords(uploadRecords);
//
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//
//		}
//		return value;
//
//	}
//
//	public boolean uploadExcelConditions(MultipartFile file) {
//
//		List<String> errors = null;
//
//		try (XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream())) {
//			XSSFSheet worksheet = workbook.getSheetAt(0);
//
//			DataFormatter formatter = new DataFormatter();
//
//			XSSFRow row = worksheet.getRow(0);
//
//			String psacSysId = formatter.formatCellValue(row.getCell(0));
//			String psacProdCode = formatter.formatCellValue(row.getCell(1));
//			String psacCompCode = formatter.formatCellValue(row.getCell(2));
//			String psacSchCode = formatter.formatCellValue(row.getCell(3));
//			String psacCode = formatter.formatCellValue(row.getCell(4));
//			String psacCvrCode = formatter.formatCellValue(row.getCell(5));
//			String psacLvl = formatter.formatCellValue(row.getCell(6));
//			String psacType = formatter.formatCellValue(row.getCell(7));
//			String psacDfltYn = formatter.formatCellValue(row.getCell(8));
//			String psacDesc = formatter.formatCellValue(row.getCell(9));
//			String psacDescBl = formatter.formatCellValue(row.getCell(10));
//			String psacShortDesc = formatter.formatCellValue(row.getCell(11));
//			String psacShortDescBl = formatter.formatCellValue(row.getCell(12));
//			String psacLongDesc = formatter.formatCellValue(row.getCell(13));
//			String psacLongDescBl = formatter.formatCellValue(row.getCell(14));
//			String psacEffFmDt = formatter.formatCellValue(row.getCell(15));
//			String psacEffToDt = formatter.formatCellValue(row.getCell(16));
//			String psacSrNo = formatter.formatCellValue(row.getCell(17));
//			String psacCrDt = formatter.formatCellValue(row.getCell(18));
//			String psacCrUid = formatter.formatCellValue(row.getCell(19));
//			String psacUpdDt = formatter.formatCellValue(row.getCell(20));
//			String psacUpdUid = formatter.formatCellValue(row.getCell(21));
//			String pascConvType = formatter.formatCellValue(row.getCell(22));
//
//			errors = new ArrayList<>();
//
//			if (psacSysId.equals("PSAC_SYS_ID")) {
//				errors.add("");
//			}
//			if (psacProdCode.equals("PSAC_PROD_CODE")) {
//				errors.add("");
//			}
//			if (psacCompCode.equals("PSAC_COMP_CODE")) {
//				errors.add("");
//			}
//			if (psacSchCode.equals("PSAC_SCH_CODE")) {
//				errors.add("");
//			}
//			if (psacCode.equals("PSAC_CODE")) {
//				errors.add("");
//			}
//			if (psacCvrCode.equals("PSAC_CVR_CODE")) {
//				errors.add("");
//			}
//			if (psacLvl.equals("PSAC_LVL")) {
//				errors.add("");
//			}
//			if (psacType.equals("PSAC_TYPE")) {
//				errors.add("");
//			}
//			if (psacDfltYn.equals("PSAC_DFLT_YN")) {
//				errors.add("");
//			}
//			if (psacDesc.equals("PSAC_DESC")) {
//				errors.add("");
//			}
//			if (psacDescBl.equals("PSAC_DESC_BL")) {
//				errors.add("");
//			}
//			if (psacShortDesc.equals("PSAC_SHORT_DESC")) {
//				errors.add("");
//			}
//			if (psacShortDescBl.equals("PSAC_SHORT_DESC_BL")) {
//				errors.add("");
//			}
//			if (psacLongDesc.equals("PSAC_LONG_DESC")) {
//				errors.add("");
//			}
//			if (psacLongDescBl.equals("PSAC_LONG_DESC_BL")) {
//				errors.add("");
//			}
//			if (psacEffFmDt.equals("PSAC_EFF_FM_DT")) {
//				errors.add("");
//			}
//			if (psacEffToDt.equals("PSAC_EFF_TO_DT")) {
//				errors.add("");
//			}
//			if (psacSrNo.equals("PSAC_SR_NO")) {
//				errors.add("");
//			}
//			if (psacCrDt.equals("PSAC_CR_DT")) {
//				errors.add("");
//			}
//			if (psacCrUid.equals("PSAC_CR_UID")) {
//				errors.add("");
//			}
//			if (psacUpdDt.equals("PSAC_UPD_DT")) {
//				errors.add("");
//			}
//			if (psacUpdUid.equals("PSAC_UPD_UID")) {
//				errors.add("");
//			}
//			if (pascConvType.equals("PASC_CONV_TYPE")) {
//				errors.add("");
//			}
//
//			if (errors.size() > 0) {
//
//				return true;
//
//			} else {
//
//				return false;
//
//			}
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return true;
//		}
//
//	}
//
//	public boolean uploadExcelPolwordings(MultipartFile file) {
//		List<String> errors = null;
//
//		try (XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream())) {
//			XSSFSheet worksheet = workbook.getSheetAt(0);
//
//			DataFormatter formatter = new DataFormatter();
//
//			XSSFRow row = worksheet.getRow(0);
//
//			String pwSysId = formatter.formatCellValue(row.getCell(0));
//			String pwProductCode = formatter.formatCellValue(row.getCell(1));
//			String pwWordingType = formatter.formatCellValue(row.getCell(2));
//			String pwPageName = formatter.formatCellValue(row.getCell(3));
//			String pwPageNo = formatter.formatCellValue(row.getCell(4));
//			String pwPageOrder = formatter.formatCellValue(row.getCell(5));
//			String pwPageLineNo = formatter.formatCellValue(row.getCell(6));
//			String pwDisplayText1 = formatter.formatCellValue(row.getCell(7));
//			String pwDisplayText2 = formatter.formatCellValue(row.getCell(8));
//			String pwDisplayText3 = formatter.formatCellValue(row.getCell(9));
//			String pwAllignment = formatter.formatCellValue(row.getCell(10));
//			String pwFontSize = formatter.formatCellValue(row.getCell(11));
//			String pwTextFormat = formatter.formatCellValue(row.getCell(12));
//			String pwLvl = formatter.formatCellValue(row.getCell(13));
//			String pwCoverCode = formatter.formatCellValue(row.getCell(14));
//			String pwDynamicColumn1 = formatter.formatCellValue(row.getCell(15));
//			String pwDynamicColumn2 = formatter.formatCellValue(row.getCell(16));
//			String pwDynamicColumn3 = formatter.formatCellValue(row.getCell(17));
//
//			errors = new ArrayList<>();
//
//			if (pwSysId.equals("PW_SYS_ID")) {
//				errors.add("");
//			}
//			if (pwProductCode.equals("PW_PRODUCT_CODE")) {
//				errors.add("");
//			}
//			if (pwWordingType.equals("PW_WORDING_TYPE")) {
//				errors.add("");
//			}
//			if (pwPageName.equals("PW_PAGE_NAME")) {
//				errors.add("");
//			}
//			if (pwPageNo.equals("PW_PAGENO")) {
//				errors.add("");
//			}
//			if (pwPageOrder.equals("PW_PAGE_ORDER")) {
//				errors.add("");
//			}
//			if (pwPageLineNo.equals("PW_PAGE_LINE_NO")) {
//				errors.add("");
//			}
//			if (pwDisplayText1.equals("PW_DISPLAY_TEXT_1")) {
//				errors.add("");
//			}
//			if (pwDisplayText2.equals("PW_DISPLAY_TEXT_2")) {
//				errors.add("");
//			}
//			if (pwDisplayText3.equals("PW_DISPLAY_TEXT_3")) {
//				errors.add("");
//			}
//			if (pwAllignment.equals("PW_ALLIGNMENT")) {
//				errors.add("");
//			}
//			if (pwFontSize.equals("PW_FONTSIZE")) {
//				errors.add("");
//			}
//			if (pwTextFormat.equals("PW_TEXTFORMAT")) {
//				errors.add("");
//			}
//			if (pwLvl.equals("PW_LVL")) {
//				errors.add("");
//			}
//			if (pwCoverCode.equals("PW_COVER_CODE")) {
//				errors.add("");
//			}
//			if (pwDynamicColumn1.equals("PW_DYNAMIC_COLUMN_1")) {
//				errors.add("");
//			}
//			if (pwDynamicColumn2.equals("PW_DYNAMIC_COLUMN_2")) {
//				errors.add("");
//			}
//			if (pwDynamicColumn3.equals("PW_DYNAMIC_COLUMN_3")) {
//				errors.add("");
//			}
//
//			if (errors.size() > 0) {
//
//				return true;
//
//			} else {
//
//				return false;
//
//			}
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return true;
//		}
//
//	}
//	
//	public byte[] downloadExcelConditions(List<MTariffLifeDetails> obj) {
//
//		try {
//
//			Resource resource = new ClassPathResource("Condition_Template.xlsx");
//			InputStream fileStream = resource.getInputStream();
//
//			XSSFWorkbook workbook = new XSSFWorkbook(fileStream);
//			XSSFSheet worksheet = workbook.getSheetAt(0);
//			int rowvariable = 1;
//			Cell cell = null;
//			for (MTariffLifeDetails newObj : obj) {
//				Row row = worksheet.createRow(rowvariable);
//
//				cell = row.createCell(0);
//				cell.setCellValue(ValidationUtil.convertString(newObj.getMtdId()));
//				cell = row.createCell(1);
//				cell.setCellVal(newObj.getMtdMthId());
//				cell = row.createCell(2);
//				cell.setCellValue(newObj.getMtdEffFmDt());
//				cell = row.createCell(3);
//				cell.setCellValue(newObj.getMtdEffToDt());
//				cell = row.createCell(4);
//				cell.setCellValue(newObj.getMtdSmokeFmCode());
//				cell = row.createCell(5);
//				cell.setCellValue(newObj.getMtdSmokeToCode());
//				cell = row.createCell(6);
//				cell.setCellValue(newObj.getMtdGenderFmCode());
//				cell = row.createCell(7);
//				cell.setCellValue(newObj.getMtdGenderToCode());
//				cell = row.createCell(8);
//				cell.setCellValue(newObj.getMtdAgeFm());
//				cell = row.createCell(9);
//				cell.setCellValue(newObj.getMtdAgeTo());
//				cell = row.createCell(10);
//				cell.setCellValue(newObj.getMtdPolicytermFm());
//				cell = row.createCell(11);
//				cell.setCellValue(newObj.getMtdPolicyTermTo());
//				cell = row.createCell(12);
//				cell.setCellValue(newObj.getMtdNoSeatsFm());
//				cell = row.createCell(13);
//				cell.setCellValue(newObj.getMtdNoSeatsTo());
//				cell = row.createCell(14);
//				cell.setCellValue(newObj.getMtdSumAssuredLimitFm());
//				cell = row.createCell(15);
//				cell.setCellValue(ValidationUtil.format(newObj.getMtdSumAssuredLimitTo()));
//				cell = row.createCell(16);
//				cell.setCellValue(ValidationUtil.format(newObj.getPsacEffToDt()));
//				cell = row.createCell(17);
//				cell.setCellValue(ValidationUtil.convertString(newObj.getPsacSrNo()));
//				cell = row.createCell(18);
//				cell.setCellValue(ValidationUtil.format(newObj.getPsacCrDt()));
//				cell = row.createCell(19);
//				cell.setCellValue(newObj.getPsacCrUid());
//				cell = row.createCell(20);
//				cell.setCellValue(ValidationUtil.format(newObj.getPsacUpdDt()));
//				cell = row.createCell(21);
//				cell.setCellValue(newObj.getPsacUpdUid());
//				cell = row.createCell(22);
//				cell.setCellValue(newObj.getPascConvType());
//				cell = row.createCell(23);
//				cell.setCellValue(newObj.getRemarks());
//
//				rowvariable++;
//
//			}
//
//			ByteArrayOutputStream bos = new ByteArrayOutputStream();
//			workbook.write(bos);
//			workbook.close();
//			byte[] barray = bos.toByteArray();
//
//			return barray;
//		}
//
//		catch (Exception e) {
//			throw new RuntimeException("fail to export data to Excel file: " + e.getMessage());
//		}
//
//	}
//
//}
