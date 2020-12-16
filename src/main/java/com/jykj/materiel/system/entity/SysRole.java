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
 * 权限表
 * </p>
 *
 * @author hjl
 * @since 2020-12-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SysRole对象", description="权限表")
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "Id", type = IdType.AUTO)
    private String id;

    @TableField("roleName")
    private String rolename;

    @ApiModelProperty(value = "描述")
    private String detail;

    @ApiModelProperty(value = "删除标识：1-删除  0-未删除")
    private Boolean delflag;

    @TableField("createTime")
    private Date createtime;


}
