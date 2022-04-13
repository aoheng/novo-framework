package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/04/12.
 * 温度模式
 */
public class TempModeVO {

    private String imeiCode;

    /**
     * M1温度模式（0：冲奶[40] 1：温水[55]  2：绿茶[85] 3：咖啡[88]（暂未用）4：红茶[95] 5：开水[99]（暂未用） 6：自定义（默认55））
     * 三出水温度模式（0-自由手动 1-固定中温 2-固定高温 3-中温可调 4-高温可调）
     */
    private Integer mode;

    /** 温度值 */
    private Integer temp = 0;

    /** 获取M1的温度 */
    public static Integer getM1Temp(int mode, int temp) {
        switch (mode) {
            case 0:
                return 40;
            case 1:
                return 55;
            case 2:
                return 85;
            case 3:
                return 88;
            case 4:
                return 95;
            case 5:
                return 99;
            case 6:
                return temp < 40 ? 55 : temp;
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("{mode=%s, temp=%s}", mode, temp);
    }

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public Integer getMode() { return mode; }

    public void setMode(Integer mode) { this.mode = mode; }

    public Integer getTemp() { return temp; }

    public void setTemp(Integer temp) { this.temp = temp; }
}
