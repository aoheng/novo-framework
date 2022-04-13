package com.novo.framework.core.util;

import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Aoheng on 2021/01/30 2020/12/12.
 */
public class MsgIdUtils {

    private static AtomicInteger seed = new AtomicInteger(100);

    //private static AtomicInteger seed2 = new AtomicInteger(100);

    public static long newMsgId(Integer clientSeed) {
        //1-9
        if (clientSeed == null || clientSeed > 9 || clientSeed < 1) {
            throw new IllegalArgumentException("newMsgId：clientSeed只能取1-9");
        }

        //10位时间戳
        long timestamp = (System.currentTimeMillis() / 1000);

        //100-999
        int suffix = 100;
        if (!seed.compareAndSet(999, suffix)) {
            suffix = seed.incrementAndGet();
        }

        String msgId = String.format("%s%s%s", timestamp, clientSeed, suffix);
        return Long.parseLong(msgId);
    }

//    public static int newIntegerMsgId(Integer clientSeed) {
//        //1-9
//        if (clientSeed == null || clientSeed > 9 || clientSeed < 1) {
//            throw new IllegalArgumentException("newMsgId：clientSeed只能取1-9");
//        }
//
//        long timestamp = (System.currentTimeMillis() / 1000);
//
//        //100-999
//        int suffix = 100;
//        if (!seed2.compareAndSet(999, suffix)) {
//            suffix = seed2.incrementAndGet();
//        }
//
//        String msgId = String.format("%s%s%s", String.valueOf(timestamp).substring(5), clientSeed, suffix);
//        return Integer.parseInt(msgId);
//    }

    public static byte[] toBytes(long msgId) {
        String id = msgId + "";
        Long timestamp = Long.parseLong(StringUtils.substring(id, 0, 10));
        int suffix = Integer.parseInt(StringUtils.substring(id, 10, 14));
        byte[] bytes = new byte[6];
        System.arraycopy(ByteUtils.uint32toBytes(timestamp, ByteOrder.BIG_ENDIAN), 0, bytes, 0, 4);
        System.arraycopy(ByteUtils.int16toBytes(suffix, ByteOrder.BIG_ENDIAN), 0, bytes, 4, 2);
        return bytes;
    }

    public static long parseBytes(byte[] bytes) {
        if (bytes.length != 6)
            throw new IllegalArgumentException(String.format("msgId（%s）必须是6个字节", HexUtils.bytes2HexStr(bytes)));

        byte[] tBytes = new byte[4];
        byte[] sBytes = new byte[2];
        System.arraycopy(bytes, 0, tBytes, 0, 4);
        System.arraycopy(bytes, 4, sBytes, 0, 2);
        long timestamp = ByteUtils.toUint32(tBytes, ByteOrder.BIG_ENDIAN);
        int suffix = ByteUtils.toInt16(sBytes, ByteOrder.BIG_ENDIAN);
        return Long.parseLong(String.format("%s%s", timestamp, suffix));
    }
}
