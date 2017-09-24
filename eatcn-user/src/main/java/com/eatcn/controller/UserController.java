/**
 * 
 */
package com.eatcn.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.eatcn.domain.Goods;
import com.eatcn.domain.User;
import com.eatcn.service.UserService;
import com.eatcn.util.SmsUtil;

/*
 * 用户类控制层
 */
@Controller
public class UserController {
   
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/to_login")
	public String toLogin(Model  model){
	
		User user=new User();
	    model.addAttribute("user",user);
		return "login";
	}
	
	@RequestMapping("/dologin")
	public String login(HttpServletRequest request,
			HttpSession session,Model model){
		String  username = request.getParameter("username");
		String  password=request.getParameter("password");	
		if(service.login(username, password)){
		User user = service.getUserByUsername(username);
			session.setAttribute("user", user);
               if(2==user.getRoleTag()){
            	   return "index";//普通界面
               }else{
            	   return "main";//管理员界面
               }
               
               
		}else{
			model.addAttribute("hint", "用户名或密码错误");
			return "login";
		}
		
	}
		
	
	//跳转注册页面
	@RequestMapping("/to_register")
	public String  toRegister(Model model){
		User user=new User();	
		model.addAttribute("user",user);
		return "register";
		
	}
	//注册用户
	@RequestMapping(value="/doregister")
	public String  register(HttpServletRequest request,User user,
			@RequestPart("photo")MultipartFile mf ) throws Exception{
		
		String sex = request.getParameter("sex");
		Integer sex2 =Integer.parseInt(sex);		
		  String name=mf.getOriginalFilename();
	        String path=request.getServletContext().getRealPath("imgs");
		   String filename=name+"_"+System.currentTimeMillis();
		   File files=new  File(path+"\\"+filename);
		   System.out.println(files.getAbsolutePath());
		   mf.transferTo(files);	    	   
		   user.setImgUrl(filename);
		  user.setSex(sex2);
		   boolean ref = service.register(user);
		   if(ref){
			   return "redirect:to_login";
		   }
		System.out.println(user);
		return "register";
		
	} 
	
	//跳转修改用户资料
	@RequestMapping("/toupdate")
	public String toUpdate(HttpSession session,Model model){
		      
	        User user = (User) session.getAttribute("user");
		    
		    model.addAttribute("user", user);
		
		return "updateuser";
		}
	
	//修改用户资料
	@RequestMapping("/updateUser")
	public String changeTo(User user,HttpServletRequest request,
			@RequestPart("photo")MultipartFile mf) throws Exception{
		String userid = request.getParameter("userid");
		Integer userId=Integer.parseInt(userid);
		String sex = request.getParameter("sex");
		Integer sex2 =Integer.parseInt(sex);		
		  String name=mf.getOriginalFilename();
	        String path=request.getServletContext().getRealPath("imgs");
		   String filename=name+"_"+System.currentTimeMillis();
		   File files=new  File(path+"\\"+filename);
		   System.out.println(files.getAbsolutePath());
		   mf.transferTo(files);	    	   
		   user.setImgUrl(filename);
		  user.setSex(sex2);
		  user.setUserid(userId);
		  int i = service.updateUser(user);
		  
		  if(i>0){
			  return "index";
		  }
		  return "toupdate";
	}
	
	
	
	//
	@RequestMapping("/index")
	public String toindex(Model model){
		
		
		return "index";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//用户名异步验证
	@RequestMapping("/checkUsername")
	@ResponseBody
	public String checkUsername(HttpServletRequest request){
		String username = request.getParameter("username");
		User user = service.getUserByUsername(username);
		if(user!=null){
			return "0";
			}
					
		
			return  "1";
		
		
		
	}
		
	//短信验证码异步处理
	@RequestMapping("/sendMessage")
	@ResponseBody
	public  String checkMesage(HttpServletRequest request,HttpSession session){	
		String phone = request.getParameter("phone");
		System.out.println(phone);
		 Integer phoneCode = SmsUtil.sendMessage(phone);
		 System.out.println(phoneCode);		 
		 session.setAttribute("phoneCode", phoneCode);
		   if(phoneCode>0){
			   return "1";
		   }
		 return  "0";
	}
	
	@RequestMapping("/checkCode")
	@ResponseBody
	public String checkCode(HttpServletRequest request,HttpSession session){		
		String codes = request.getParameter("code");
		System.out.println("获取的验证码是:"+codes);
		Integer code = (Integer) session.getAttribute("phoneCode");
		
		System.out.println("Session中的验证码是:"+code);
		if(Integer.parseInt(codes)==code){
			return "1";
		}
		return "0";
	}
	
	//注销
	@RequestMapping("/validateUser")
	public String validate(HttpSession session){
		 session.invalidate();
		 return "to_login";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
