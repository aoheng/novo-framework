package com.novo.commons.enums;


/**
 * 领券状态（0：未领，1：已领）
 */
public enum CouponStatus {

    T0("未领",0),
    T1("已领",1);

    public static final Integer  UNPICKUP= 0;
    public static final Integer  PICKUP= 1;

    // 成员变量
    private String name;
    private Integer index;

    // 构造方法
    private CouponStatus(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    // 普通方法
    public static String getName(Integer index) {
        for (CouponStatus c : CouponStatus.values()) {
            if (c.getIndex().equals(index)) {
                return c.name;
            }
        }
        return null;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	@Override
    public String toString() {
        return "OrderStatus{" +
                "name='" + name + '\'' +
                ", index='" + index + '\'' +
                '}';
    }
}
