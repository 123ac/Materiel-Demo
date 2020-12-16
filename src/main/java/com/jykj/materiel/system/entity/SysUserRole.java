package com.jykj.materiel.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 用户-角色表
 * </p>
 *
 * @author hjl
 * @since 2020-12-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SysUserRole对象", description="用户-角色表")
public class SysUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "user_id", type = IdType.AUTO)
    private String userId;

    private String roleId;


}
