package in.tritonlabs.mobile.company.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.tritonlabs.mobile.company.entity.MobileCompany;
import in.tritonlabs.mobile.company.repository.IMobileCompanyRepositoy;
import in.tritonlabs.mobile.company.service.IMobileCompanyService;

@Service
public class MobileCompanyServiceImpl implements IMobileCompanyService {

	
	@Autowired
	IMobileCompanyRepositoy mobileCompanyRepo;
	
	
	public List<MobileCompany> getAll(){
		return mobileCompanyRepo.findAll();
	}
	
	public Optional<List<MobileCompany>> saveAll(List<MobileCompany> mobileCompany){
	
		
		return  Optional.of(mobileCompanyRepo.saveAll(mobileCompany));
		
	}
	
	public Optional<MobileCompany> getOne(long id){
		
		return mobileCompanyRepo.findById(id);
	}
	
	
	public Optional<List<MobileCompany>> update(List<MobileCompany> mobileCompany){
	
			
		return  Optional.of(mobileCompanyRepo.saveAll(mobileCompany));
		}
		
	

	public String deleteOne( long id) {

		mobileCompanyRepo.deleteById(id);

		return null;
	}

	
}
