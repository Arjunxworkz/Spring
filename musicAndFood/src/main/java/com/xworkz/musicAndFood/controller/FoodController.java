package com.xworkz.musicAndFood.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.musicAndFood.dto.FoodDto;
@Component
@RequestMapping("/")
public class FoodController {
private Collection<FoodDto >foodDTOs=new ArrayList<FoodDto>();
	
	public FoodController() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	@RequestMapping("/food.do")
	public String foodAdd(FoodDto foodDTO,Model model) {
		System.out.println("Calling foodAdd");
		System.out.println("Fecthing FoodDto"+foodDTO);
		model.addAttribute("FoodDto", foodDTO);
		boolean add = foodDTOs.add(foodDTO);
	    int size = foodDTOs.size();
	    model.addAttribute("count", size);
		System.out.println(add);
		return "food.jsp";
		
	}
	@RequestMapping("/DisplayFood.do")
	public String viewFood(Model model) {
		System.out.println("Calling viewFood");
		model.addAttribute("list", this.foodDTOs);
		return "DisplayFood.jsp";
}
}
