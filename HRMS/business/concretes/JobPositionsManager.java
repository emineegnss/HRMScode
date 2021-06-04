package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.JobPositionsService;
import kodlama.io.HRMS.core.utilities.resault.DataResault;
import kodlama.io.HRMS.core.utilities.resault.Resault;
import kodlama.io.HRMS.core.utilities.resault.SuccesDataResault;
import kodlama.io.HRMS.core.utilities.resault.SuccesResault;
import kodlama.io.HRMS.dataAccess.abstracts.JobPositionsDao;
import kodlama.io.HRMS.entities.concretes.JobPositions;

@Service
public class JobPositionsManager implements JobPositionsService{

	private JobPositionsDao jobPositionsDao;
	
	@Autowired
	public JobPositionsManager(JobPositionsDao jobPositionsDao) {
		super();
		this.jobPositionsDao = jobPositionsDao;
	}

	@Override
	public DataResault<List<JobPositions>> getAll() {
		
		return new SuccesDataResault<List<JobPositions>>
		(this.jobPositionsDao.findAll(),"Job Position data listelendi");
	}

	@Override
	public Resault add(JobPositions jobPositions) {
		this.jobPositionsDao.save(jobPositions);
		return new SuccesResault("Pozisyon eklendi");
	}
	
	

}
