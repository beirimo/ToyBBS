package controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.BBS;
import dto.request.BBSListRequest;
import dto.response.BBSListResponse;
import service.BBSService;

@RestController
@RequestMapping("/bbs")
public class BBSController {
	
	private final BBSService service;
	
	public BBSController(BBSService service) {
		this.service  = service;
	}
	
	//client가 요청한 것을 받는 getmapping 
	@GetMapping("/list")
	public ResponseEntity<BBSListResponse> getBbsList(){
		BBSListResponse response = service.getBBSPageList();
		return ResponseEntity.ok(response);
		
		
		
	}

}
