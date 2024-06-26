package com.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface CategoryMapper {
    @MapKey("id")
    List<Map<String, Object>> getProductCountByCategory();
}
