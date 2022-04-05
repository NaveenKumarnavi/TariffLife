package com.navi.live.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.navi.liv.excelHelper.ExcelHelper;
import com.navi.live.bean.MTariffLifeDetails;
import com.navi.live.dto.ListViewParam;
import com.navi.live.reponce.Response;
import com.navi.live.reponce.ResponseGenerator;
import com.navi.live.reponce.TransactionContext;
import com.navi.live.service.MTariffLifeDetailsService;
import com.navi.live.service.MessagePropertyService;
import com.navi.live.util.ValidationUtil;
import com.navi.live.validator.Convention;
import com.navi.live.validator.MTariffLifeDetailsValidator;
import com.navi.live.validator.ValidationResult;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@AllArgsConstructor(onConstructor_ = { @Autowired })
@RequestMapping("/mtarifflifeDetails")
public class MTariffLifeDetailsController {

	@Autowired
	private MTariffLifeDetailsService entityService;
	private MessagePropertyService messageSource;
	private @NonNull MTariffLifeDetailsValidator validatorService;
	private Convention sorting;
	//private ExcelHelper excelService;

	private static final Logger logger = Logger.getLogger(MTariffLifeDetailsController.class);

	private @NonNull ResponseGenerator responseGenerator;

	@PostMapping(value = "/createOrUpdate", produces = "application/json")
	public ResponseEntity<?> createOrUpdate(
			@ApiParam(value = "Request payload") @RequestBody MTariffLifeDetails request,
			@RequestHeader HttpHeaders httpHeader) throws Exception {

		TransactionContext context = responseGenerator.generateTransationContext(httpHeader);

		ValidationResult validationResult = validatorService.validate(request);

		entityService.saveorupdate((MTariffLifeDetails) validationResult.getObject());

		try {
			return responseGenerator.successResponse(context, messageSource.getMessage("saved"), HttpStatus.OK);

		} catch (Exception e) {

			e.printStackTrace();
			logger.error(e.getMessage(), e);
			return responseGenerator.errorResponse(context, e.getMessage(), HttpStatus.BAD_REQUEST);

		}

	}

	@ApiOperation(value = "Allows to fetch all data List.", response = Response.class)
	@GetMapping(value = "/getAll", produces = "application/json")
	public ResponseEntity<?> getAll(@RequestHeader HttpHeaders httpHeader) throws Exception {

		TransactionContext context = responseGenerator.generateTransationContext(httpHeader);

		try {

			List<MTariffLifeDetails> lst = entityService.getAll();
			return responseGenerator.successGetResponse(context, messageSource.getMessage("fetched"), lst,
					HttpStatus.OK);

		} catch (Exception e) {

			e.printStackTrace();
			logger.error(e.getMessage(), e);
			return responseGenerator.errorResponse(context, e.getMessage(), HttpStatus.BAD_REQUEST);

		}
	}

