package com.forezp.service;

import model.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry feign2"+name;
    }

    @Override
    public String seleMongodb() {

            return "sorry";
        }

    @Override
    public List sele() {
        return null;
    }

    @Override
    public void delete(String id) {

    }



    @Override
    public void addmongodb(String monname) {
System.err.println("出错了");
    }

    @Override
    public List selemongodb() {
        return null;
    }

    @Override
    public void deletemons(String id) {

    }

    @Override
    public User toupdate(String id) {
        return null;
    }




    @Override
    public User toindexupdate(String id) {
        return null;
    }

    @Override
    public List seles() {
        return null;
    }

    @Override
    public void deletes(String id) {
    }
    public void updatemon(String id, String name) {

    }
   @Override
    public void adds(String name, String monreg) {
    }

    @Override
    public void add(String name, String monreg) {

    }


    @Override
    public void update(String id, String name, String monreg) {

    }

}
