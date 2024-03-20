package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 员工记录表
 * </p>
 *
 * @author 小康
 * @since 2024-03-17 09:49:31
 */
@TableName("employees")
@ApiModel(value = "Employees对象", description = "员工记录表")
public class Employees {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty("年龄")
    @TableField("age")
    private Integer age;

    @ApiModelProperty("职位")
    @TableField("position")
    private String position;

    @ApiModelProperty("入职时间")
    @TableField("hire_time")
    private LocalDateTime hireTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDateTime getHireTime() {
        return hireTime;
    }

    public void setHireTime(LocalDateTime hireTime) {
        this.hireTime = hireTime;
    }

    @Override
    public String toString() {
        return "Employees{" +
        "id=" + id +
        ", name=" + name +
        ", age=" + age +
        ", position=" + position +
        ", hireTime=" + hireTime +
        "}";
    }
}
