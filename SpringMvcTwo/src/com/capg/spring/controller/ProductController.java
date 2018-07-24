package com.capg.spring.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capg.spring.dto.Product;

import com.capg.spring.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	@RequestMapping(value="/showall",method=RequestMethod.GET)
	public ModelAndView getAllProducts() {
		List<Product> list=productService.showProduct();
		return new ModelAndView("show","prods",list);
		
	}
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String myProduct(@ModelAttribute("prod") Product prod)
	{
		return "add_product";
	}
	@RequestMapping(value="/addproduct",method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("prod") Product prod,BindingResult result) {
		productService.addProduct(prod);
		return "redirect:/showall";
		
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(@ModelAttribute("prod") Product prod) {
		return "delete";
	}
	
	@RequestMapping(value="/delete1",method=RequestMethod.POST)
	public String deleteProduct(@ModelAttribute("prod") Product prod)
	{
		int productId=prod.getProductId();
		productService.deleteProduct(productId);
		return "redirect:/showall";
	}
		
	
	
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String updateProduct(@ModelAttribute("prod") Product prod)
	{
		return "update";
	}
	@RequestMapping(value="/update1",method=RequestMethod.GET)
	public ModelAndView updateDetails(@ModelAttribute("prod") Product prod)
	{
		Product product=productService.searchProduct(prod.getProductId());
		
		return new ModelAndView("update2","empu",product);
		
	}
	
	@RequestMapping(value="/updateproduct",method=RequestMethod.POST)
	public String update(@ModelAttribute("prod") Product prod)
	{
		productService.updateProduct(prod);
		return "redirect:/showall";
		
	}
	
	
	
	
	
	
	
	
	
	
	}

