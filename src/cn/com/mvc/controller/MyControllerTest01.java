package cn.com.mvc.controller;


import cn.com.mvc.model.Fruits;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/find")
public class MyControllerTest01 {
    private FruitsService fruitsService=new FruitsService();

    @RequestMapping(value = "/findByName")
    public String queryfindByName(Model model,@RequestParam("username") String name){
        System.out.println("-----查询名称为:"+name+"的数据-----");
        List<Fruits> fruitsList=fruitsService.queryFruitsByName(name);
        model.addAttribute("fruitsList",fruitsList);
        return "/fruitsList";
    }
    @RequestMapping(value = "/findById")
    public String queryfindById(Model model,@RequestParam("id") String id){
        System.out.println("-----查询id为:"+id+"的数据-----");
        List<Fruits> fruitsList=fruitsService.queryFruitsById(id);
        model.addAttribute("fruitsList",fruitsList);
        return "/fruitsList";
    }

}
