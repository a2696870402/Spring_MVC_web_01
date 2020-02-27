package cn.com.mvc.controller;

import cn.com.mvc.model.Fruits;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class FruitsControllerTest2 implements HttpRequestHandler {
    private FruitsService fruitsService=new FruitsService();

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Fruits> fruitsList=fruitsService.queryFruitsList();
        //存入数据
        request.setAttribute("fruitsList",fruitsList);
        //转发视图view
        request.getRequestDispatcher("/WEB-INF/jsp/fruits/fruitsList.jsp").forward(request,response);

    }
}
