package com.cug.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.cug.utils.RequestWrapper;

/**
 * 解决使用LoginInterceptor只能读取一次流，导致controller无法获取数据
 * @author LZF
 *
 */
public class HttpServletFilter implements Filter {
	
	private CommonsMultipartResolver multipartResolver;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		multipartResolver = new CommonsMultipartResolver();
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("-------------");
		System.out.println("进入了/过滤器");
		System.out.println("-------------");
		request.setCharacterEncoding("UTF-8");
		
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        // 处理 multipart/form-data 请求
        String contentType = request.getContentType();
        
        if (contentType != null && contentType.contains("multipart/form-data")) {
        	
            MultipartHttpServletRequest multiReq = multipartResolver.resolveMultipart(httpServletRequest);

            chain.doFilter(multiReq, response);
            
            return;
        }
		
		
		ServletRequest requestWrapper = null;
		
        if(request instanceof HttpServletRequest) {
        	
            requestWrapper = new RequestWrapper((HttpServletRequest) request);
            requestWrapper.setCharacterEncoding("UTF-8");
        }
        if(requestWrapper == null) {
        	
            chain.doFilter(request, response);
            
        } else {
        	
            chain.doFilter(requestWrapper, response); 
        }
//		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
//		ServletRequest requestWrapper = new RequestWrapper(httpServletRequest);
//		chain.doFilter(requestWrapper, response);
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
}
