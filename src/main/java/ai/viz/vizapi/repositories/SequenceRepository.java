package ai.viz.vizapi.repositories;

import ai.viz.vizapi.dto.RequestSequence;
import ai.viz.vizapi.entities.StartEndSequence;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class SequenceRepository {
    private Map<String, List<StartEndSequence>> sequenceMap;

    public SequenceRepository() {
        sequenceMap = new HashMap<>();
    }

    public StartEndSequence addSequence(RequestSequence sequence) {
        List<StartEndSequence> seSequences;
        String key = sequence.getScannerId() + sequence.getSeriesId();
        StartEndSequence seSequence = new StartEndSequence(sequence.getOffset(),
                sequence.getOffset() + sequence.getThickness());
        boolean matchingSequenceFound = false;

        if (!sequenceMap.containsKey(key)) {
            seSequences = new LinkedList<>();
            sequenceMap.put(key, seSequences);
        } else {
            seSequences = sequenceMap.get(key);
            for (StartEndSequence seq : seSequences) {
                Integer currSeqStartOffset = seq.getStartOffset();
                Integer currSeqEndOffset = seq.getEndOffset();
                Integer newSeqStartOffset = seSequence.getStartOffset();
                Integer newSeqEndOffset = seSequence.getEndOffset();

                if (Objects.equals(currSeqEndOffset, newSeqStartOffset)) {
                    seq.setEndOffset(newSeqEndOffset);
                    seSequence.setStartOffset(seq.getStartOffset());
                    matchingSequenceFound = true;
                } else if (Objects.equals(newSeqEndOffset, currSeqStartOffset)) {
                    seq.setStartOffset(newSeqStartOffset);
                    seSequence.setEndOffset(seq.getEndOffset());
                    matchingSequenceFound = true;
                }
            }
        }

        if (!matchingSequenceFound) {
            seSequences.add(seSequence);
        }

        return seSequence;
    }
}
