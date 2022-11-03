package in.tritonlabs.detail.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.tritonlabs.detail.entity.User;
import in.tritonlabs.detail.repository.IUserRepository;
import in.tritonlabs.detail.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserRepository userRepo;

	public List<User> ReadAll() {
		return userRepo.findAll();
	}

}
