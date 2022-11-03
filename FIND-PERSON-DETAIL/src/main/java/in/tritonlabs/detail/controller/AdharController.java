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
import in.tritonlabs.detail.entity.Adhar;
import in.tritonlabs.detail.request.AdharRequest;
import in.tritonlabs.detail.service.impl.AdharServiceImpl;

@RestController
@RequestMapping("api/v1/adhar")
public class AdharController {

	@Autowired
	AdharServiceImpl adharService;

	@GetMapping("/")
	public List<Adhar> readAll() {
		return adharService.ReadAll();
	}

	@GetMapping("/{id}")
	public Adhar readOne(@PathVariable("id") long id) {
		Optional<Adhar> op = adharService.readOne(id);
		return op.get();

	}

	@PostMapping("/{id}")
	public String create(@RequestBody AdharRequest adharRequest, @PathVariable long id) {
		adharService.create(adharRequest, id);
		return "Saved";
	}

	@PutMapping("/{id}")
	public String update(@RequestBody AdharRequest adharRequest, @PathVariable long id) {
		adharService.update(adharRequest, id);
		return "Updated";
	}
}
