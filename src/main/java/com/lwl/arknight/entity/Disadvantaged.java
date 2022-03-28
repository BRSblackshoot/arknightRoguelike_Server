package com.lwl.arknight.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author whl
 * @since 2021-12-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Disadvantaged implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer number;

    private String title;

    private String content;


}
