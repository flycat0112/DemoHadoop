package com.zengqiang.project.interceptor; /**
 * Created by SuperBoy on 2017/10/9.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @FileName: <p>BtnInterceptor</p>
 * @Description: 按钮角色权限拦截器
 * @Author SuperBoy
 * @Date 2017/10/9
 * ============================
 *
 * @Company: <p></p>
 * @Copyright: <p></p>
 *
 * ============================
 */
public class BtnInterceptor extends HandlerInterceptorAdapter {
	private static Logger logger = LoggerFactory.getLogger(BtnInterceptor.class);
	static {
		logger.warn("-----------","BtnInterceptor已经初始化");
	}
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String str = request.getRequestURI();
		String method = request.getParameter("method");

		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		super.afterConcurrentHandlingStarted(request, response, handler);
	}
}
