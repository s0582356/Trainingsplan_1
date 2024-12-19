package de.webtechnologien.service;

import de.webtechnologien.persistence.TrainingsplanRepository;
import de.webtechnologien.web.api.Trainingsplan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TrainingsplanService {

    @Autowired
    private TrainingsplanRepository repository;

    public Optional<Trainingsplan> getTrainingsplan(final int id) {
        return this.repository.findById(id);
    }

    public Iterable<Trainingsplan> getTrainingsplans() {
        return this.repository.findAll();
    }

    public Trainingsplan addTrainingsplan(final Trainingsplan trainingsplan) {
        return this.repository.save(trainingsplan);
    }

    public Trainingsplan editTrainingsplan(final Trainingsplan trainingsplan) {
        if (!this.repository.existsById(trainingsplan.getNr())) return null;

        return addTrainingsplan(trainingsplan);
    }

    public boolean removeTrainingsplan(final int id) {
        final boolean exists = this.repository.existsById(id); // this.heroes.containsKey(id);
        if (exists) this.repository.deleteById(id);
        return exists;
    }


}
