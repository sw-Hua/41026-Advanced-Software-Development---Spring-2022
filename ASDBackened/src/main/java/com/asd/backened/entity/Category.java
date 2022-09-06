package com.asd.backened.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 */
@Data
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;


    //type1DishesAssortment2MealAssortment
    private Integer type;


    //categoryName
    private String name;


    //order
    private Integer sort;


    //creationTime
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;


    //updateTime
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;


    //founder
    @TableField(fill = FieldFill.INSERT)
    private Long createUser;


    //modifiedBy
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateUser;

}
