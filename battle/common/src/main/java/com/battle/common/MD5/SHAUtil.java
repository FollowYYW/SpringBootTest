package com.battle.common.MD5;

import java.security.MessageDigest;

/**
 * @Author kinds
 * @Date 2023/5/5 1:14
 * @Description
 */
public class SHAUtil {

    final static String ALGORITHM_SHA = "SHA-1";

    /**
     * SHA加密
     * @param content 待加密内容
     * @return String
     */
    public static String SHAEncrypt(final String content) {
        try {
            MessageDigest sha = MessageDigest.getInstance(ALGORITHM_SHA);
            byte[] sha_byte = sha.digest(content.getBytes());
            StringBuffer hexValue = new StringBuffer();
            for (byte b : sha_byte) {
                //将其中的每个字节转成十六进制字符串：byte类型的数据最高位是符号位，通过和0xff进行与操作，转换为int类型的正整数。
                String toHexString = Integer.toHexString(b & 0xff);
                hexValue.append(toHexString.length() == 1 ? "0" + toHexString : toHexString);
            }
            return hexValue.toString();

//            StringBuffer hexValue2 = new StringBuffer();
//            for (int i = 0; i < sha_byte.length; i++) {
//                int val = ((int) sha_byte[i]) & 0xff;
//                if (val < 16) {
//                    hexValue2.append("0");
//                }
//                hexValue2.append(Integer.toHexString(val));
//            }
//            return hexValue2.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(SHAEncrypt("abc"));
    }
}
