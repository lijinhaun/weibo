package com.weibo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.weibo.service.IService;

public abstract class AbstarctAction {
	
	public String excute(HttpServletRequest request,HttpServletResponse response,IService service){
		//预处理
		preProcess();
		//处理业务
		process(service);
		//结束处理
		postProcess();
		return successView();
	}
	/**
	 * 预处理方法
	 */
	protected abstract void preProcess();
	//处理业务逻辑
	protected abstract void process(IService service);
	
	protected abstract void postProcess();
	//定义返回的页面
	protected abstract String successView();
}
