package test;

import leetcode.*;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Stack;

/**
 * @Author :huayanjun
 * @Data: 2019/8/17 15:55
 *["MyStack","push","push","top","pop","empty"]
 * [[],[1],[2],[],[],[]]
 */
public class test  {

    public static void main(String[] args) {
        String s="我";
        String b="a";
        String c="a我";
        byte [] bt =s.getBytes();
        System.out.println(bt);
        //文件默认编码
        System.out.println(System.getProperty("file.encoding"));
        //获取系统默认的字符编码
        System.out.println(Charset.defaultCharset());
        //获取系统默认语言
        System.out.println(System.getProperty("user.language"));



    }








}
