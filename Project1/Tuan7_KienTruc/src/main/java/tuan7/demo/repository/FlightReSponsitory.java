package tuan7.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tuan7.demo.model.Flight;

@Repository
public interface FlightReSponsitory  extends JpaRepository<Flight, Long> {
	@Query(value="SELECT * FROM chuyenbay WHERE DoDai > 8000 and DoDai < 10000",nativeQuery = true)
	List<Flight> Cau4();
	@Query(value="SELECT * FROM chuyenbay WHERE (GaDi = \"SGN\" AND GaDen = \"BMV\")",nativeQuery = true)
	List<Flight> Cau5();
	@Query(value="SELECT * FROM chuyenbay WHERE (GaDi = \"SGN\")",nativeQuery = true)
	List<Flight> Cau6();
}
