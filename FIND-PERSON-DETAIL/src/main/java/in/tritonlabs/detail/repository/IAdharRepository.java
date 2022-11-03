package in.tritonlabs.detail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.tritonlabs.detail.entity.Adhar;

@Repository
public interface IAdharRepository extends JpaRepository<Adhar, Long >{

}
