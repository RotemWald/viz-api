package ai.viz.vizapi.services;

import ai.viz.vizapi.dto.RequestSequence;
import ai.viz.vizapi.entities.StartEndSequence;
import ai.viz.vizapi.repositories.SequenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SequenceService {
    @Autowired
    private SequenceRepository repository;

    public StartEndSequence addSequence(RequestSequence sequence) {
        return repository.addSequence(sequence);
    }
}
