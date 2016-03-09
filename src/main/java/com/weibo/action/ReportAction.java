package com.weibo.action;

import java.util.ArrayList;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportAction {
	
	@RequestMapping("/report.do")
	public String testReoprt(Model model){
		System.out.println("����ɹ�");
		 // 报表数据源  
	    JRDataSource jrDataSource = new JRBeanCollectionDataSource(new ArrayList()); 
		model.addAttribute("url", "/WEB-INF/jasper/report2.jasper");
		model.addAttribute("format", "pdf"); // �����ʽ  
		model.addAttribute("jrMainDataSource", jrDataSource);  
		return "iReportView"; // ��Ӧjasper-defs.xml�е�bean id  
	}
}
