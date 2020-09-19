package com.honorzhang.web.service.server.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @program: webservice-example
 * @author: zgr
 * @create: 2020-09-16 12:31
 **/
@Data
public class People {
    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 名字
     */
    private String name;

    /**
     * 住址
     */
    private String address;

    /**
     * 记录创建时间
     */
    private Long createTime;

    /**
     * 记录更新时间
     */
    private Long updateTime;
}
