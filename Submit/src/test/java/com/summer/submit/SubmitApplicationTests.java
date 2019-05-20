package com.summer.submit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.summer.submit.domain.Todo;
import com.summer.submit.mapper.TodoMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubmitApplicationTests {

	@Autowired private TodoMapper mapper;
	
	@Test
	public void Test() {
		
		assertThat(mapper.add(Todo.builder().title("배고파").content("밥줘").build()),is(1));
		assertThat(mapper.add(Todo.builder().title("배고파").content("밥줘").build()),is(1));
		assertThat(mapper.add(Todo.builder().title("배고파").content("밥줘").build()),is(1));
		
		List<Todo> list = mapper.getAll();
		assertThat(list.size(),is(5));
		
	}//end of selectAll

//	@Test
//	public void getAndUpdate() {
//		
//		Todo todo = mapper.getByNum(2);
//		assertThat(todo.getTitle(),is("안녕"));
//		todo.setPriority(80);
//		mapper.update(todo);
//		assertThat(todo.getPriority(),is(80));
//		
//	}//end of get
	
//	@Test
//	public void delete() {
//		
//		List<Todo> list = mapper.getAll();
//		assertThat(mapper.delete(list.get(0).getNum()), is(1));
//		
//	}//end of delete
	
//	@Test
//	public void finish() {
//		
//		List<Todo> list = mapper.getAll();
//		Todo t = list.get(0);
//		t.setFinish(1);
//		assertThat(mapper.update(t), is(1));
//		
//	}//end of delete
	
}
