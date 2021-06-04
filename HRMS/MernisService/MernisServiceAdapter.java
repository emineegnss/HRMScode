package kodlama.io.HRMS.MernisService;

import java.rmi.RemoteException;

import kodlama.io.HRMS.entities.concretes.Employees;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements MernisService{

	@Override
	public boolean checkUsers(Employees employees) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(employees.getNationalityNo()), employees.getFirstName(), employees.getLastName(), employees.getYearOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			
			e.printStackTrace();
		}
		return true;
	}

}
