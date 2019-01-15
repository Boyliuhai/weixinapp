package com.cug.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.cug.service.IUserService;
import com.cug.utils.RequestWrapper;

import net.sf.json.JSONObject;

/**
 *  用户登录拦截器，获取用户的token与服务器比较，验证通过则放行
 * @author LZF
 *
 */
public class LoginInterceptor implements HandlerInterceptor{
	
//	@Resource
//	private CommonsMultipartResolver multipartResolver;
	
	@Resource
	private IUserService iUserService;

	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler)throws Exception {
		System.out.println("-------------");
		System.out.println("进入了/拦截器");
		System.out.println("-------------");
		System.out.println(request.getCharacterEncoding());
		System.out.println("preHandle");
		//如果是登录页面，就放行
		if (request.getRequestURL().indexOf("/user/login") >= 0) {
			System.out.println("login return true");
			return true;
		}else if (request.getRequestURL().indexOf("/selectProject/returnProject") >=0){
			System.out.println("selectProject return also true");
			return true;
		}else if (request.getRequestURL().indexOf("/selectProject/indata") >=0){
			System.out.println("selectProject return also true");
			return true;
		}
		else if (request.getRequestURL().indexOf("inemployee/getproject") >=0){
			System.out.println("selectProject return also true");
			return true;
		}
		else if (request.getRequestURL().indexOf("inemployee/indata") >=0){
			System.out.println("selectProject return also true");
			return true;
		}
		else if (request.getRequestURL().indexOf("upload/upshenfenzheng") >=0){
			System.out.println("selectProject return also true");
			return true;
		}
		else if (request.getRequestURL().indexOf("identitycard/idcardload") >=0){
			System.out.println("selectProject return also true");
			return true;
		}
		else if (request.getRequestURL().indexOf("identitycard/message") >=0){
			System.out.println("selectProject return also true");
			return true;
		}
		else if (request.getRequestURL().indexOf("upload/upTouxiang") >=0){
			System.out.println("到不到这里啊");
			System.out.println("selectProject return also true");
			return true;
		}
		else if (request.getRequestURL().indexOf("identitycard/findheadfileload") >=0){
			System.out.println("selectProject return also true");
			return true;
		}
		else if (request.getRequestURL().indexOf("upload/upTezhong") >=0){
			System.out.println("selectProject return also true");
			return true;
		}
		else if (request.getRequestURL().indexOf("identitycard/findspecialload") >=0){
			System.out.println("selectProject return also true");
			return true;
		}
		else if (request.getRequestURL().indexOf("upload/upTijian") >=0){
			System.out.println("selectProject return also true");
			return true;
		}
		else if (request.getRequestURL().indexOf("identitycard/findhealthload") >=0){
			System.out.println("selectProject return also true");
			return true;
		}
		else if (request.getRequestURL().indexOf("zongti/ziti") >=0){
			System.out.println("selectProject return also true");
			return true;
		}
		System.out.println("----------------");
		System.out.println("这是拦截器2");
		System.out.println("----------------");
		RequestWrapper requestWrapper = new RequestWrapper(request);
		
		String contentType = request.getContentType();
		String token = "";
		
		//对于form-data类型请求处理
		if (contentType != null && contentType.contains("multipart/form-data")) {
			
			token = request.getParameter("token");
			
		}
		//对json类型请求处理
		else {
			
			String jsonBody = new String(requestWrapper.getBody());
			
			if (!StringUtils.isNotBlank(jsonBody)) {
				return false;
			}
			
			JSONObject jsonObject = JSONObject.fromObject(jsonBody);
			token = (String) jsonObject.get("token");
		}
		
		System.out.println("other:"+token);
		
		//如果验证token通过就放行
		if (iUserService.validateUserToken(token)) {
			return true;
		}
		
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion");
	}
	
}
