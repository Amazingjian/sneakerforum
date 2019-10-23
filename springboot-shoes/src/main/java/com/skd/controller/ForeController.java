package com.skd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skd.pojo.Category;
import com.skd.pojo.Product;
import com.skd.pojo.Review;
import com.skd.pojo.User;
import com.skd.service.CategoryService;
import com.skd.service.ProductService;
import com.skd.service.ReviewService;
import com.skd.service.UserService;

@Controller
public class ForeController {
	
	@Autowired
	CategoryService categoryService;
	@Autowired
	private UserService userService;
	@Autowired
	private ProductService productService;
	@Autowired
	ReviewService reviewService;
	@RequestMapping("/forehome")
	public String home(Model model){
		List<Category> list = categoryService.list();
		model.addAttribute("cs", list);
		return "showCategory";
	}
	@RequestMapping("/getProduct")
	public String getProduct(int cid,Model model,HttpSession session){
		List<Product> list = productService.selectBycid(cid);
		model.addAttribute("ps", list);
		session.setAttribute("cid", cid);
		return "showProduct";
	}
	@RequestMapping("/getReview")
	public String getReview(int pid,HttpSession session,HttpServletRequest request,Model model){
		if(session.getAttribute("user")==null){
			
			session.setAttribute("pid", pid);
			
			return "/login-view";
		}else{
			List<Review> list = reviewService.list(pid);
			model.addAttribute("rs",list);
			return "/showReview";
		}
	}
	@RequestMapping("/userlogin")
	public String login(User user,Model model,HttpSession session,HttpServletRequest request){
		User u = userService.login(user);
		if(u==null){
			model.addAttribute("msg", "账号密码错误");
			return "/login-view";
		}
            String path = (String) session.getAttribute("ykpath");
            
            int pid = (int) session.getAttribute("pid");
            int cid = (int) session.getAttribute("cid");
            
            session.setAttribute("user",u);
            if(pid==0){
            	if(path.equals("/getProduct")){
            		return "redirect:"+path+"?cid="+cid;
            	}
            	return "redirect:"+path;
            }
            

		return "redirect:"+path+"?pid="+pid;
	}
	
	@RequestMapping("/forelogout")
	public String forelogout(HttpSession session,HttpServletRequest request){
		
			session.removeAttribute("user");
			
			return "redirect:forehome";
	}
	
	
	
	

}
