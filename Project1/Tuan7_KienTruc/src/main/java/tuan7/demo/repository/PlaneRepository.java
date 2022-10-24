
package tuan7.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tuan7.demo.model.Plane;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Long>{

	@Query(value="SELECT * FROM maybay ",nativeQuery = true)
	List<Plane> findPlanesGoToDalat();
	@Query(value="SELECT * FROM maybay WHERE TamBay > 10000 ",nativeQuery = true)
	List<Plane> Cau2();
	@Query(value="SELECT * FROM maybay WHERE loai like \"%Boeing%\" ",nativeQuery = true)
	List<Plane> Cau7();
	
}
