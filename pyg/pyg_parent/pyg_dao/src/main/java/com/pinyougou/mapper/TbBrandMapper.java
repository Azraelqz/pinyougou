package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TbBrandMapper {

    @Select("select id,name,first_char as firstChar from tb_brand")
    List<TbBrand> findAll();
}
