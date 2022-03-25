package com.mulcam.Mini.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface PictureDAO {
	public List<Map<String, String>> getPictures(String categori) throws Exception;
}
