package cn.com.mvc.controller;


import cn.com.mvc.model.Fruits;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("query")
public class FruitsControllerTest4 {
    private FruitsService fruitsService=new FruitsService();

    @RequestMapping("queryFruitsByCondition")
    public String queryFruitsByCondition(Model model, Fruits fruits){
        List<Fruits> fruitsList=null;

        if((fruits.getName().equals(""))&&(fruits.getProducing_area().equals(""))){
            //查询所有的数据
            fruitsList=fruitsService.queryFruitsList();
        }
        else {
            //按条件查询
            fruitsList=fruitsService.queryFruitsByCondition(fruits);
        }
        model.addAttribute("fruitsList",fruitsList);
        return "/fruitsFind";

    }
}
