package Taux_glyce.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Taux_glyce.Model.Glycemie;
@Service
public interface GlycemieService {
	Glycemie ajouter(double valeur);
   List<Glycemie>Consulter(int day); 

}
