package com.summer.submit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.summer.submit.domain.Todo;
import com.summer.submit.mapper.TodoMapper;

@Controller
public class TodoController {

	private @Autowired TodoMapper mapper;

	@GetMapping("/")
	public String home(HttpServletRequest request) {
		List<Todo> list = mapper.getAll();
		request.setAttribute("list", list);
		return "home";
	}

	@PostMapping("/todo")
	public String add(@ModelAttribute Todo todo) {

		if(todo.getPriority() == null)
			todo.setPriority(100);
		
		mapper.add(todo);
		
		return "redirect:/";
	}// end of add

	@GetMapping("/todo/{num}")
	public String detail(HttpServletRequest request, @PathVariable int num) {

		request.setAttribute("todo", mapper.getByNum(num));
		return "detail";

	}// end of detail

	@GetMapping("/todo/revise/{num}")
	public String goUpdate(HttpServletRequest request, @PathVariable int num) {

		request.setAttribute("todo", mapper.getByNum(num));
		return "update";

	}// end of goUpdate

	@PutMapping("/todo/revise")
	public String update(@ModelAttribute Todo todo) {

		mapper.update(todo);
		return "redirect:/todo/" + todo.getNum();

	}// end of update

	@GetMapping("/delete/{num}")
	public String delete(@PathVariable int num) {

		mapper.delete(num);
		return "redirect:/";

	}// end of delete

	@GetMapping("/finish/{num}")
	public String finish(@PathVariable int num) {

		Todo t = mapper.getByNum(num);
		t.setFinish(1);
		mapper.update(t);
		return "redirect:/";

	}// end of update

}
