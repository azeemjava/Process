package in.tritonlabs.mobile.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.tritonlabs.mobile.company.entity.MobileCompanyModel;

@Repository
public interface IMobileCompanyModelRepository extends JpaRepository<MobileCompanyModel, Long> {}
