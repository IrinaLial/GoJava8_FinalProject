package findev.repository;

import findev.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryStatus extends JpaRepository<Status, Long> {
    Status findByName(String name);
}
