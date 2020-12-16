package com.jykj.materiel.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author hjl
 * @since 2020-12-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SysLog对象", description="")
public class SysLog implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "请求接口")
    private String uri;

    @ApiModelProperty(value = "请求方式")
    private String method;

    @ApiModelProperty(value = "描述")
    @TableField("MethodDescribe")
    private String MethodDescribe;

    @ApiModelProperty(value = "参数")
    private String params;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "ip")
    private String ip;

    @ApiModelProperty(value = "操作时间")
    private Date createDate;

    @ApiModelProperty(value = "浏览器类型")
    private String browser;


}
