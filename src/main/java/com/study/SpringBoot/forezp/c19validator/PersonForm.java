package com.study.SpringBoot.forezp.c19validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

    @NotNull //不为空
    @Size(min=2, max=30) //长度为2-30个字符
    private String name;

    @NotNull //不为空
    @Min(18) //不能小于18
    private Integer age;

    public String getName() {
        return this.name;
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

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}
