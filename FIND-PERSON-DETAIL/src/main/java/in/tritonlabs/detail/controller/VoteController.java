package in.tritonlabs.detail.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import in.tritonlabs.detail.entity.Vote;
import in.tritonlabs.detail.request.VoteRequest;
import in.tritonlabs.detail.service.impl.VoteServiceImpl;

@RestController
@RequestMapping("api/v1/vote")
public class VoteController {

	@Autowired
	VoteServiceImpl voteService;

	@GetMapping("/")
	public List<Vote> readAll() {
		return voteService.readAll();
	}

	@GetMapping("/{id}")
	public Vote readOne(@PathVariable("id") long id) {
		Optional<Vote> op = voteService.readOne(id);
		return op.get();

	}

	@PostMapping("/{id}")
	public String create(@RequestBody VoteRequest voteRequest, @PathVariable long id) {
		voteService.create(voteRequest, id);
		return "Saved";
	}

	@PutMapping("/{id}")
	public String update(@RequestBody VoteRequest voteRequest, @PathVariable long id) {
		voteService.update(voteRequest, id);
		return "Updated";
	}

}
