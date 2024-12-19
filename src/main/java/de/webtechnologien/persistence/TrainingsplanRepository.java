package de.webtechnologien.persistence;

import de.webtechnologien.web.api.Trainingsplan;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface TrainingsplanRepository extends CrudRepository<Trainingsplan, Integer> {
}
