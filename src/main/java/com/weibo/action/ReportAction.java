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
		 // 报表数据源  
	    JRDataSource jrDataSource = new JRBeanCollectionDataSource(new ArrayList()); 
		model.addAttribute("url", "/WEB-INF/jasper/report2.jasper");
		model.addAttribute("format", "pdf");  
		model.addAttribute("jrMainDataSource", jrDataSource);  
		return "iReportView"; 
	}
}
