package cn.com.mvc.controller;


import cn.com.mvc.model.Fruits;
import cn.com.mvc.model.ListQryModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.*;
import java.util.List;

@Controller
@RequestMapping(value = "/check")
public class FruitsListCheck {

    private FruitsService fruitsService=new FruitsService();
    public void checkqueryById(Model model, ListQryModel listQryModel){
        //接收前台传回的集合参数
        List<Fruits> fruitsList=listQryModel.getFruitsList();
        // 初级写法
        //        for (Fruits fruits:fruitsList){
        //            System.out.println(fruits.getName());
        //        }
        // 高级写法 
        fruitsList.forEach(t-> System.out.println(t.getName()));
    }
}
