package com.TraineeMgt.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.TraineeMgt.model.User;

/**
 * Servlet Filter implementation class CheckLoggedInFilter
 */
@WebFilter("*.do")
public class CheckLoggedInFilter implements Filter {
   
    public CheckLoggedInFilter() {}

    @Override
    public void init(FilterConfig fConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) request;
        HttpServletResponse res=(HttpServletResponse) response;
        boolean isValid=false;
        
        HttpSession session = req.getSession(false);
        if(session!=null) {
            User user=(User) session.getAttribute("user");
            if(user!=null) {
                isValid=true;
            }
        }
        if(isValid) {
            chain.doFilter(request, response);
        }else {
            res.sendRedirect("login.jsp?message=login please");
        }
    }
    
    @Override
    public void destroy() {}

}