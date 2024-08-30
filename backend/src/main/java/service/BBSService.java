package service;

import org.springframework.stereotype.Service;

import dao.BBSDAO;
import domain.BBS;

@Service
public class BBSService {
	
	private final BBSDAO dao;
	
	public BBSService(BBSDAO dao) {
		this.dao = dao;
	}
	//게시글 조회

	public BBS getBbs
}
