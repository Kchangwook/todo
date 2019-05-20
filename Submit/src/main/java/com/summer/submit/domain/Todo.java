package com.summer.submit.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Alias("todo")
@NoArgsConstructor
public class Todo {

	private Integer num;
	private String title;
	private String content;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date deadline;
	private Integer priority;
	private Integer finish;

	@Builder
	public Todo(String title, String content, Date deadline, Integer priority, Integer finish) {
		super();
		this.title = title;
		this.content = content;
		this.deadline = deadline;
		this.priority = priority;
		this.finish = finish;
	}

}// end of TodoList
