package com.example.RestApidemo20.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestApidemo20.model.StudentModel;

@RestController
@RequestMapping("api/v20")
public class StudentController {
	
	
	//http://localhost:8080/api/v20/K?id=1&name="YellaKrishna"&email="yellakrishna@gmail.com"
		@PostMapping("/K")
		public StudentModel insertDataIn(@RequestParam(value="id")int id
				,@RequestParam(value="name")String name,@RequestParam(value="email")String email) {
			StudentModel studentModel = new StudentModel(id,name,email);
			return studentModel;
		}
		
		//http://localhost:8080/api/v20/getAllStudents
		@GetMapping("getAllStudents")
		public Collection<StudentModel > getAllStudentsIn(){
			StudentModel studentModel1  = new StudentModel(1,"SureshKilly","sureshkilly@gmail.com");
			StudentModel studentModel2 = new StudentModel(2,"YellaKrishna","yellakrishna895@gmail.com");
			StudentModel studentModel3 = new StudentModel(3,"Ashok","ashokvarma@gmail.com");
			StudentModel studentModel4 = new StudentModel(4,"AnilBabu","anilbabu6@gmail.com");
			StudentModel studentModel5 = new StudentModel(5,"Vishnu","kadirivishnu@gmail.com");
			//Collection Of Students
			Collection<StudentModel> students=new ArrayList<>();
			students.add(studentModel1);
			students.add(studentModel2);
			students.add(studentModel3);
			students.add(studentModel4);
			students.add(studentModel5);
			return students;
			
		}
		
		//http://localhost:8080/api/v20/1/"yellakrishna"/"yellakrishna@gmail.com"
		@GetMapping("/{id}/{name}/{email}")
		public StudentModel getByIdIn(@PathVariable(value="id")int id,@PathVariable(value="name")String name
				,@PathVariable(value="email")String email) {
			StudentModel studentModel = new StudentModel(id,name,email);
			return studentModel;
			
		}
		//http://localhost:8080/api/v20/h?id=2&name="Rahul"&email="rahul@gmail.com"
		@GetMapping("/h")
		public StudentModel getByIdIn1(@RequestParam(value="id")int id,@RequestParam(value="name")String name
				,@RequestParam(value="email")String email) {
			StudentModel studentModel = new StudentModel(id,name,email);
			return studentModel;
			
		}
		
		//http://localhost:8080/api/v20/2/update
		@PutMapping("/{id}/update")
		public StudentModel updateByid(@PathVariable(value="id")int id,@RequestBody StudentModel studentModel) {
			return studentModel;
			
		}
		//http://localhost:8080/api/v20/delete/6
		@DeleteMapping("delete/{id}")
		public Map<String ,Boolean> deleteById(@PathVariable(value="id")int id){
			Map<String ,Boolean> message=new HashMap<>();
			message.put("Delete Successfully!!...", true);
			return message;
			
		}
		
}
