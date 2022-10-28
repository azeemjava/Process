package in.tritonlabs.mobile.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.tritonlabs.mobile.company.entity.MobileCompany;

@Repository
public interface IMobileCompanyRepositoy extends JpaRepository<MobileCompany, Long> {}
