package org.wmy.mybatis.bean;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Lock  {
	private Integer id;
	private String lockName;
	private List<Key> keys;
}
