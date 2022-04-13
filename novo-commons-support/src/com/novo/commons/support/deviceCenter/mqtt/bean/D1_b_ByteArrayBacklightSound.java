package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

/**
 * @author Aoheng on 2020/04/09.
 * 背光和声音
 */
public class D1_b_ByteArrayBacklightSound {

    /** 背光（0~100） */
    private Integer backlight;
    /** 声音（0：关闭 1：开启） */
    private Integer sound;

    public D1_b_ByteArrayBacklightSound(){}

    public D1_b_ByteArrayBacklightSound(byte[] bytes) {
        backlight = ByteUtils.toUint8(bytes[0]);
        sound = ByteUtils.toUint8(bytes[1]);
    }

    public byte[] toBytes() {
        byte[] bytes = new byte[2];
        bytes[0] = ByteUtils.uint8toByte(backlight);
        bytes[1] = ByteUtils.uint8toByte(sound);
        return bytes;
    }

    public Integer getBacklight() { return backlight; }

    public void setBacklight(Integer backlight) { this.backlight = backlight; }

    public Integer getSound() { return sound; }

    public void setSound(Integer sound) { this.sound = sound; }
}
