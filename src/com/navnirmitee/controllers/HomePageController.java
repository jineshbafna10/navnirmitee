package com.navnirmitee.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.navnirmitee.commons.JavaConstants;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcomePageController")
public class HomePageController {
	@RequestMapping(value="/welcome",method={RequestMethod.GET, RequestMethod.POST})
	public ModelAndView navNirmiteeHomePage(HttpServletRequest request, HttpSession session){
	   
		return new ModelAndView(JavaConstants.NAVNIRMITEE_HOME_PAGE_VIEW);
	}
}
