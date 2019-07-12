package com.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;


@WebFilter("/*")
public class EncodingFilter extends HttpFilter {
	private static Logger logger = Logger.getLogger(EncodingFilter.class.getName());
	String[] exculde = new String[] { "/index","/AddUserServlet","/htindexServlet" };
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		int a=0;
		for (String e : exculde) {
			// 如果请求匹配排除表达式，则不过滤，即继续执行
			logger.info(e+" 和"+req.getServletPath());
			if (e.equals(req.getServletPath())) {
				logger.info("过滤排除"+req.getServletPath());
				//chain.doFilter(request, response);
				a=1;
			} else {
				// 如果不匹配，则验证用户登录状态，未登录，重定向到登录页面
				if (req.getSession().getAttribute("user") == null) {
					//logger.info("过滤不排除，未登录访问：" + req.getServletPath());
					//HttpServletResponse res = (HttpServletResponse) response;
					//logger.info("重定向啦" + req.getServletPath());
					//res.sendRedirect(req.getContextPath() + "/index");
					//return;

				}
			}
		}
if(a==1){
	chain.doFilter(request, response);
return;
}else{
	logger.info("a=0：" + req.getServletPath());
	if (req.getSession().getAttribute("user") == null) {
		logger.info("过滤不排除，未登录访问：" + req.getServletPath());
		HttpServletResponse res = (HttpServletResponse) response;
		logger.info("重定向啦" + req.getServletPath());
		res.sendRedirect(req.getContextPath() + "/index");
		return;

	}else {
		// 登录则不执行任何操作，向下传递
		logger.info("yidenglu,过滤bu排除"+req.getServletPath());
		chain.doFilter(request, response);
	}
}

		// TODO Auto-generated method stub
	}
	private static final long serialVersionUID = 1L;

}
