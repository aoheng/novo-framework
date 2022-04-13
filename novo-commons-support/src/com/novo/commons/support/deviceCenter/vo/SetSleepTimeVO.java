package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/04/12.
 * 休眠时间设置
 */
public class SetSleepTimeVO {

    private String imeiCode;
    /** 单次休眠开始时间，10位时间戳 */
    private Integer singleStart;
    /** 单次休眠结束时间，10位时间戳 */
    private Integer singleEnd;
    /** 重复休眠，逢周几,如数组{1,4,7}表示周一、周四、周日 */
    private int[] repeatWeekdays;
    /** 重复休眠开始时间，每天相对00:00经过的秒数 */
    private Integer repeatStart;
    /** 重复休眠结束时间，每天相对00:00经过的秒数 */
    private Integer repeatEnd;

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public Integer getSingleStart() { return singleStart; }

    public void setSingleStart(Integer singleStart) { this.singleStart = singleStart; }

    public Integer getSingleEnd() { return singleEnd; }

    public void setSingleEnd(Integer singleEnd) { this.singleEnd = singleEnd; }

    public int[] getRepeatWeekdays() { return repeatWeekdays; }

    public void setRepeatWeekdays(int[] repeatWeekdays) { this.repeatWeekdays = repeatWeekdays; }

    public Integer getRepeatStart() { return repeatStart; }

    public void setRepeatStart(Integer repeatStart) { this.repeatStart = repeatStart; }

    public Integer getRepeatEnd() { return repeatEnd; }

    public void setRepeatEnd(Integer repeatEnd) { this.repeatEnd = repeatEnd; }
}
