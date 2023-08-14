package birding.observation.repository;

import birding.observation.entity.Observation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObservationJpaRepository extends JpaRepository <Observation, Integer>{

}
