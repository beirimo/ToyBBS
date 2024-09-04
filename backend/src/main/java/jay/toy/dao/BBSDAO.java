package jay.toy.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import jay.toy.domain.BBS;



@Mapper
@Repository
public interface BBSDAO {
	List<BBS> getBBSPageList();
}
