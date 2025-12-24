package com.sist.web.mapper;
import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.RestController;

import com.sist.web.vo.*;

@Mapper
@RestController
public interface BusanMapper {

	public List<BusanVO> busanListData(Map map);
	public int busanTotalPage(Map map);
	
	@Update("UPDATE busantravel SET "
			+ "hit=hit+1 "
			+ "WHERE no=#{no}")
	public void busanHitIncrement(int no);
	
	@Select("SELECT * FROM busantravel "
			+ "WHERE no=#{no}")
	public BusanVO busanDetailData(int no);
}
