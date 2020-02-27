package cn.com.mvc.controller;

import cn.com.mvc.model.Fruits;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


//注解的Handler类
//代表这是一个Controller控制器
@Controller
@RequestMapping("/query")
public class FruitsControllerTest3 {
    private FruitsService fruitsService=new FruitsService();

    //商品查询列表
    //@RequestMapping 实现对queryFruits方法和url进行映射，一个方法对应一个url
    //一般建议url和方法写成一样
    @RequestMapping("/queryFruitsList")
    public ModelAndView queryFruitsList() throws Exception{
        List<Fruits> fruitsList=fruitsService.queryFruitsList();

        ModelAndView modelAndView=new ModelAndView();

        modelAndView.addObject("fruitsList",fruitsList);

        modelAndView.setViewName("/fruitsList");

        return modelAndView;
    }
    //下面可以定义增删改查url

}
