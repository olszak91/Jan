package pl.janusze.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.janusze.entity.Box;


@Controller
public class HomeController {

	
	@RequestMapping("/home")
	@ResponseBody
	public String homeAction(){
		return  " <HTML><h1>Siema</h1></HTML>";
	}
	
	
	@RequestMapping("/www")
	@ResponseBody
	public String indexAction(){
		return  "index";
	}
	
	@GetMapping("/start")
	public String addCurr(Model model){
		model.addAttribute("box", new Box());
		return "/start";
	}
	
	@RequestMapping(value = "/start", method = RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute Box box, BindingResult result,Model model) {
		if (result.hasErrors()) {
			return "/start";
		}
		
		return "/start";
	}
	
	
	
	
}
