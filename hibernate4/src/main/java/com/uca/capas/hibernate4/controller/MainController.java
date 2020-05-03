package com.uca.capas.hibernate4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.uca.capas.hibernate4.domain.Product;
@Controller
public class MainController {
	
	@GetMapping("/producto")
	public ModelAndView ingresarProducto() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("product", new Product());
		return mav;
	}
	
	@PostMapping("/validar")
	public ModelAndView validarProducto(@Valid @ModelAttribute Product product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("index");
		} else {
			mav.addObject("nombre", product.getNombre());
			mav.setViewName("result");
		}
		return mav;
	}
}