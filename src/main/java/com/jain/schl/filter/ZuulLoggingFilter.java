package com.jain.schl.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

//@Component
public class ZuulLoggingFilter extends ZuulFilter{

	private Logger logger = LoggerFactory.getLogger(ZuulLoggingFilter.class);
	
	@Override
	public Object run() throws ZuulException {
		
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		logger.info("\nRequest Coming from : {} \n Request URL ",request, request.getRequestURI());
		
		return null;
	}

	@Override
	public boolean shouldFilter() {
		
		return false;
	}

	@Override
	public int filterOrder() {
		
		return 0;
	}

	@Override
	public String filterType() {
		
		return null;
	}

}
