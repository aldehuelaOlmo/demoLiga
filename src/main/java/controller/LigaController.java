package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ligaController")
public class LigaController {

	@RequestMapping(value="/getLeagues", method=RequestMethod.GET)
	public void getLeagues() {
		
	}
}
