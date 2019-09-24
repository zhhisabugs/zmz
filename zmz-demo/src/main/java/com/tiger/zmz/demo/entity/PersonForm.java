package com.tiger.zmz.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author zhanghai2
 * @date 2019-9-24
 */
@Getter
@Setter
public class PersonForm {

    @NotNull
    @Size(min = 2, max = 30)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;
}
