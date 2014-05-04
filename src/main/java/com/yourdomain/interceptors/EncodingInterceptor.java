package com.yourdomain.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/**
 * �����������
 * http://blog.csdn.net/android_robot/article/details/6687947
 * 
 * @author simple
 *
 */
public class EncodingInterceptor implements HandlerInterceptor {
	
	private String encodingCharset = "utf-8";

	public String getEncodingCharset() {
		return encodingCharset;
	}

	public void setEncodingCharset(String encodingCharset) {
		this.encodingCharset = encodingCharset;
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object,
			Exception exception) throws Exception {
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object,
			ModelAndView modelAndView) throws Exception {
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
//		request.setCharacterEncoding("utf-8");
//		response.setCharacterEncoding("utf-8");

		request.setCharacterEncoding(this.encodingCharset);
		response.setCharacterEncoding(this.encodingCharset);
		
		return true;
	}
}
