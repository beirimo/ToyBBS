package dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import domain.BBS;

@Mapper
@Repository
public interface BBSDAO {
	
	List<BBS> getBBSPageList();

}
