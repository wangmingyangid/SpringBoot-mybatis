package org.wmy.mybatis.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Employee {
	private Integer id;
	private String empName;
	private String email;
	private Integer gender;
	private String loginAccount;
}
