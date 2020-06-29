package com.hai.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hai.demo.entity.Cat;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wuhaichao
 */
@Mapper
public interface CatMapper extends BaseMapper<Cat> {


}
