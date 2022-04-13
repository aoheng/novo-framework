package com.novo.commons.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.*;

/**
 * RSA 算法加密/解密工具类
 * @Author:kemingheng
 * @Date:2020/6/4
 */
public class RSAUtils {

    public static final String KEY_ALGORITHM = "RSA";

    public static byte[] encryptByPublicKey(byte[] data, String key)
    {
        byte[] keyBytes = hexToBin(key);
        return encryptByPublicKey(data, keyBytes);
    }

    public static byte[] encryptByPublicKey(byte[] data, byte[] key) {
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(key);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
            Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
            cipher.init(1, publicKey);
            return cipher.doFinal(data);
        } catch (Exception var6) {
            throw new RuntimeException(var6);
        }
    }

    public static byte[] decryptByPrivateKey(byte[] data, String key) {
        byte[] keyBytes = hexToBin(key);
        return decryptByPrivateKey(data, keyBytes);
    }

    public static byte[] decryptByPrivateKey(byte[] data, byte[] key) {
        try {
            PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(key);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
            Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
            cipher.init(2, privateKey);
            return cipher.doFinal(data);
        } catch (Exception var6) {
            throw new RuntimeException(var6);
        }
    }

    public static byte[] hexToBin(String src) {
        if (src.length() < 1) {
            return null;
        }
        byte[] encrypted = new byte[src.length() / 2];

        for (int i = 0; i < src.length() / 2; i++) {
            int high = Integer.parseInt(src.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(src.substring(i * 2 + 1, i * 2 + 2), 16);
            encrypted[i] = ((byte)(high * 16 + low));
        }

        return encrypted;
    }

    public static String binToHex(byte[] buf)
    {
        StringBuffer strbuf = new StringBuffer(buf.length * 2);

        for (int i = 0; i < buf.length; i++) {
            if ((buf[i] & 0xFF) < 16) {
                strbuf.append("0");
            }

            strbuf.append(Long.toString(buf[i] & 0xFF, 16));
        }

        return strbuf.toString();
    }
}
