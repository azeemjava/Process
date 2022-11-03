package in.tritonlabs.detail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.tritonlabs.detail.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

}
