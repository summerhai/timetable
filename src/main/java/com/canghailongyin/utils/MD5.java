package com.canghailongyin.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * Created by mingyue on 2017/6/27.
 */
public class MD5 {
    private static final String MD5_SALT = "canghailongyin:)";

    public static String md5(String str){
        String newSalt = str+"-"+MD5_SALT;
        return new Md5Hash(str,newSalt).toString() ;
    }

}
