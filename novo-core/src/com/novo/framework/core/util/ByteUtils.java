package com.novo.framework.core.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.Date;

/**
 * Created by aoheng on 2020/10/27.
 */
public class ByteUtils {

    public static byte[] combine(byte[] b1, byte[] b2) {
        byte[] bytes = new byte[b1.length + b2.length];
        System.arraycopy(b1, 0, bytes, 0, b1.length);
        System.arraycopy(b2, 0, bytes, b1.length, b2.length);
        return bytes;
    }

    /** 反转字节数组 */
    public static byte[] reverse(byte[] bytes) {
        int len = bytes.length;
        byte[] temp = new byte[len];
        int i = 0;
        while (i < len) {
            temp[i] = bytes[len - 1 - i];
            i++;
        }
        return temp;
    }

    /** 合并字节数组 */
    public static byte[] combind(byte[]... bytes) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            for (byte[] b : bytes)
                baos.write(b);
        } catch (IOException e) {
        }
        return baos.toByteArray();
    }

    /** 截取字节数组 */
    public static byte[] subByteArray(byte[] bytes, int start, int length) {
        return ArrayUtils.subarray(bytes, start, start + length);
    }

    /** 4字节 转 有符号整型 **/
    public static int toInt32(byte[] fourBytes, ByteOrder order) {
        if (order == ByteOrder.BIG_ENDIAN) {
            return (fourBytes[0] & 0xFF) << 24
                    | (fourBytes[1] & 0xFF) << 16
                    | (fourBytes[2] & 0xFF) << 8
                    | (fourBytes[3] & 0xFF);
        }
        return (fourBytes[0] & 0xFF)
                | (fourBytes[1] & 0xFF) << 8
                | (fourBytes[2] & 0xFF) << 16
                | (fourBytes[3] & 0xFF) << 24;
    }

    /** 有符号整型 转 4字节 **/
    public static byte[] int32toBytes(int int32, ByteOrder order) {
        if (int32 < -2147483648 || int32 > 2147483647)
            throw new UnsupportedOperationException("方法（int32toBytes）传入的参数超出范围（-2147483648~2147483647)");
        byte[] b = new byte[4];
        if (order == ByteOrder.BIG_ENDIAN) {
            b[0] = (byte) (int32 >> 24 & 0XFF);
            b[1] = (byte) (int32 >> 16 & 0XFF);
            b[2] = (byte) (int32 >> 8 & 0XFF);
            b[3] = (byte) (int32 & 0XFF);
        } else {
            b[0] = (byte) (int32 & 0XFF);
            b[1] = (byte) (int32 >> 8 & 0XFF);
            b[2] = (byte) (int32 >> 16 & 0XFF);
            b[3] = (byte) (int32 >> 24 & 0XFF);
        }
        return b;
    }

    /** 4字节 转 无符号整型 **/
    public static long toUint32(byte[] fourBytes, ByteOrder order) {
        if (order == ByteOrder.BIG_ENDIAN) {
            return (fourBytes[0] & 0xFFL) << 24
                    | (fourBytes[1] & 0xFFL) << 16
                    | (fourBytes[2] & 0xFFL) << 8
                    | fourBytes[3] & 0XFFL;
        }
        return (fourBytes[0] & 0xFFL)
                | (fourBytes[1] & 0xFFL) << 8
                | (fourBytes[2] & 0xFFL) << 16
                | (fourBytes[3] & 0XFFL) << 24;
    }

    /** 无符号整型 转 4字节 **/
    public static byte[] uint32toBytes(long unit32, ByteOrder order) {
        if (unit32 < 0 || unit32 > 4294967295L)
            throw new UnsupportedOperationException("方法（uint32toBytes）传入的参数超出范围（0~4294967295L)");

        byte[] b = new byte[4];
        if (order == ByteOrder.BIG_ENDIAN) {
            b[0] = (byte) (unit32 >> 24 & 0xFFL);
            b[1] = (byte) (unit32 >> 16 & 0XFFL);
            b[2] = (byte) (unit32 >> 8 & 0XFFL);
            b[3] = (byte) (unit32 & 0XFFL);
        } else {
            b[0] = (byte) (unit32 & 0XFFL);
            b[1] = (byte) (unit32 >> 8 & 0XFFL);
            b[2] = (byte) (unit32 >> 16 & 0XFFL);
            b[3] = (byte) (unit32 >> 24 & 0xFFL);
        }
        return b;
    }

    /** 日期 转 4字节（大端） **/
    public static byte[] dateToBytes(Date date) {
        return ByteUtils.uint32toBytes(date.getTime() / 1000, ByteOrder.BIG_ENDIAN);
    }

    /** 双字节 转 有符号整型 **/
    public static int toInt16(byte[] twoBytes, ByteOrder order) {
        if (order == ByteOrder.BIG_ENDIAN) {
            return (short) (((twoBytes[0] & 0xFF) << 8)
                    | (twoBytes[1] & 0xFF));
        }
        return (short) ((twoBytes[0] & 0xFF)
                | ((twoBytes[1] & 0xFF) << 8));
    }

    /** 有符号整型 转 双字节 **/
    public static byte[] int16toBytes(int int16, ByteOrder order) {
        if (int16 < -32768 || int16 > 32767)
            throw new UnsupportedOperationException("方法（int16toBytes）传入的参数超出范围（-32768~32767)");
        byte[] b = new byte[2];
        if (order == ByteOrder.BIG_ENDIAN) {
            b[0] = (byte) (int16 >> 8 & 0XFF);
            b[1] = (byte) (int16 & 0XFF);
        } else {
            b[0] = (byte) (int16 & 0XFF);
            b[1] = (byte) (int16 >> 8 & 0XFF);
        }
        return b;
    }

    /** 双字节 转 无符号整型 **/
    public static int toUint16(byte[] twoBytes, ByteOrder order) {
        if (order == ByteOrder.BIG_ENDIAN) {
            return (twoBytes[0] & 0xFF) << 8
                    | twoBytes[1] & 0xFF;
        }
        return twoBytes[0] & 0xFF
                | (twoBytes[1] & 0xFF) << 8;
    }

    /** 无符号整型 转 双字节 **/
    public static byte[] uint16toBytes(int uint16, ByteOrder order) {
        if (uint16 < 0 || uint16 > 65535)
            throw new UnsupportedOperationException("方法（uint16toBytes）传入的参数超出范围（0~65535)");
        byte[] b = new byte[2];
        if (order == ByteOrder.BIG_ENDIAN) {
            b[0] = (byte) (uint16 >> 8 & 0XFF);
            b[1] = (byte) (uint16 & 0XFF);
        } else {
            b[0] = (byte) (uint16 & 0XFF);
            b[1] = (byte) (uint16 >> 8 & 0XFF);
        }
        return b;
    }

    /** 单字节 转 有符号整型 **/
    public static int toInt8(byte b) {
        return b;
    }

    /** 有符号整型 转 单字节 **/
    public static byte int8toByte(int int8) {
        if (int8 < -128 || int8 > 127)
            throw new UnsupportedOperationException("方法（int8toByte）传入的参数超出范围（-128~127)");
        return (byte) (int8 & 0XFF);
    }

    /** 单字节 转 无符号整型 **/
    public static int toUint8(byte b) {
        return b & 0XFF;
    }

    /** 无符号整型 转 单字节 **/
    public static byte uint8toByte(int uint8) {
        if (uint8 < 0 || uint8 > 255)
            throw new UnsupportedOperationException("方法（uint8toByte）传入的参数超出范围（0~255)");
        return (byte) (uint8 & 0XFF);
    }

    /** 8字节 转 有符号长整型 **/
    public static long toLong64(byte[] eightBytes, ByteOrder order) {
        if (order == ByteOrder.BIG_ENDIAN) {
            return (eightBytes[0] & 0xFF) << 56
                    | (eightBytes[1] & 0xFF) << 48
                    | (eightBytes[2] & 0xFF) << 40
                    | (eightBytes[3] & 0xFF) << 32
                    | (eightBytes[4] & 0xFF) << 24
                    | (eightBytes[5] & 0xFF) << 16
                    | (eightBytes[6] & 0xFF) << 8
                    | (eightBytes[7] & 0xFF);
        }
        return (eightBytes[0] & 0xFF)
                | (eightBytes[1] & 0xFF) << 8
                | (eightBytes[2] & 0xFF) << 16
                | (eightBytes[3] & 0xFF) << 24
                | (eightBytes[4] & 0xFF) << 32
                | (eightBytes[5] & 0xFF) << 40
                | (eightBytes[6] & 0xFF) << 48
                | (eightBytes[7] & 0xFF) << 56;
    }

    /** 有符号长整型 转 8字节 **/
    public static byte[] long64toBytes(long n, ByteOrder order) {
        byte[] b = new byte[8];
        if (order == ByteOrder.BIG_ENDIAN) {
            b[0] = (byte) (n >> 56 & 0XFF);
            b[1] = (byte) (n >> 48 & 0XFF);
            b[2] = (byte) (n >> 40 & 0XFF);
            b[3] = (byte) (n >> 32 & 0XFF);
            b[4] = (byte) (n >> 24 & 0XFF);
            b[5] = (byte) (n >> 16 & 0XFF);
            b[6] = (byte) (n >> 8 & 0XFF);
            b[7] = (byte) (n & 0XFF);
        } else {
            b[0] = (byte) (n & 0XFF);
            b[1] = (byte) (n >> 8 & 0XFF);
            b[2] = (byte) (n >> 16 & 0XFF);
            b[3] = (byte) (n >> 24 & 0XFF);
            b[4] = (byte) (n >> 32 & 0XFF);
            b[5] = (byte) (n >> 40 & 0XFF);
            b[6] = (byte) (n >> 48 & 0XFF);
            b[7] = (byte) (n >> 56 & 0XFF);
        }
        return b;
    }

    /** 4字节 转 有符号整型数组 **/
    public static int[] toIntArray(byte b1, byte b2, byte b3, byte b4) {
        return new int[]{b1 & 0XFF, b2 & 0XFF, b3 & 0XFF, b4 & 0XFF};
    }

    /** 4字节 转 无符号整型数组 **/
    public static int[] toUintArray(byte b1, byte b2, byte b3, byte b4) {
        return new int[]{b1, b2, b3, b4};
    }

    public static String toIp(byte[] bytes) {
        return StringUtils.join(toUintArray(bytes[0], bytes[1], bytes[2], bytes[3]), '0');
    }

    /**
     * 转温度（返回整数，实际温度需除以10）
     * 最高位（Bit15）等于1表示负温度，温度最高位（Bit15）等于0表示正温度,
     * 温度除了最高位（Bit14~Bit0）表示温度值
     * 实际温度值=温度(Bit14~Bit0)/10
     * 如： 温度=0x010D=+269, 实际温度值=26.9℃
     * 温度=0x8065=-101, 实际温度值=-10.1℃
     */
    public static Integer toTmperature(byte[] bytes) {
        char[] chars = (Integer.toBinaryString(bytes[0] & 0xff) + Integer.toBinaryString(bytes[1] & 0xff)).toCharArray();
        if (chars[0] == '1') {
            chars[0] = '0';
            return -Integer.parseInt(new String(chars), 2);
        } else {
            return Integer.parseInt(new String(chars), 2);
        }
    }

    /**
     * 每周N的时间点P转换为int（4个字节）
     * weedDays：数组{1,4,7}表示周一、周四、周日
     * daySeconds：相对0点的秒数
     **/
    public static int weekNTime2Int(int[] weedDays, int daySeconds) {
        if (daySeconds < 0 || daySeconds > 60 * 60 * 24)
            throw new UnsupportedOperationException("无效的秒数");
        byte[] bytes = ByteUtils.int32toBytes(daySeconds, ByteOrder.BIG_ENDIAN);
        byte bit0 = (byte) (ArrayUtils.contains(weedDays, 1) ? 0x01 : 0x00);
        byte bit1 = (byte) (ArrayUtils.contains(weedDays, 2) ? 0x01 << 1 : 0x00);
        byte bit2 = (byte) (ArrayUtils.contains(weedDays, 3) ? 0x01 << 2 : 0x00);
        byte bit3 = (byte) (ArrayUtils.contains(weedDays, 4) ? 0x01 << 3 : 0x00);
        byte bit4 = (byte) (ArrayUtils.contains(weedDays, 5) ? 0x01 << 4 : 0x00);
        byte bit5 = (byte) (ArrayUtils.contains(weedDays, 6) ? 0x01 << 5 : 0x00);
        byte bit6 = (byte) (ArrayUtils.contains(weedDays, 7) ? 0x01 << 6 : 0x00);
        bytes[0] = (byte) (bit6 & 0xff | bit5 & 0xff | bit4 & 0xff | bit3 & 0xff | bit2 & 0xff | bit1 & 0xff | bit0 & 0xff);
        return ByteUtils.toInt32(bytes, ByteOrder.BIG_ENDIAN);
    }
}
