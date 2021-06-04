package kodlama.io.HRMS.api.controllers;
import kodlama.io.HRMS.entities.concretes.Employees;
import kodlama.io.HRMS.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import kodlama.io.HRMS.business.abstracts.JobPositionsService;
import kodlama.io.HRMS.core.utilities.resault.DataResault;
import kodlama.io.HRMS.core.utilities.resault.Resault;


@RestController
@RequestMapping("/api/JobPositions")
public class JobPositionsController {
	private JobPositionsService jobPositionsService;

	@Autowired
	public JobPositionsController(JobPositionsService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}
	@GetMapping("/getall")
    public DataResault<List<JobPositions>> getAll() {
		return this.jobPositionsService.getAll();
	}
	@PostMapping("/add")
	public Resault add(@RequestBody JobPositions jobPositions) {
		return this.jobPositionsService.add(jobPositions);
	}

}
