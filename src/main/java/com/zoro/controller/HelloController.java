package com.zoro.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author: omnifocus
 * @Date: 2020/7/21 7:33 AM
 * @Description: com.zoro.controller
 * @version: 1.0
 */
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("HelloController.handleRequest");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("helloview");
        mav.addObject("addObject_name", "addObject_value");
        return mav;
    }
}
