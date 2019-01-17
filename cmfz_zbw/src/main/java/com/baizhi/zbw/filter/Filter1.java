package com.baizhi.zbw.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Filter1 implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest res, ServletResponse ros,FilterChain fil) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) res;
		HttpServletResponse response = (HttpServletResponse) ros;
		HttpSession session = request.getSession();
		String login = (String) session.getAttribute("login");
		if("ok".equals(login)){
				fil.doFilter(request, response);
			return;
		}else{
			response.sendRedirect("/login.jsp");
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
