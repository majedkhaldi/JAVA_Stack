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
public class CategoryController {

	@Autowired
	CategoryService catser;
	
	@Autowired
	ProductService proser;
	
	@GetMapping("/addcategory")
	public String addProductPage(@ModelAttribute("category") Category cat) {
		return "NewCategory.jsp";
		
	}
	@PostMapping("/addcategory/new")
	public String createProduct(@Valid @ModelAttribute("category") Category cat, BindingResult result) {
		if(result.hasErrors()) {
			return "NewCategory";
		}
		catser.createCategory(cat);
		return "redirect:/";
	}
	@GetMapping("/category/{id}")
	public String viewProduct(@PathVariable("id") Long id,Model model) {
		
		Category thiscategory = catser.findCategoryById(id);
		List<Product> allpros = proser.findByCategories(thiscategory);
		List<Product> allramainingpros = proser.findByCategoriesNotContains(thiscategory);
		model.addAttribute("thiscategory", thiscategory);
		model.addAttribute("allpros",allpros);
		model.addAttribute("allramainingpros",allramainingpros);
		
		return "CatItem.jsp";
	}
	@PostMapping("/category/{id}/add")
	public String addCategory(@PathVariable("id") Long catid,HttpSession session, @RequestParam("prooption") Long proId)  {
		Category thiscategory = catser.findCategoryById(catid);
		Product thisproduct = proser.findProductById(proId);
		proser.addCategoriesToProduct(thisproduct, thiscategory);
		
		return "redirect:/";
	}
	
}
