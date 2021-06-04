package kodlama.io.HRMS.business.abstracts;
import java.util.List;

import kodlama.io.HRMS.core.utilities.resault.DataResault;
import kodlama.io.HRMS.core.utilities.resault.Resault;
import kodlama.io.HRMS.entities.concretes.JobPositions;


public interface JobPositionsService {

	
	DataResault<List<JobPositions>> getAll();
	Resault add(JobPositions jobPositions);
}
