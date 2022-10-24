package tuan7.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tuan7.demo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	@Query(value = "SELECT * FROM nhanvien WHERE Luong < 10000",nativeQuery = true)
	List<Customer> Cau3();
	@Query(value = "SELECT SUM(luong) as Luong FROM nhanvien;",nativeQuery = true)
	int Cau8();
	@Query(value = "SELECT * FROM nhanvien JOIN chungnhan ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "					   JOIN maybay  ON maybay.MaMB = chungnhan.MaMB\r\n"
			+ "WHERE maybay.loai LIKE 'Boeing%';",nativeQuery = true)
	List<Customer> Cau9();
}
