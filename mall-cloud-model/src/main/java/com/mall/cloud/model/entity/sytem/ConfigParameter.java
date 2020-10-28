package com.mall.cloud.model.entity.sytem;

import com.baomidou.mybatisplus.annotation.TableName;
import com.mall.cloud.common.persistence.entity.BaseEntity;
import lombok.*;

import java.math.BigDecimal;

/**
 * <p>封装Qicloud项目ConfigParameter类.<br></p>
 * <p>//TODO...<br></p>
 *
 * @author Powered by marklin 2020-10-28 22:53
 * @version 1.0.0
 * <p>Copyright © 2018-2020 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName(value = "mall_config_parameter")
public class ConfigParameter extends BaseEntity {
    private static final long serialVersionUID = 8126189452965639339L;
    /**
     * 配置id
     */
    private String id;
    /**
     * 配置编码
     */
    private String code;
    /**
     * 配置名称
     */
    private String name;
    /**
     * 配置信息
     */
    private String message;
    /**
     * 配置码值
     */
    private String value;
    /**
     * 配置作用域
     */
    private String scope;
    /**
     * 配置排序
     */
    private BigDecimal sort;
}
