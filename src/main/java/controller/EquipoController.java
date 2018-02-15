package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipoController")
public class EquipoController {

	@RequestMapping(value="/getTeams", method=RequestMethod.GET)
	public void getTeams() {
		
	}
}
