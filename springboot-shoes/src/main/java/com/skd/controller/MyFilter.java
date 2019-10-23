package com.skd.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
@Component
//定义filterName 和过滤的url
@WebFilter(filterName = "my2Filter" ,urlPatterns = "/")
public class MyFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession();
        if(session.getAttribute("user")==null){
        String ykpath = (String)request.getServletPath();
        if(ykpath.equals("/forehome")||ykpath.equals("/getProduct")||ykpath.equals("/getReview")){
        	
        	   session.setAttribute("pid", 0);
        	   session.setAttribute("cid", 0);
                request.getSession().setAttribute("ykpath", ykpath);
            }
        }
                
		chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
