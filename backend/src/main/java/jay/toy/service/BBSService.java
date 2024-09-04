package jay.toy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jay.toy.dao.BBSDAO;
import jay.toy.domain.BBS;
import jay.toy.dto.response.BBSListResponse;


@Service
public class BBSService {
	
	private final BBSDAO bbsdao;
	
	
	//Autowired가 아닌 생성자를 통한 의존성 주입.
	public BBSService(BBSDAO dao) {
		this.bbsdao = dao;
	}
	//게시글 조회

	public BBSListResponse getBBSPageList() {
		List<BBS> bbslist = bbsdao.getBBSPageList();
		return new BBSListResponse(bbslist);
		
		
	}
	
	public 
}
