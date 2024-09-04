package jay.toy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.constraints.AssertFalse.List;
import jay.toy.dto.request.BBSListRequest;
import jay.toy.dto.request.CreateBBSRequest;
import jay.toy.dto.response.BBSListResponse;
import jay.toy.dto.response.CreateBBSResponse;
import jay.toy.service.BBSService;

@RestController
@RequestMapping("/bbs")
public class BBSController {
//	
	private final BBSService service;
//	
	public BBSController(BBSService service) {
		this.service  = service;
	}
	
	//client가 요청한 것을 받는 getmapping 
	@GetMapping("/list")
	public ResponseEntity<BBSListResponse> getBbsList(){
		BBSListResponse response = service.getBBSPageList();
		return ResponseEntity.ok(response);
	}
		
		
	//게시글 작성 
	@PostMapping("/")
	public ResponseEntity<CreateBBSResponse> createBBS(@RequestBody CreateBBSRequest req) {
		
		return ResponseEntity.ok(response);
		
	}

}
