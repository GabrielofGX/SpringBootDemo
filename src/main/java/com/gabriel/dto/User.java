package com.gabriel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author gabriel
 * @Type User
 * @Desc
 * @date 2018/12/13 15:02
 */
@Data
@AllArgsConstructor
public class User {
	private Integer id;
	private String name;
	private Integer age;


}