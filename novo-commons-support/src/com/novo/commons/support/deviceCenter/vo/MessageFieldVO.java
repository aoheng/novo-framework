package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/10/26.
 * 消息传输字段
 */
public class MessageFieldVO {

    private int groupTypes;
    private int flagLength;
    private int flag;
    private String name;
    private Object value;
    private String comment;
    private Long ts;
    private String className;

    public Long getTs() { return ts; }

    public void setTs(Long ts) { this.ts = ts; }

    public String getClassName() { return className; }

    public void setClassName(String className) { this.className = className; }

    public int getGroupTypes() { return groupTypes; }

    public void setGroupTypes(int groupTypes) { this.groupTypes = groupTypes; }

    public int getFlagLength() { return flagLength; }

    public void setFlagLength(int flagLength) { this.flagLength = flagLength; }

    public int getFlag() { return flag; }

    public void setFlag(int flag) { this.flag = flag; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Object getValue() { return value; }

    public void setValue(Object value) { this.value = value; }

    public String getComment() { return comment; }

    public void setComment(String comment) { this.comment = comment; }
}
