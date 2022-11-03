package in.tritonlabs.detail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.tritonlabs.detail.entity.Vote;

@Repository
public interface IVoteRespository extends JpaRepository<Vote, Long> {

}
