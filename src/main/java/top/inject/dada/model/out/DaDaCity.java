package top.inject.dada.model.out;

public class DaDaCity {
    /**
     * 城市名称
     */
    private String cityCode;
    /**
     * 城市编码
     */
    private String cityName;

    public String getCityCode() {
        return cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public DaDaCity setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }

    public DaDaCity setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DaDaCity{");
        sb.append("cityCode='").append(cityCode).append('\'');
        sb.append(", cityName='").append(cityName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
