package top.inject.dada.model.out;

public class DaDaTransport {
    /**
     * 配送距离(单位：米)
     */
    private Double distance;
    /**
     * 运费(单位：元)
     */
    private Double fee;

    public Double getDistance() {
        return distance;
    }

    public Double getFee() {
        return fee;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transport{");
        sb.append("distance=").append(distance);
        sb.append(", fee=").append(fee);
        sb.append('}');
        return sb.toString();
    }
}
