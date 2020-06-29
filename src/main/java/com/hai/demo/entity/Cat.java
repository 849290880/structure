package com.hai.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：hai
 * @date ：Created in 2020/6/30 1:46 上午
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cat {

    private Integer id;

    private String name;

    private Integer age;

    private String color;

    private Double score;
}
