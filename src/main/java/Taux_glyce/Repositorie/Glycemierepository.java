package Taux_glyce.Repositorie;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Taux_glyce.Model.Glycemie;
@Repository
public interface Glycemierepository extends JpaRepository<Glycemie, Integer>{
	@Query(nativeQuery = true, value = "SELECT * FROM glycemie WHERE jours >=(CURRENT_DATE - INTERVAL '?1 days');")
	List<Glycemie> RechercheParjour( int day);

}
