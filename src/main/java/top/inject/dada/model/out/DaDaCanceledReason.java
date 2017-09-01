package top.inject.dada.model.out;

public class DaDaCanceledReason {
    /**
     * 理由编号
     */
    private Integer id;
    /**
     * 取消理由
     */
    private String reason;

    public Integer getId() {
        return id;
    }

    public String getReason() {
        return reason;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