	@PostMapping(value = "/getAll", produces = "application/json")
	public ResponseEntity<?> getAll(@RequestBody ListViewParam request, @RequestHeader HttpHeaders httpHeader)
			throws Exception {

		TransactionContext context = responseGenerator.generateTransationContext(httpHeader);

		Pageable paging = sorting.getPaging(request.getOrderBy(), sorting.getPageNumber(request.getPageNumber()),
				sorting.getPageSize(request.getPageSize()));

		try {

			List<MTariffLifeDetails> obj = new ArrayList<MTariffLifeDetails>();
			Page<MTariffLifeDetails> list = null;

			if (ValidationUtil.isEmptyStringArray(request.getOrderBy()) && ValidationUtil.isNull(request.getSearch())) {

				list = entityService.findAll(ValidationUtil.convertBigDecimal(request.getCode()[0]), paging);

			}
			if (!ValidationUtil.isEmptyStringArray(request.getOrderBy())
					&& ValidationUtil.isNull(request.getSearch())) {

				list = entityService.findAll(ValidationUtil.convertBigDecimal(request.getCode()[0]), paging);

			}
			if (ValidationUtil.isEmptyStringArray(request.getOrderBy())
					&& !ValidationUtil.isNull(request.getSearch())) {

				list = entityService.findSearch(ValidationUtil.convertBigDecimal(request.getCode()[0]),
						request.getSearch(), paging);

			}

			if (!ValidationUtil.isEmptyStringArray(request.getOrderBy())
					&& !ValidationUtil.isNull(request.getSearch())) {

				list = entityService.findSearch(ValidationUtil.convertBigDecimal(request.getCode()[0]),
						request.getSearch(), paging);

			}

			obj = list.getContent();

			Map<String, Object> response = new HashMap<>();
			response.put("data", obj);
			response.put("currentPage", list.getNumber());
			response.put("totalItems", list.getTotalElements());
			response.put("totalPages", list.getTotalPages());

			return responseGenerator.successGetResponse(context, messageSource.getMessage("fetched"), response,
					HttpStatus.OK);

		} catch (

		Exception e) {

			e.printStackTrace();
			logger.error(e.getMessage(), e);
			return responseGenerator.errorResponse(context, e.getMessage(), HttpStatus.BAD_REQUEST);

		}
	}
	
//	@ApiOperation(value = "Allows to download manifest excel file.", response = Response.class)
//	@GetMapping(value = "/excelDownload/{prodCode}", produces = "application/json")
//	public ResponseEntity<?> downloadManifestExcelFile(@RequestHeader HttpHeaders httpHeader,
//			@PathVariable("prodCode") String prodCode) throws Exception {
//
//		TransactionContext context = responseGenerator.generateTransationContext(httpHeader);
//
//		List<MTariffLifeDetails> obj = entityService.findByPwProductCode(prodCode);
//
//		String fileName = "PolWordings_Records.xlsx";
//		try {
//			InputStream excelInputStream = new ByteArrayInputStream(excelService.downloadExcelTariffLife(obj));
//
//			return ResponseEntity.ok().header("Access-Control-Expose-Headers", "Content-Disposition")
//					.contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
//					.header("Content-Disposition", "attachment; filename=\"" + fileName + "\"")
//					.body(new InputStreamResource(excelInputStream));
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			logger.error(e.getMessage(), e);
//			return responseGenerator.errorResponse(context, e.getMessage(), HttpStatus.BAD_REQUEST);
//		}
//	}
//
//	@RequestMapping(value = "/upload/{prodCode}", method = RequestMethod.POST, produces = "application/json")
//	public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file,
//			@PathVariable("prodCode") String prodCode, @RequestHeader HttpHeaders httpHeader) throws Exception {
//		TransactionContext context = responseGenerator.generateTransationContext(httpHeader);
//
//		if (!ValidationUtil.hasExcelFormat(file)) {
//			return responseGenerator.errorResponse(context, "Invalid File Request", HttpStatus.BAD_REQUEST);
//		}
//
//		if (!excelService.uploadExcelConditions(file)) {
//
//			return responseGenerator.errorResponse(context, "Please upload the valid format excel",
//					HttpStatus.BAD_REQUEST);
//		}
//
////			list = excelService.uploadExcelConditions(file, prodCode, schCode, compCode);
//
//		MTariffLifeDetails data = excelService.uploadExcelTariffLife(file, prodCode);
//
//		String total = String.valueOf(data.getTotalRecords());
//		String error = String.valueOf(data.getErrorRecords());
//		String upload = String.valueOf(data.getUploadRecords());
//
//		try {
//
//			if (data.getPolwordingsList().isEmpty()) {
//				return responseGenerator.successResponse(context, total + " Records are upload successfully",
//						HttpStatus.OK);
//			} else {
//
//				String fileName = "error.xlsx";
//				String filePath = "/";
//
//				InputStream excelInputStream = new ByteArrayInputStream(
//						excelService.downloadExcelPolWordings(data.getPolwordingsList()));
//
//				byte[] bytes = IOUtils.toByteArray(excelInputStream);
//
//				saveFile(bytes, filePath, fileName);
//
//				String errorMessage = "Total Records: " + total + "   Error Records: " + error + " Upload Records : "
//						+ upload + " Review the details please download the error excel";
//				return responseGenerator.errorResponse(context, errorMessage, HttpStatus.BAD_REQUEST);
//
////				return ResponseEntity.ok().header("Access-Control-Expose-Headers", "Content-Disposition")
////						.contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
////						.header("Content-Disposition", "attachment; filename=\"" + fileName + "\"")
////						.body(new InputStreamResource(excelInputStream));
//
//			}
//
//		} catch (Exception e) {
//
//			e.printStackTrace();
//			logger.error(e.getMessage(), e);
//			return responseGenerator.errorResponse(context, e.getMessage(), HttpStatus.BAD_REQUEST);
//		}
//	}
//
//	public String saveFile(byte[] bytes, String filePath, String filename) throws MalformedURLException, IOException {
//
//		String RESOURCE_PATH = "files";
//
//		File file = new File(RESOURCE_PATH + filePath + filename);
//
//		OutputStream out = new FileOutputStream(file);
//		try {
//			out.write(bytes);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			out.close();
//		}
//		return file.getName();
//
//	}
//
//	@ApiOperation(value = "Allows to download manifest excel file.", response = Response.class)
//	@GetMapping(value = "/errorExcelDownload", produces = "application/json")
//	public ResponseEntity<?> downloadManifestExcelFile(@RequestHeader HttpHeaders httpHeader) throws Exception {
//
//		TransactionContext context = responseGenerator.generateTransationContext(httpHeader);
//
//		try {
//
//			Path excelPath = Paths.get("files/error.xlsx");
//			byte[] excel = Files.readAllBytes(excelPath);
//			ByteArrayInputStream excelToByte = new ByteArrayInputStream(excel);
//
//			return ResponseEntity.ok().header("Access-Control-Expose-Headers", "Content-Disposition")
//					.contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
//					.header("Content-Disposition", "attachment; filename=\"" + "error.xlsx" + "\"")
//					.body(new InputStreamResource(excelToByte));
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			logger.error(e.getMessage(), e);
//			return responseGenerator.errorResponse(context, e.getMessage(), HttpStatus.BAD_REQUEST);
//		}
//	}

}
