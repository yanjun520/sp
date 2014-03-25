package com.sp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class SystemFilter implements Filter {

    public void init(FilterConfig filterconfig) throws ServletException {
        System.out.println("#filter init");
    }

    public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse,
            FilterChain filterchain) throws IOException, ServletException {
        System.out.println("#filter dofilter");
        filterchain.doFilter(servletrequest, servletresponse);
    }

    public void destroy() {
        System.out.println("#filter destory");        
    }

    
    
}
