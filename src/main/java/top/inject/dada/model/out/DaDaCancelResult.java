package top.inject.dada.model.out;

public class DaDaCancelResult {
    /**
     * 扣除的违约金(单位：元)
     */
    private String deductFee;

    public String getDeductFee() {
        return deductFee;
    }

    public void setDeductFee(String deductFee) {
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
