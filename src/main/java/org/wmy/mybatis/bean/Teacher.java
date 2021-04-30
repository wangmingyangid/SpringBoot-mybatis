package org.wmy.mybatis.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
public class Teacher implements Serializable{
	private Integer id;
	private String name;
	private Integer age;
	private Integer gender;

	public Teacher(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
}
