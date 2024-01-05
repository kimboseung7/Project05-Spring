package com.example.demo.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.BookDTO;
import com.example.demo.dto.PersonDTO;


@Controller
@RequestMapping("/quiz")
public class QuizController {
	@GetMapping("/qz1")
	public void qz1(Model model) {
		model.addAttribute("name", "둘리"); 
		model.addAttribute("age", "20"); 
		model.addAttribute("address", "인천 구월동"); 
	}
	@GetMapping("/qz2")
	public void q2(Model model) {
		model.addAttribute("title", "스프링부트웹프로젝트"); 
		model.addAttribute("pub", "구멍가게 코딩단"); 
		model.addAttribute("date", "2022-12-25"); 
	}
    
    @GetMapping("/qz3")
    public void qz3(Model model){
        PersonDTO personDTO = new PersonDTO("둘리",20,"인천 구월동");
        model.addAttribute("dto", personDTO);
    }
    @GetMapping("/qz4")
    public void qz4(Model model){
        BookDTO bookDTO = new BookDTO("스프링부트웹프로젝트","구멍가게 코딩단",LocalDate.of(2022,12,25));
        model.addAttribute("dto", bookDTO);
    }
    @GetMapping("/qz5")
    public void qz5(Model model) {
       int[] arr = {1,2,3,4,5,6,7,8,9,10};
       model.addAttribute("arr",arr);
    }
    @GetMapping("/qz6")
    public void qz6(Model model) {
    	List<PersonDTO> person = new ArrayList<>();
    	person.add(new PersonDTO("둘리",20,"인천 구월동"));
    	person.add(new PersonDTO("또치",30,"서울 신림동"));
    	person.add(new PersonDTO("도우너",40,"부산 문래동"));
    	model.addAttribute("person", person);
    }
    @GetMapping({"/qz7","/qz8"})
    public void qz7(Model model) {
    	List<PersonDTO> person = new ArrayList<>();
    	person.add(new PersonDTO("박하나",25,"인천 구월동"));
    	person.add(new PersonDTO("홍재범",17,"서울 신림동"));
    	person.add(new PersonDTO("문유리",31,"부산 문래동"));
    	person.add(new PersonDTO("김재민",8,"인천 연수동"));
    	person.add(new PersonDTO("장유라",33,"부산 문래동"));
    	model.addAttribute("person", person);
    }
    
}
