package de.webtechnologien.web;

import de.webtechnologien.service.TrainingsplanService;
import de.webtechnologien.web.api.Trainingsplan;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TrainingsplanRestController {

    private final TrainingsplanService trainingsplanService;

    public TrainingsplanRestController(TrainingsplanService trainingsplanService) {
        this.trainingsplanService = trainingsplanService;
    }

    @GetMapping(path = "/api/Trainingsplan")
    public ResponseEntity<List<Trainingsplan>> getTrainingsplan() {
        // erstelle eine Liste von Trainingsplänen
        List<Trainingsplan> trainingsplanliste = new ArrayList<>();

        // Füge Trainingspläne zur Liste hinzu
        trainingsplanliste.add(new Trainingsplan(1, "Bankdrücken", 3, 10));
        trainingsplanliste.add(new Trainingsplan(2, "Kniebeugen", 4, 12));
        trainingsplanliste.add(new Trainingsplan(3, "Kreuzheben", 3, 8));
        trainingsplanliste.add(new Trainingsplan(4, "Schulterdrücken", 3, 10));

        return ResponseEntity.ok(trainingsplanliste);
    }

    @GetMapping
    public ResponseEntity<Iterable<Trainingsplan>> getTrainingsplans() {
        return ResponseEntity.ok(trainingsplanService.getTrainingsplans());
    }

    @PostMapping
    public ResponseEntity<Trainingsplan> addTrainingsplan(@Valid @RequestBody final Trainingsplan trainingsplan) {
        final Trainingsplan created = trainingsplanService.addTrainingsplan(trainingsplan);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Trainingsplan> updateTrainingsplan(@PathVariable("id") final int id, @RequestBody Trainingsplan body) {
        body.setNr(id);
        final Trainingsplan updatedTrainingsplan = trainingsplanService.editTrainingsplan(body);
        return updatedTrainingsplan == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(updatedTrainingsplan);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteTrainingsplan(@PathVariable("id") final int id) {
        return trainingsplanService.removeTrainingsplan(id)
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }

}
