package org.wmy.mybatis.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;



@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
@Data
@ToString
public class Key  {
	private Integer id;
	private String keyName;
	private Lock lock;

}
