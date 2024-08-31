package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import domain.BBS;

@Repository
public interface BBSDAO {
	
	List<BBS> getBBSPageList();

}
