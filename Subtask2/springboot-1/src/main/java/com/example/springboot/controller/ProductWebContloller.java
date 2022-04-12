package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springboot.model.Product;

@Controller
public class ProductWebContloller {
	
	@Autowired
	ProductController productController;
	
	@GetMapping("/")
	public String getAllProducts(Model model) {
		List<Product> productList = productController.getAllProducts();
		model.addAttribute("products", productList);
		return "list_products";
	}
	
	@GetMapping("/new_product")
	public String addProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product",product);
		return "new_product";
	}
	
	@PostMapping(value = "/save_new")
	public String saveNewProduct(@ModelAttribute("product") Product product) {
		productController.addProduct(product);
		return "redirect:/";
	}
	
	@GetMapping("/update_product/{pId}")
	public String editForm(@PathVariable(name= "pId") Long id, Model model) {
		model.addAttribute("product",productController.getProduct(id));
		return "update_product";
	}
	@PostMapping(value = "/save_update")
	public String saveUpdateProduct(@ModelAttribute("product") Product product) {
		productController.updateProduct(product, product.getId());
		return "redirect:/";
	}
	@GetMapping("/delete_product/{pId}")
	public String deleteProduct(@PathVariable("pId") Long id, Model model) {
		model.addAttribute("product",productController.getProduct(id));
		return "delete_product";
	}
	@PostMapping(value = "/save_delete")
	public String saveDeleteProduct(@ModelAttribute("product") Product product) {
		productController.deleteProduct(product.getId());
		return "redirect:/";
	}
	
}
