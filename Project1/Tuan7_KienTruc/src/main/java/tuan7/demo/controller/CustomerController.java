package tuan7.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tuan7.demo.model.Plane;
import tuan7.demo.repository.CustomerRepository;
import tuan7.demo.model.Customer;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
	@GetMapping("/Cau3")
	public List<Customer> getAllPlant() {
		return customerRepository.Cau3();
	}
	@GetMapping("/Cau8")
	public int SumLuong() {
		return customerRepository.Cau8();
	}
	@GetMapping("/Cau9")
	public List<Customer> Cau9() {
		return customerRepository.Cau9();
	}
	
}
