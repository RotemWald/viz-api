package ai.viz.vizapi.controllers;

import ai.viz.vizapi.dto.RequestSequence;
import ai.viz.vizapi.dto.ResponseSequence;
import ai.viz.vizapi.entities.StartEndSequence;
import ai.viz.vizapi.services.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/sequence")
public class SequenceController {
    @Autowired
    private SequenceService service;

    @PostMapping
    private ResponseEntity<ResponseSequence> addSequence(@RequestBody RequestSequence sequence) {
        StartEndSequence seSequence = service.addSequence(sequence);
        ResponseSequence resSequence = new ResponseSequence(seSequence.getStartOffset(), seSequence.getEndOffset(),
                sequence.getSeriesId());
        return new ResponseEntity<>(resSequence, HttpStatus.OK);
    }
}
