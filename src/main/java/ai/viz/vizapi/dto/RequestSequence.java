package ai.viz.vizapi.dto;

public class RequestSequence {
    private Integer scannerId;
    private String seriesId;
    private Integer offset;
    private Integer thickness;

    public RequestSequence(Integer scannerId, String seriesId, Integer offset, Integer thickness) {
        this.scannerId = scannerId;
        this.seriesId = seriesId;
        this.offset = offset;
        this.thickness = thickness;
    }

    public Integer getScannerId() {
        return scannerId;
    }

    public void setScannerId(Integer scannerId) {
        this.scannerId = scannerId;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getThickness() {
        return thickness;
    }

    public void setThickness(Integer thickness) {
        this.thickness = thickness;
    }
}
