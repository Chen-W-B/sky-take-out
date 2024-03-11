package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {

    //构建器模式是一种常用的设计模式，用于创建具有多个属性的对象。
    //它允许通过链式调用方法来设置对象的属性，而不是使用构造函数或setter方法。这种模式可以提高代码的可读性和易用性。
    //当在类上添加@Builder注解时，Lombok会自动生成一个静态内部类，该类包含与原始类相同的属性，并提供了相应的设置方法。
    //这些方法返回当前对象的引用，以便可以继续链式调用其他设置方法。最后，通过调用build()方法，可以创建一个具有所设置属性的新对象。
    //可以通过 Employee.builder().id(1).username("zs").其余属性(属性值).build() 来新建一个Employee对象

    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String name;

    private String password;

    private String phone;

    private String sex;

    private String idNumber;

    private Integer status;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    private Long createUser;

    private Long updateUser;

}
