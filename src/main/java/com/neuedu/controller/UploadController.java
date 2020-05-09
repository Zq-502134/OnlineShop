package com.neuedu.controller;

import com.neuedu.common.RespBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/upload")
public class UploadController {
    /**
     * 文件上传
     * @param picture
     * @param request
     * @return
     */
    @RequestMapping("/uploadGoodsImg")
    public RespBean uploadGoodsImg(@RequestParam("picture") MultipartFile picture, HttpServletRequest request) {
//获取文件在服务器的储存位置
        String path = request.getSession().getServletContext().getRealPath("/upload/goods/");
        File filePath =new File(path);
        System.out.println("filePath:" + path);
        if (!filePath.exists() && !filePath.isDirectory()) {
            System.out.println("if not exist，create directory:" + filePath);
            filePath.mkdir();
        }
        //获取原始文件名称(包含格式)
        String originalFileName = picture.getOriginalFilename();
        System.out.println("originalFileName:" + originalFileName);
        //获取文件类型，以最后一个`.`为标识
        String type = originalFileName.substring(originalFileName.lastIndexOf(".") +1);
        System.out.println("fileType:" + type);
        //获取文件名称（不包含格式）
        String name = originalFileName.substring(0, originalFileName.lastIndexOf("."));
        //设置文件新名称: 当前时间+文件名称（不包含格式）
        Date d =new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyyMMddHHmmss");
        String date = sdf.format(d);
        String fileName = date + name +"." + type;
        System.out.println("newFileName:" + fileName);
        //在指定路径下创建一个文件
        File targetFile =new File(path, fileName);
        //将文件保存到服务器指定位置
        try {
            picture.transferTo(targetFile);
            System.out.println("success");
            //将文件在服务器的存储路径返回
            return new RespBean("success",fileName);
        }catch (IOException e) {
            System.out.println("failure");
            e.printStackTrace();
            return new RespBean("error","上传失败");
        }
    }

    @RequestMapping("/uploadAdsImg")
    public RespBean uploadAdsImg(@RequestParam("picture") MultipartFile picture, HttpServletRequest request){
         return upload("/upload/carousel",picture,request);
    }

    public RespBean upload( String uploadPath,MultipartFile picture,HttpServletRequest request){
        String path = request.getSession().getServletContext().getRealPath(uploadPath);
        File filePath =new File(path);
        System.out.println("filePath:" + path);
        if (!filePath.exists() && !filePath.isDirectory()) {
            System.out.println("if not exist，create directory:" + filePath);
            filePath.mkdir();
        }
        //获取原始文件名称(包含格式)

        String originalFileName = picture.getOriginalFilename();
        System.out.println("originalFileName:" + originalFileName);
        //获取文件类型，以最后一个`.`为标识
        String type = originalFileName.substring(originalFileName.lastIndexOf(".") +1);
        System.out.println("fileType:" + type);
        //获取文件名称（不包含格式）
        String name = originalFileName.substring(0, originalFileName.lastIndexOf("."));
        //设置文件新名称: 当前时间+文件名称（不包含格式）
        Date d =new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyyMMddHHmmss");
        String date = sdf.format(d);
        String fileName = date + name +"." + type;
        System.out.println("newFileName:" + fileName);
        //在指定路径下创建一个文件
        File targetFile =new File(path, fileName);
        //将文件保存到服务器指定位置
        try {
            picture.transferTo(targetFile);
            System.out.println("success");
            //将文件在服务器的存储路径返回
            return new RespBean("success",fileName);
        }catch (IOException e) {
            System.out.println("failure");
            e.printStackTrace();
            return new RespBean("error","上传失败");
        }
    }
}
