package com.ProductCat.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ProductCat.demo.Services.CategoryService;
import com.ProductCat.demo.Services.ProductService;
import com.ProductCat.demo.models.Category;
import com.ProductCat.demo.models.Product;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;



@Controller
public class ProductController {
	
	@Autowired
	ProductService proser;
	@Autowired
	CategoryService catser;
	
	@GetMapping("/")
	public String homePage(Model model) {
		List<Category> allcats = catser.findAllCategories();
		List<Product> allpros = proser.findAllProducts();
		model.addAttribute("allcategories", allcats);
		model.addAttribute("allproducts", allpros);

		return "HomePage.jsp";
	}
	@GetMapping("/addproduct")
	public String addProductPage(@ModelAttribute("product") Product product) {
		return "NewProduct.jsp";
		
	}
	@PostMapping("/addproduct/new")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "NewProduct";
		}
		proser.createProduct(product);
		return "redirect:/";
	}
	@GetMapping("/product/{id}")
	public String viewProduct(@PathVariable("id") Long id,Model model) {
		
		Product thisproduct = proser.findProductById(id);
		List<Category> allcats = catser.findAllByProducts(thisproduct);
		List<Category> allramainingcats = catser.findByProductsNotContains(thisproduct);
		model.addAttribute("thisproduct", thisproduct);
		model.addAttribute("allCategories",allcats);
		model.addAttribute("allramainingcats",allramainingcats);
		
		return "ProItem.jsp";
	}
	@PostMapping("/product/{id}/add")
	public String addCategory(@PathVariable("id") Long proid,HttpSession session, @RequestParam("catoption") Long catId)  {
		Product thisproduct = proser.findProductById(proid);
		Category thiscategory = catser.findCategoryById(catId);
		proser.addCategoriesToProduct(thisproduct, thiscategory);
		
		return "redirect:/";
	}
	
	
	
	
	
}
