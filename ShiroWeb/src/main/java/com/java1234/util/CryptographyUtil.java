package com.java1234.util;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.crypto.hash.Md5Hash;
public class CryptographyUtil {
/**
 * base64加密
 */
	public static String enBase64(String str) {
		return Base64.encodeToString(str.getBytes());
	}
	
	
	/**
	 * base64解密
	 * @param str
	 * @return
	 */
	public static String decBase64(String str) {
		return Base64.decodeToString(str);
	}
	
	
	/*
	 * MD5加盐
	 */
	public static String md5(String str,String salt) {
		return new Md5Hash(str,salt).toString();
	}
	public static void main(String[] args) {
		String password="123456";
		System.out.println("Base64加密："+CryptographyUtil.enBase64(password));
	System.out.println("Base64解密"+CryptographyUtil.decBase64(CryptographyUtil.enBase64(password)));
	System.out.println("Md5加密："+CryptographyUtil.md5(password, "java1234"));
	}
}