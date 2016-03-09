package com.weibo.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportAction {
	
	@RequestMapping("/report.do")
	public String testReoprt(Model model){
		System.out.println("请求成功");
		model.addAttribute("url", "/WEB-INF/jasper/report2.jasper");
//		model.addAttribute("format", "pdf"); // 报表格式  
		return "iReportView"; // 对应jasper-defs.xml中的bean id  
	}
}
