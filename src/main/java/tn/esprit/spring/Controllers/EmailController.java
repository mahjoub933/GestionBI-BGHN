package tn.esprit.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Entity.EmailRequest;
import tn.esprit.spring.Services.EmailService;

@RestController
public class EmailController {

	@Autowired
	EmailService emailser;
	
	
	@PostMapping("/sendmail")
	@ResponseBody
	public boolean SendEmaill(@RequestBody EmailRequest email){
		return emailser.sendEmail(email.getSubject(), email.getMessage(), email.getTo());
	}
	
	System.out.println("done");
}

