package com.jykj.materiel.handler;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 业务异常
 * @Author: hjl
 * @Date: 2020/12/11 0011 13:59
 */
@Data
@AllArgsConstructor // 构造方法
@NoArgsConstructor // 无参构造
public class BusinessException extends  RuntimeException {

    @ApiModelProperty(value = "状态码")
    private Integer code;

    @ApiModelProperty(value = "错误信息")
    private String errMsg;
}
