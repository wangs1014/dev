package com.forezp.controller;


import com.forezp.service.SchedualServiceHi;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@Controller

public class TestController {

	@Autowired
	SchedualServiceHi testService;
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	@ResponseBody
	public String sayHi(@RequestParam String name){
		return testService.sayHiFromClientOne(name);
	}
	@RequestMapping(value = "/seleMongodb",method = RequestMethod.GET)
	@ResponseBody
	public String seleMongodb(){
		return testService.seleMongodb();
	}
	@RequestMapping("/index")
	public String helloHtml() {

		return "/index";
	}


	@RequestMapping(value="/sele")
	@ResponseBody
	public List sele(){


		List list=testService.sele();



		return list;
	}

	@RequestMapping("delete")
	@ResponseBody
	public  String delete(String id){

		testService.delete(id);

		return "good";



	}





	@RequestMapping("seles")
	@ResponseBody
	public  List  seles(){


		List list=testService.seles();



		return list;
	}

	@RequestMapping("deletes")
	@ResponseBody
	public  String deletes(String id){

		testService.deletes(id);

		return "good";



	}

	@RequestMapping("adds")
	@ResponseBody
	public  String adds( String name,String monreg){

		testService.adds(name,monreg);

		return "good";


	}

	@RequestMapping("update")
	@ResponseBody
	public  String update( String id, String name,String monreg){

		testService.update(id,name, monreg);

		return "good";


	}

	@RequestMapping("toindexupdate")
	@ResponseBody
	public User toindexupdate(String id){



		return testService.toindexupdate(id);


	}

	@RequestMapping("addmongodb")
	@ResponseBody
	public  String addmongodb(@RequestParam String monname){


       System.err.println(monname);
		testService.addmongodb(monname);

		return "good";


	}
	@RequestMapping(value="/selemongodb")
	@ResponseBody
	public  List selemongodb(){

		List list=testService.selemongodb();

		return list;


	}
	@RequestMapping("deletemons")
	@ResponseBody
	public  String deletemons(String id){

		testService.deletemons(id);

		return "good";


	}
	@RequestMapping("updatemon")
	@ResponseBody
	public  String updatemon(String id,String name){

		testService.updatemon(id,name);

		return "good";


	}


	@RequestMapping("toupdate")
	@ResponseBody
	public  User toupdate(String id){



		return testService.toupdate(id);


	}


}
