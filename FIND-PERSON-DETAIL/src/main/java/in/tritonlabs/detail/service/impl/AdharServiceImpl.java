package in.tritonlabs.detail.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.tritonlabs.detail.entity.Adhar;
import in.tritonlabs.detail.entity.User;
import in.tritonlabs.detail.repository.IAdharRepository;
import in.tritonlabs.detail.repository.IUserRepository;
import in.tritonlabs.detail.request.AdharRequest;
import in.tritonlabs.detail.service.IAdharService;

@Service
public class AdharServiceImpl implements IAdharService {

	@Autowired
	IAdharRepository adharRepo;
	@Autowired
	IUserRepository userRepo;

	public List<Adhar> ReadAll() {
		return adharRepo.findAll();
	}

	public Optional<Adhar> readOne(long id) {

		Optional<User> userop = userRepo.findById(id);
		User user = userop.get();
		List<Adhar> adhar = user.getAdhar();
		Adhar adharGet = adhar.get(0);
		long adharId = adharGet.getId();

		return adharRepo.findById(adharId);
	}

	public Adhar create(AdharRequest adharRequest, long id) {

		Optional<User> userop = userRepo.findById(id);
		User user = userop.get();

		user.setId(user.getId());
		user.setName(user.getName());

		Adhar adhars = new Adhar();
		adhars.setId(id);
		adhars.setIdentity(adharRequest.getIdentity());
		adhars.setName(adharRequest.getName());
		adhars.setUser(user);

		adharRepo.save(adhars);
		return adhars;

	}

	public Adhar update(AdharRequest adharRequest, long id) {

		Optional<User> userop = userRepo.findById(id);
		User user = userop.get();
		List<Adhar> adhar = user.getAdhar();
		Adhar adharGet = adhar.get(0);
		long adharId = adharGet.getId();

		user.setId(user.getId());
		user.setName(user.getName());

		Adhar adharSet = new Adhar();
		adharSet.setId(adharId);
		adharSet.setIdentity(adharRequest.getIdentity());
		adharSet.setName(adharRequest.getName());
		adharSet.setUser(user);

		adharRepo.save(adharSet);
		return adharSet;

	}
}
