package Taux_glyce.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Taux_glyce.Model.Glycemie;
import Taux_glyce.Repositorie.Glycemierepository;
import jakarta.transaction.Transactional;
@Service
@Transactional
public class glycemieServiceImpl implements GlycemieService {
	@Autowired
	Glycemierepository glycemierepository;

	@Override
	public Glycemie ajouter(double valeur) {
		// TODO Auto-generated method stub
		Glycemie glycemie=new Glycemie();
		glycemie.setValeur(valeur);
		return glycemierepository.save(glycemie);
	}

	@Override
	public List<Glycemie> Consulter(int day) {
		// TODO Auto-generated method stub
		return glycemierepository.RechercheParjour(day);
	}

}
