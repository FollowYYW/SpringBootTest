package com.battle.common.MD5;

import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

/**
 * @Author kinds
 * @Date 2023/5/5 1:05
 * @Description 3DES 加密工具类
 */
public class Des3Util {

    private static final String CHARSET = "utf-8";

    private static final String DESEDE = "DESede";

    private static final String DEFAULT_CIPHER_ALGORITHM = "DESede/ECB/PKCS5Padding";

    private static final String SORCERANMDOM = "SHA1PRNG";

    /**
     * 使用指定字符串生成3DES加密密钥
     *
     * @param key
     * @return
     */
    private static SecretKeySpec getPwd(String key) throws Exception {
        KeyGenerator kg = KeyGenerator.getInstance(DESEDE);
        SecureRandom random = SecureRandom.getInstance(SORCERANMDOM);
        random.setSeed(key.getBytes());
        kg.init(random);
        //生成一个密钥
        SecretKey secretKey = kg.generateKey();
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), DESEDE);
        return secretKeySpec;
    }
    /**
     * 加密
     *
     * @param content 加密内容
     * @param key     加密key
     * @return 密文
     */
    public static String encrypt(String content, String key) throws Exception {
        Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
        // 创建密码器
        byte[] byteContent = content.getBytes(CHARSET);
        cipher.init(Cipher.ENCRYPT_MODE, getPwd(key));
        // 初始化为加密模式的密码器
        byte[] result = cipher.doFinal(byteContent);
        return Base64.encodeBase64String(result);
    }
    /**
     * 解密
     *
     * @param content 解密内容
     * @param key     解密key
     * @return 明文
     */
    public static String decrypt(String content, String key) throws Exception {
        // 实例化
        Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM); // 使用密钥初始化，设置为解密模式
        cipher.init(Cipher.DECRYPT_MODE, getPwd(key)); // 执行操作
        byte[] result = cipher.doFinal(Base64.decodeBase64(content));
        String resultStr = new String(result, CHARSET);
        return resultStr;
    }
}
