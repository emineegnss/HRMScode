package kodlama.io.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import kodlama.io.HRMS.entities.concretes.Employers;

import kodlama.io.HRMS.business.abstracts.EmployersService;
import kodlama.io.HRMS.core.utilities.resault.DataResault;

@RestController
@RequestMapping("/api/Employers")
public class EmployersController {
	private EmployersService employersService;

	@Autowired
	public EmployersController(EmployersService employersService) {
		super();
		this.employersService = employersService;
	}
	@GetMapping("/getall")
    public DataResault<List<Employers>> getAll() {
		return this.employersService.getAll();
	}

}
