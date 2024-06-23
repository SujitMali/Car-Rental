package com.byteBusters.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String indexPage()
	{
		System.out.println("index page");
		return "index";
	}
	
	@RequestMapping("/index")
	public String indexBackPage()
	{
		System.out.println("index page");
		return "index";
	}
	
	@RequestMapping("/index-about")
	public String indexAboutPage()
	{
		System.out.println("index about");
		return "index-about";
	}
	
	@RequestMapping("/index-blog")
	public String indexBlogPage()
	{
		System.out.println("index blog");
		return "index-blog";
	}
	
	@RequestMapping("/index-car")
	public String indexCarsPage()
	{
		System.out.println("index car");
		return "index-car";
	}
	
	@RequestMapping("/index-contact")
	public String indexContactPage()
	{
		System.out.println("index contact");
		return "index-contact";
	}
	
	@RequestMapping("/index-pricing")
	public String indexPricingPage()
	{
		System.out.println("index pricing");
		return "index-pricing";
	}
	
	@RequestMapping("/index-services")
	public String indexServicesPage()
	{
		System.out.println("index services");
		return "index-services";
	}
}
