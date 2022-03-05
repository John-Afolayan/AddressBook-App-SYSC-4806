package com.example.handlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

	@GetMapping("/buddyinfo")
	public String greetingForm(Model model) {
		model.addAttribute("buddyinfo", new BuddyInfo());
		return "buddyinfo";
	}

	@PostMapping("/buddyinfo")
	public String greetingSubmit(@ModelAttribute BuddyInfo buddyinfo, Model model) {
		model.addAttribute("buddyinfo", buddyinfo);
		return "result";
	}

}
