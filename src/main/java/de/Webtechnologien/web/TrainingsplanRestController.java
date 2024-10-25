package de.Webtechnologien.web;

import de.Webtechnologien.web.api.Trainingsplan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TrainingsplanRestController {

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


}
