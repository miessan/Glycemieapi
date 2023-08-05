package Taux_glyce.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;

import Taux_glyce.Model.Glycemie;
import Taux_glyce.Repositorie.Glycemierepository;
import Taux_glyce.Service.glycemieServiceImpl;





@RestController
public class GlycemieController {
	@Autowired
	glycemieServiceImpl glycemieService;
	@Autowired 
	Glycemierepository glycymirepo;
@GetMapping("/{valeur}")
public Glycemie taux(@PathVariable double valeur) {
	return glycemieService.ajouter(valeur);
}
@GetMapping("/taux/{day}")
public List<Glycemie>Resultat(@PathVariable int day){
	
	return glycemieService.Consulter(day);
}
@GetMapping("/taux")
public List<Glycemie>Resultatal(){
	
	return glycymirepo.findAll();
}


}
