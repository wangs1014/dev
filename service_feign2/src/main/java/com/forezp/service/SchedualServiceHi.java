package com.forezp.service;

import model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
//fallback用于指定类(SchedualServiceHiHystric)
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/seleMongodb",method = RequestMethod.GET)
    String seleMongodb();
  @RequestMapping(value = "/sele",method = RequestMethod.GET)
    List sele();
    @RequestMapping(value = "/delete")
    void delete(@RequestParam("id")String id);

    @RequestMapping(value = "/addmongodb",method = RequestMethod.GET)
    void addmongodb(@RequestParam("monname")String monname);
    @RequestMapping(value = "/selemongodb")
    List selemongodb();
    @RequestMapping(value = "/deletemons")
    void deletemons(@RequestParam("id")String id);
    @RequestMapping(value = "/toupdate",method = RequestMethod.GET)
    User toupdate(@RequestParam("id")String id);



    @RequestMapping(value = "/toindexupdate",method = RequestMethod.GET)
    User toindexupdate(@RequestParam("id")String id);
    @RequestMapping(value = "/seles",method = RequestMethod.GET)
    List seles();
    @RequestMapping(value = "/deletes")
    void deletes(@RequestParam("id")String id);
       @RequestMapping(value = "/add")
    void add(@RequestParam("name")String name,@RequestParam("monreg") String monreg);
   @RequestMapping(value = "/adds")
    void adds(@RequestParam("name")String name, @RequestParam("monreg")String monreg);

    @RequestMapping(value = "/update")
    void update(@RequestParam("id")String id, @RequestParam("name")String name, @RequestParam("monreg")String monreg);

  @RequestMapping(value = "/updatemon")
  void updatemon(@RequestParam("id")String id, @RequestParam("name")String name);
}
