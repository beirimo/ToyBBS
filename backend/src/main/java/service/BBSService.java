package service;

import java.util.List;

import org.springframework.stereotype.Service;

import dao.BBSDAO;
import domain.BBS;

@Service
public class BBSService {
	
	private final BBSDAO bbsdao;
	
	
	//Autowired가 아닌 생성자를 통한 의존성 주입.
	public BBSService(BBSDAO dao) {
		this.bbsdao = dao;
	}
	//게시글 조회

	public List<BBS> getBBSPageList(){
		return bbsdao.getBBSPageList();
		
	}
}
