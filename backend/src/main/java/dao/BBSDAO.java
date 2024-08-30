package dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import domain.BBS;

@Mapper
@Repository
public interface BBSDAO {
	
	public BBS getBbs(int bid);
	public void createBbs(Integer bid);  //Integer를 통한 객체취급
	public void deleteBbs(Integer bid);
	public void updateBbs(BBS update);

}
