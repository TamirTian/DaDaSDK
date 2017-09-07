package top.inject.dada.model.out;

public class DaDaCancelResult {
    /**
     * 扣除的违约金(单位：元)
     */
    private Double deductFee;

    public Double getDeductFee() {
        return deductFee;
    }

    public void setDeductFee(Double deductFee) {
        this.deductFee = deductFee;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DaDaCancelResult{");
        sb.append("deductFee='").append(deductFee).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
