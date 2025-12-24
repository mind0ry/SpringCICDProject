package com.sist.web.mapper;
import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RestController;

import com.sist.web.vo.*;

@Mapper
@RestController
public interface BusanMapper {

	public List<BusanVO> busanListData(Map map);
	public int busanTotalPage(Map map);
}
