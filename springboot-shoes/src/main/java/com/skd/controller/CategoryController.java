package com.skd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.skd.pojo.Category;
import com.skd.service.CategoryService;
import com.skd.util.ImageUtil;
import com.skd.util.Page;
import com.skd.util.UploadedImageFile;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("/admin_category_list")
	public String listCategory(Model model,Page page){
		
		List<Category> cs = categoryService.list();
        model.addAttribute("page", page);
		model.addAttribute("cs",cs);

		return "admin/listCategory";
	}
	
	@RequestMapping("admin_category_add")
    public String add(Category c) throws IOException {
        categoryService.add(c);
//        File file = new File(imageFolder,c.getId()+".jpg");
//        if(!file.getParentFile().exists())
//            file.getParentFile().mkdirs();
//        uploadedImageFile.getImage().transferTo(file);
//        BufferedImage img = ImageUtil.change2jpg(file);
//        ImageIO.write(img, "jpg", file);
        System.out.println("...........");
        return "redirect:/admin_category_list";
    }
	
	   @RequestMapping("admin_category_delete")
	    public String delete(int id,HttpSession session) throws IOException {
	        categoryService.delete(id);

//	        File  imageFolder= new File(session.getServletContext().getRealPath("img/category"));
//	        File file = new File(imageFolder,id+".jpg");
//	        file.delete();

	        return "redirect:/admin_category_list";
	    }

	    @RequestMapping("admin_category_edit")
	    public String edit(int id,Model model) throws IOException {
	        Category c= categoryService.edit(id);
	        model.addAttribute("c", c);
	        return "admin/editCategory";
	    }

	    @RequestMapping("admin_category_update")
	    public String update(Category c) throws IOException {
	        categoryService.update(c);
//	        MultipartFile image = uploadedImageFile.getImage();
//	        if(null!=image &&!image.isEmpty()){
//	            File  imageFolder= new File(session.getServletContext().getRealPath("img/category"));
//	            File file = new File(imageFolder,c.getId()+".jpg");
//	            image.transferTo(file);
//	            BufferedImage img = ImageUtil.change2jpg(file);
//	            ImageIO.write(img, "jpg", file);
//	        }
	        return "redirect:/admin_category_list";
	    }

}
