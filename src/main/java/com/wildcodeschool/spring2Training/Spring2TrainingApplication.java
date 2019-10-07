package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class Spring2TrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring2TrainingApplication.class, args);
	}


	@RequestMapping("/doctor/{number}")
	@ResponseBody
	public String doctor(@PathVariable int number) {
		if (number >= 1 && number <= 8){
			throw new ResponseStatusException(HttpStatus.SEE_OTHER, "Error 303, See other");
		} else if (number == 9){
			return "Christopher Eccleston";
		} else if (number == 10){
			return "David Tennant";
		} else if (number == 11){
			return "Matt Smith";
		} else if (number == 12){
			return "Peter Capaldi";
		} else if (number == 13){
			return "Jodie Whittaker";
		}
		else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de récupérer l'incarnation " + number + " !");
		}

	}

}



