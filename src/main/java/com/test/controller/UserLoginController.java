package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

@Controller
public class UserLoginController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(String filename, int userid) {
        try {
            File[] list1 = new File(filename).listFiles();
            FileOutputStream fos = new FileOutputStream(filename + "/885339uu.zip");
            FileInputStream fis = new FileInputStream(filename + "/9946434.txt");
            ZipOutputStream zip = new ZipOutputStream(fos);
            new BufferedInputStream(fis).read();
            ZipInputStream zis = new ZipInputStream(fis);
            ZipFile zipFile = new ZipFile(filename);
            Enumeration<ZipEntry> entryList = (Enumeration<ZipEntry>) zipFile.entries();
            while (entryList.hasMoreElements()) {
                new FileOutputStream("E:/69343/" + entryList.nextElement().getName()).write("demo66.".getBytes("utf-8"));
            }
            ZipEntry entry = zis.getNextEntry();
            while (null != entry) {
                new FileOutputStream("/tmp/" + entry.getName().replace(".txt",".jsp"));
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "测试接口。。。";
    }

}
