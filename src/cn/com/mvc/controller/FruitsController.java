package cn.com.mvc.controller;

import cn.com.mvc.model.Fruits;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class FruitsController implements Controller {
    private FruitsService fruitsService=new FruitsService();

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //模拟Service获取水果商品列表
        List<Fruits> fruitsList=fruitsService.queryFruitsList();
        //返回ModelAndView
        ModelAndView modelAndView=new ModelAndView();
        //相当于request的setAttribute，在jsp页面中通过fruitsList获取数据
        modelAndView.addObject("fruitsList",fruitsList);
        //指定视图
        modelAndView.setViewName("/WEB-INF/jsp/fruits/fruitsList.jsp");
        return modelAndView;
    }
}
class FruitsService{
    public List<Fruits> queryFruitsList(){
        List<Fruits> fruitsList=new ArrayList<>();

        Fruits apple=new Fruits();
        apple.setName("红富士苹果");
        apple.setPrice(2.3);
        apple.setProducing_area("山东");
        apple.setId("1");

        Fruits Banana=new Fruits();
        Banana.setName("香蕉");
        Banana.setPrice(1.5);
        Banana.setProducing_area("海南");
        Banana.setId("2");

        Fruits aaa=new Fruits();
        aaa.setId("3");
        aaa.setName("3");
        aaa.setPrice(3.3);
        aaa.setProducing_area("333");

        fruitsList.add(aaa);
        fruitsList.add(apple);
        fruitsList.add(Banana);
        return fruitsList;
    }
    public List<Fruits> queryFruitsByCondition(Fruits fruits){
        List<Fruits> fruitsList=new ArrayList<>();
        List<Fruits> fruitsList1=new ArrayList<>();
        fruitsList1=queryFruitsList();
        for(Fruits fruits1:fruitsList1){
            if(fruits.getName()!=null&&fruits.getProducing_area()!=null){
                if(fruits1.getName().equals(fruits.getName())&&
                   fruits1.getProducing_area().equals(fruits.getProducing_area())){
                    fruitsList.add(fruits1);
                }
            }else {
                if (fruits1.getName().equals(fruits.getName()) ||
                    fruits1.getProducing_area().equals(fruits.getProducing_area())){
                    fruitsList.add(fruits1);
                }
            }
        }
        return fruitsList;
    }
    public List<Fruits> queryFruitsByName(String name){
        List<Fruits> fruitsList=new ArrayList<>();
        List<Fruits> fruitsList1=queryFruitsList();
        if(name.equals(" ")||name==null){
            fruitsList=fruitsList1;
        }
        else {
            for (Fruits fruits1 : fruitsList1) {
                if (fruits1.getName().equals(name)) {
                    fruitsList.add(fruits1);
                }
            }
        }
        return fruitsList;
    }
    public List<Fruits> queryFruitsById(String id){
        List<Fruits> fruitsList=new ArrayList<>();
        List<Fruits> fruitsList1=queryFruitsList();
        if(id.equals(" ")||id==null){
            fruitsList=fruitsList1;
        }
        else {
            for (Fruits fruits1 : fruitsList1) {
                if (fruits1.getId().equals(id)) {
                    fruitsList.add(fruits1);
                }
            }
        }
        return fruitsList;
    }



}