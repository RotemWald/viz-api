package ai.viz.vizapi.dto;

public class ResponseSequence {
    private Integer offsetStart;
    private Integer offsetEnd;
    private String seriesId;

    public ResponseSequence(Integer offsetStart, Integer offsetEnd, String seriesId) {
        this.offsetStart = offsetStart;
        this.offsetEnd = offsetEnd;
        this.seriesId = seriesId;
    }

    public Integer getOffsetStart() {
        return offsetStart;
    }

    public void setOffsetStart(Integer offsetStart) {
        this.offsetStart = offsetStart;
    }

    public Integer getOffsetEnd() {
        return offsetEnd;
    }

    public void setOffsetEnd(Integer offsetEnd) {
        this.offsetEnd = offsetEnd;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }
}
