package com.study.controller;

import com.study.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller("moreToMoreController")
@RequestMapping("/order")
public class MoreToMoreController {
    @Resource
    private OrderService service;

    String tips = "";

    @RequestMapping("/moreToMore")
    public ModelAndView moreToMore() {

        ModelAndView modelAndView = new ModelAndView();
        List list = service.selectallOrdersAndProducts();
        if (list.size() == 0) {
            tips = "数据为空！";
            modelAndView.addObject("tips", tips);
        } else
            modelAndView.addObject("tips", list);
        modelAndView.setViewName("result");
        return modelAndView;
    }
}
