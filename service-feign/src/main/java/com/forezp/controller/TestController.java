package com.forezp.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
	public String sele(String callback ){

		List list=testService.sele();

		String a=JSONObject.toJSONString(list);
		String aa="successCallback("+a+")";

		return aa;
	}

	@RequestMapping("delete")
	@ResponseBody
	public  String delete(String callback,String id){

		testService.delete(id);
		String a=JSONObject.toJSONString("good");
		String aa="successCallback("+a+")";
		return aa;



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
	public  String adds(String callback, String name,String monreg){

		testService.adds(name,monreg);
		String a=JSONObject.toJSONString("good");
		String aa="successCallback("+a+")";
		return aa;


	}

	@RequestMapping("update")
	@ResponseBody
	public  String update( String callback,String id, String name,String monreg){

		testService.update(id,name, monreg);
		String a=JSONObject.toJSONString("good");
		String aa="successCallback("+a+")";
		return aa;


	}

	@RequestMapping("toindexupdate")
	@ResponseBody
	public String toindexupdate(String id){

		User user=testService.toindexupdate(id);
		String a=JSONObject.toJSONString(user);
		String aa="successCallback("+a+")";
		return aa;



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
