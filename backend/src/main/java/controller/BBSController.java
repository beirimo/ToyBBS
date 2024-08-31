package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.BBSService;

@RestController
@RequestMapping("/bbs")
public class BBSController {
	
	private final BBSService service;
	
	public BBSController(BBSService service) {
		this.service  = service;
	}
	
	
	@GetMapping("/list")
	public String(){
		return 
	}

}
