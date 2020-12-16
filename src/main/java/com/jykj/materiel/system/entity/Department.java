package com.jykj.materiel.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 部门表
 * </p>
 *
 * @author hjl
 * @since 2020-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Department对象", description="部门表")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "dpId", type = IdType.AUTO)
    private Integer dpId;

    @TableField("departmentName")
    private String departmentName;

    private String remarks;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private Date createTime;

    @ApiModelProperty(value = "分组查询中的部门人数")
    @TableField(exist = false) // false代表不为数据库表字段，该字段是sql中查询定义的。
    private Integer deptCount;
}
