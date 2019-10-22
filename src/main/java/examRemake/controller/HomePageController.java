package examRemake.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import examRemake.Service.Destytojas_ir_EgzaminasService;

@Controller
public class HomePageController {
	
	@Autowired
	private Destytojas_ir_EgzaminasService destytojas_ir_EgzaminasService;
	
	@RequestMapping
	public String sveikiAtvyke(Model model, RedirectAttributes redirectAttributes) {
	
		model.addAttribute("pasisveikinimas", "Sveiki");
				
		return "SveikiAtvyke";
	}

	@RequestMapping("/exams")
	public String examsList(Model model) {
	
		model.addAttribute("exams", destytojas_ir_EgzaminasService.getAllDestytojas_ir_Egzaminas() );	
		
		return "exam";
	}

	
}
