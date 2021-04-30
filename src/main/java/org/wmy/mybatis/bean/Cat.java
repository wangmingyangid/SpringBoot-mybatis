package org.wmy.mybatis.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Cat {
	private Integer id;
	private String name;
	private Integer gender;
}
