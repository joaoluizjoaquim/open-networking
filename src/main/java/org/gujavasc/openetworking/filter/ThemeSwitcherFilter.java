package org.gujavasc.openetworking.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class ThemeSwitcherFilter implements Filter {

	private static final String _defaultTheme = "default";
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = ((HttpServletRequest)request);
		String selectedTheme = request.getParameter("theme");
		String sessionTheme = (String) httpRequest.getSession().getAttribute("theme");
		if(sessionTheme == null) selectedTheme = _defaultTheme;
		if(selectedTheme != null) httpRequest.getSession().setAttribute("theme", selectedTheme);
		
		
		
		chain.doFilter(request, response);
		
		httpRequest.setAttribute("theme", selectedTheme);
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
    
    
}
