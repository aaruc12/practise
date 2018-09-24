package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Student;
import com.example.demo.inter.StudRepo;

@Controller
public class ControlStud {
	 @Autowired
	 StudRepo repo;
     @RequestMapping("/")
     public String home() {
    	 
    	 return "home.jsp";
     }
     @PostMapping("/addstud")
     public String insert(Student stu) {
    	 
    	repo.save(stu);
		return "home.jsp";
     }
     @PostMapping("/update")
     public String update(Student stu) {
    	 
    	 repo.deleteById(stu.getSid());
    	 repo.save(stu);
    	
		return "home.jsp";
     }
     @GetMapping("/find")
     public ModelAndView read(@RequestParam int sid) {
    	 
    	ModelAndView mv = new ModelAndView("insert.jsp");
    	Student stud  = repo.findById(sid).orElse(new Student());
    	mv.addObject(stud);
    	return mv;
     }
     @RequestMapping("/delete")
     public ModelAndView delete(@RequestParam int sid) {
    
    	 ModelAndView mv = new ModelAndView("delete.jsp");
    	 Student stud  = repo.findById(sid).orElse(new Student());
     	  mv.addObject(stud);
    	 repo.deleteById(sid);
    	 return mv;
    	 
     }
     @RequestMapping("/students")
     @ResponseBody
     public List<Student> Students() {
    	 
    	 return repo.findAll();
    	 
     }
     @RequestMapping("/students/{sid}")
     @ResponseBody
     public Optional<Student> StudentId(@PathVariable int sid) {
    	 
    	 return repo.findById(sid);
    	 
     }
     
}
