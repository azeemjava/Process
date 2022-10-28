package in.tritonlabs.mobile.company.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.tritonlabs.mobile.company.entity.MobileCompany;
import in.tritonlabs.mobile.company.service.impl.MobileCompanyServiceImpl;

@RestController
@RequestMapping("api/v1/mobile-company")
public class MobileCompanyController {

	@Autowired
	MobileCompanyServiceImpl mobileCompanyService;

	@PostMapping("/")
	public ResponseEntity<String> saveAll(@RequestBody List<MobileCompany> mobileCompany) {
		Optional<List<MobileCompany>> op = mobileCompanyService.saveAll(mobileCompany);
		return ResponseEntity.ok("Data saved");
	}

	@GetMapping("/")
	public List<MobileCompany> getAll() {

		return mobileCompanyService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<MobileCompany> getOne(@PathVariable("id") long id) {

		return mobileCompanyService.getOne(id);
	}

	@PutMapping("/")
	public ResponseEntity<String> update(@RequestBody List<MobileCompany> mobileCompany) {
		Optional<List<MobileCompany>> op = mobileCompanyService.update(mobileCompany);
		return ResponseEntity.ok("Data updated");
	}

	@DeleteMapping("/{id}")
	public String deleteOne(@PathVariable("id") long id) {
		mobileCompanyService.deleteOne(id);
		return "Deleted";
	}
}
