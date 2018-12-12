package org.spring.springboot.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by cll on 2018/8/26.
 */
public class Result implements Serializable {

	private String name;
	private Date time;
	private String message;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
