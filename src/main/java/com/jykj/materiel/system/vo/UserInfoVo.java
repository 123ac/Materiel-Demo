package com.jykj.materiel.system.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @Author: hjl
 * @Date: 2020/12/14 0014 8:55
 */
@Data
public class UserInfoVo {

    private String userName;

    private String depId;

    private String departmentName;

    private String nickname;

    private Integer sex;

    private String phone;

    private String email;


}
