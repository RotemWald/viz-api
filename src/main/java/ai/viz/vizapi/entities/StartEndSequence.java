package ai.viz.vizapi.entities;

public class StartEndSequence {
    private Integer startOffset;
    private Integer endOffset;

    public StartEndSequence(Integer start, Integer end) {
        this.startOffset = start;
        this.endOffset = end;
    }

    public Integer getStartOffset() {
        return startOffset;
    }

    public void setStartOffset(Integer startOffset) {
        this.startOffset = startOffset;
    }

    public Integer getEndOffset() {
        return endOffset;
    }

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }
}
