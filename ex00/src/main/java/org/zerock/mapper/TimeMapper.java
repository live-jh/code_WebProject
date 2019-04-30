package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	//mapper 없이 @어노테이션을 이용한 sql 작성
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	//mapper.xml 에 sql 작성 
	public String getTime2();
}
