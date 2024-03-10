package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "员工登录时传递的数据模型")//用在类上，例如entity、DTO、VO
public class EmployeeLoginDTO implements Serializable {

    @ApiModelProperty("用户名")//用在属性上，描述属性信息
    private String username;

    @ApiModelProperty("密码")
    private String password;

}
