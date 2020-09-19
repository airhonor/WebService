package com.honorzhang.web.service.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.honorzhang.web.service.server.model.People;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @program: webservice-example
 * @author: zgr
 * @create: 2020-09-16 12:36
 **/
@Mapper
public interface PeopleMapper extends BaseMapper<People> {
}
