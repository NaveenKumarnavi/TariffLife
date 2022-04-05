//package com.navi.live.controller;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.navi.live.bean.MLifeDocs;
//import com.navi.live.dto.ListViewParam;
//import com.navi.live.reponce.ResponseGenerator;
//import com.navi.live.reponce.TransactionContext;
//import com.navi.live.service.MLifeDocsService;
//import com.navi.live.service.MessagePropertyService;
//import com.navi.live.util.ValidationUtil;
//import com.navi.live.validator.Convention;
//import com.navi.live.validator.MLifeDocsValidator;
//import com.navi.live.validator.ValidationResult;
//
//import io.swagger.annotations.ApiParam;
//import lombok.AllArgsConstructor;
//import lombok.NonNull;
//
//@CrossOrigin(origins = "*", maxAge = 3600)
//@AllArgsConstructor(onConstructor_ = { @Autowired })
//@RestController
//@RequestMapping("/mlifedocs")
//public class MLifeDocsController {
//
//	private static final Logger logger = Logger.getLogger(MLifeDocsController.class);
//
//	@Autowired
//	private MLifeDocsService entityService;
//	private Convention sorting;
//
//	private @NonNull ResponseGenerator responseGenerator;
//	private @NonNull MLifeDocsValidator validatorService;
//	private @NonNull MessagePropertyService messageSource;
//
//	@PostMapping(value = "/createOrUpdate", produces = "application/json")
//	public ResponseEntity<?> createOrUpdate(@ApiParam(value = "request payload") @RequestBody MLifeDocs request,
//			@RequestHeader HttpHeaders httpHeader) throws Exception {
//
//		TransactionContext context = responseGenerator.generateTransationContext(httpHeader);
//
//		ValidationResult validationResult = validatorService.validate(request);
//
//		entityService.saveorupdate((MLifeDocs) validationResult.getObject());
//
//		try {
//
//			return responseGenerator.successResponse(context, messageSource.getMessage("update"), HttpStatus.OK);
//
//		} catch (Exception e) {
//
//			e.printStackTrace();
//			logger.error(e.getMessage(), e);
//			return responseGenerator.errorResponse(context, e.getMessage(), HttpStatus.BAD_REQUEST);
//
//		}
//
//	}
//
//	@PostMapping(value = "/getAll", produces = "application/json")
//	public ResponseEntity<?> getAll(@RequestBody ListViewParam request, @RequestHeader HttpHeaders httpHeader)
//			throws Exception {
//
//		TransactionContext context = responseGenerator.generateTransationContext(httpHeader);
//
//		Pageable paging = sorting.getPaging(request.getOrderBy(), sorting.getPageNumber(request.getPageNumber()),
//				sorting.getPageSize(request.getPageSize()));
//
//		try {
//
//			List<MLifeDocs> obj = new ArrayList<MLifeDocs>();
//			Page<MLifeDocs> list = null;
//
//			if (ValidationUtil.isEmptyStringArray(request.getOrderBy()) && ValidationUtil.isNull(request.getSearch())) {
//
//				list = entityService.findAll(paging);
//
//			}
//			if (!ValidationUtil.isEmptyStringArray(request.getOrderBy())
//					&& ValidationUtil.isNull(request.getSearch())) {
//
//				list = entityService.findAll(paging);
//
//			}
//			if (ValidationUtil.isEmptyStringArray(request.getOrderBy())
//					&& !ValidationUtil.isNull(request.getSearch())) {
//
//				list = entityService.findSearch(request.getSearch(), paging);
//
//			}
//
//			if (!ValidationUtil.isEmptyStringArray(request.getOrderBy())
//					&& !ValidationUtil.isNull(request.getSearch())) {
//
//				list = entityService.findSearch(request.getSearch(), paging);
//
//			}
//
//			obj = list.getContent();
////
////			if (lob.isEmpty()) {
////				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
////			}
//
//			Map<String, Object> response = new HashMap<>();
//			response.put("data", obj);
//			response.put("currentPage", list.getNumber());
//			response.put("totalItems", list.getTotalElements());
//			response.put("totalPages", list.getTotalPages());
//
//			return responseGenerator.successGetResponse(context, messageSource.getMessage("fetched"), response,
//					HttpStatus.OK);
//
//		} catch (
//
//		Exception e) {
//
//			e.printStackTrace();
//			logger.error(e.getMessage(), e);
//			return responseGenerator.errorResponse(context, e.getMessage(), HttpStatus.BAD_REQUEST);
//
//		}
//	}
//
//}
//
