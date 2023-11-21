package com.shopapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/shop")
public class ShopappController {
	@GetMapping(value="/shopapp")
	public String getShop() {
		return "Hello";
	}

}
