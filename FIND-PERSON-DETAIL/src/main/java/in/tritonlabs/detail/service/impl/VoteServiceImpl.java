package in.tritonlabs.detail.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.tritonlabs.detail.entity.User;
import in.tritonlabs.detail.entity.Vote;
import in.tritonlabs.detail.repository.IUserRepository;
import in.tritonlabs.detail.repository.IVoteRespository;
import in.tritonlabs.detail.request.VoteRequest;
import in.tritonlabs.detail.service.IVoteService;

@Service
public class VoteServiceImpl implements IVoteService {

	@Autowired
	IVoteRespository voteRepo;
	@Autowired
	IUserRepository userRepo;

	public List<Vote> readAll() {
		return voteRepo.findAll();
	}

	public Optional<Vote> readOne(long id) {

		Optional<User> userop = userRepo.findById(id);
		User user = userop.get();
		List<Vote> vote = user.getVote();
		Vote voteGet = vote.get(0);
		long voteId = voteGet.getId();

		return voteRepo.findById(voteId);
	}

	public Vote create(VoteRequest voteRequest, long id) {

		Optional<User> userop = userRepo.findById(id);
		User user = userop.get();

		user.setId(user.getId());
		user.setName(user.getName());

		Vote vote = new Vote();
		vote.setId(id);
		vote.setIdentity(voteRequest.getIdentity());
		vote.setName(voteRequest.getName());
		vote.setUser(user);

		voteRepo.save(vote);
		return vote;

	}

	public Vote update(VoteRequest VoteRequest, long id) {

		Optional<User> userop = userRepo.findById(id);
		User user = userop.get();
		List<Vote> vote = user.getVote();
		Vote voteGet = vote.get(0);
		long voteId = voteGet.getId();

		user.setId(user.getId());
		user.setName(user.getName());

		Vote voteSet = new Vote();
		voteSet.setId(voteId);
		voteSet.setIdentity(VoteRequest.getIdentity());
		voteSet.setName(VoteRequest.getName());
		voteSet.setUser(user);

		voteRepo.save(voteSet);
		return voteSet;

	}

}
