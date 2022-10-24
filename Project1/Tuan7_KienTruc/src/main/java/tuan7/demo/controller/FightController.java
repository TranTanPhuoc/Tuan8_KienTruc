package tuan7.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tuan7.demo.model.Flight;
import tuan7.demo.repository.FlightReSponsitory;

@RestController
@RequestMapping("api/flight")
public class FightController {
	@Autowired
	private FlightReSponsitory flightRepository;
	@GetMapping("/dodai")
	public List<Flight> timDoDaiDuongDi() {
		return flightRepository.Cau4();
	}
	@GetMapping("/chuyenbay")
	public List<Flight> timChuyenBay() {
		return flightRepository.Cau5();
	}
	@GetMapping("/chuyenbaySG")
	public List<Flight> timChuyenBaySG(){
		return flightRepository.Cau6();
	}
}
