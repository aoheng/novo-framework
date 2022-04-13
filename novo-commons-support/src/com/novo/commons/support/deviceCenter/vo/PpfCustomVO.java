package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/04/09.
 * 滤芯自定义（一般用来清0）
 */
public class PpfCustomVO {

    private String imeiCode;

    @Override
    public String toString() {
        return String.format("{c1=%s, c2=%s, c3=%s, c4=%s, c5=%s}", c1, c2, c3, c4, c5);
    }

    /** 滤芯A */
    private Integer c1;
    /** 滤芯B */
    private Integer c2;
    /** 滤芯C */
    private Integer c3;
    /** 滤芯D */
    private Integer c4;
    /** 滤芯E */
    private Integer c5;

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public Integer getC1() { return c1; }

    public void setC1(Integer c1) { this.c1 = c1; }

    public Integer getC2() { return c2; }

    public void setC2(Integer c2) { this.c2 = c2; }

    public Integer getC3() { return c3; }

    public void setC3(Integer c3) { this.c3 = c3; }

    public Integer getC4() { return c4; }

    public void setC4(Integer c4) { this.c4 = c4; }

    public Integer getC5() { return c5; }

    public void setC5(Integer c5) { this.c5 = c5; }
}
