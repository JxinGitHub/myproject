package com.example.demo.controller;


import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
//@RequestMapping("/report")
public class ReportController {


    @GetMapping("/test")
    public String getCommitPage(){
        System.out.println("获取初始化页面");
        return "file";
    }



	@PostMapping("/aaa")
	@ResponseBody
    public void fileUpload(MultipartFile file,String area){
		System.out.println(area);
		try {
			FileUtils.writeByteArrayToFile(new File("D:/"+file.getOriginalFilename()),file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
    
    @PostMapping("commitInfo2")
    @ResponseBody
    public int insertCommitInfo2(MultipartFile file,HttpServletRequest request){

		try {
			FileUtils.writeByteArrayToFile(new File("D:/"+file.getOriginalFilename()),file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

		String area = request.getParameter("area");
		String time = request.getParameter("time");
		String filename = request.getParameter("filename");
		MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
//
    	List<MultipartFile> files = multiRequest.getFiles("file");
    	saveDetailLabels(files);
		Map<String, String> params = new HashMap<String, String>();
		params.put("area", area);
		params.put("time", time);	
		params.put("filename",filename);

//		int res = rs.insertCommitInfo2(params);
		return 1;

    }
    
    public String saveDetailLabels(List<MultipartFile> files) {
		// 文件 放置位置	
		String serverPath = getFilePath();
		File dir = new File(serverPath);
		String uuid = UUID.randomUUID().toString().substring(0, 5);
		if (!dir.exists()) {
			System.out.println("文件夹不存在");
			dir.mkdir();
		}
		String fileName = "";// 处理后的文件名和文件路径
		String path = "";
		fileName = uuid+".csv";// 保存在服务器的文件名
		path = serverPath+"\\"+fileName;//本地windos连接符
//	    path = serverPath+"/"+fileName;//linux连接符
		MultipartFile file = files.get(0);
		if(file.isEmpty() || file.getSize()==0){
			return "文件为空";
		}	
		try {
			byte[] buff = file.getBytes();
			FileOutputStream fileOut = new FileOutputStream(path);
			fileOut.write(buff);
			fileOut.flush();
			fileOut.close();
		//	file.transferTo(new File(path));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		//获得文件的行数和列数
		File filerc = new File(path); 
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(filerc));
			String sb = "";
			int r = 1;
			int c = 1;
			String firstLine = br.readLine();
			if(firstLine!=null){
			   for(int a= 0;a<firstLine.length(); a++){
				  if(firstLine.charAt(a)==','){
					  c++;
				  }
			   }
			}
			while((sb=br.readLine())!=null){
			      r++;  //不为空，行数加一
			}
			String row = String.valueOf(r);
			String column = String.valueOf(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
    /**
	 * 找到FileUpload的路径
	 * 1. 本地用于导入文件是存放文件
	 * 2. 本地用于文件读取时找到文件
	 * @return
	 */
	public String getFilePath(){
		
		String basePath = Thread.currentThread().getContextClassLoader().getResource("").toString();
		basePath = basePath.replace("/", "\\");
		basePath = basePath.replace("file:", "");
		basePath = basePath.replace("classes\\", "");
		basePath = basePath.replace("target\\", "");
		basePath = basePath.replace("reportcust\\", "");//找到项目的同级目录
		basePath = basePath.substring(1);
		System.out.println(basePath);
		// 新建文件夹   FileUpload
		String newPath = basePath+"FileUpload";	
		return newPath;
	}
	
	//linux
/*	public String getFilePath(){
		
		String basePath = Thread.currentThread().getContextClassLoader().getResource("").toString();
		basePath = basePath.replace("file:", "");
		basePath = basePath.replace("classes/", "");
		basePath = basePath.replace("target/", "");
		basePath = basePath.replace("wolabel/", "");//找到项目的同级目录
		basePath = basePath.replace("WEB-INF/", "");
//		basePath = basePath.substring(1);
		System.out.println(basePath);
		// 新建文件夹   FileUpload
		String newPath = basePath+"FileUpload";	
		return newPath;
	}*/
}
