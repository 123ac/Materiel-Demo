package com.jykj.materiel.system.entity;


import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author hjl
 * @since 2020-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SysUserInfo对象", description="用户信息表")
public class SysUserinfo implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "用户sys_user的id")
    @TableField("userId")
    private String userId;

    @ApiModelProperty(value = "部门id")
    @TableField("departmentId")
    private String departmentId;

    @ApiModelProperty(value = "部门名称")
    @TableField(exist = false)
    private String departmentName;

    @ApiModelProperty(value = "昵称")
    @TableField("NickName")
    private String nickname;

    @ApiModelProperty(value = "性别")
    private Integer sex;

    @ApiModelProperty(value = "生日")
    private Date birthday;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;


}
