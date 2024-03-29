package birding.observation.service;

import birding.observation.entity.Observation;
import birding.observation.exception.ResourceNotFoundException;
import birding.observation.repository.ObservationJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ObservationServiceImpl implements ObservationService {
    @Autowired
    private ObservationJpaRepository obsJpaRepository;

//    public ObservationServiceImpl(ObservationJpaRepository obsJpaRepository) {
//        this.obsJpaRepository = obsJpaRepository;
//    }

    public ObservationServiceImpl() {
    }

    @Override
    public Observation createNewObservation(Observation observation) {
        Observation newObs = obsJpaRepository.save(observation);
        return findObservationById(newObs.getId());
    }

    @Override
    public void deleteObservationById(int id) {
        obsJpaRepository.deleteById(id);
    }

    @Override
    public Observation findObservationById(int id) {
        return obsJpaRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Observation with id " + id + " not found"));
    }

    @Override
    public Observation updateObservation(Observation observation, int id) {
        return null;
    }

    @Override
    public List<Observation> getObservationWithSortingAndFiltration() {
        return null;
    }
}
