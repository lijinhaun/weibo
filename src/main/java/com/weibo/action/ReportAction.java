package com.weibo.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportAction {
	
	@RequestMapping("/report.do")
	public String testReoprt(Model model){
		System.out.println("����ɹ�");
		model.addAttribute("url", "/WEB-INF/jasper/report2.jasper");
//		model.addAttribute("format", "pdf"); // �����ʽ  
		return "iReportView"; // ��Ӧjasper-defs.xml�е�bean id  
	}
}
