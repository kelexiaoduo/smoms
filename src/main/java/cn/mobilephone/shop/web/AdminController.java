package cn.mobilephone.shop.web;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.mobilephone.shop.enity.Admin;
import cn.mobilephone.shop.enity.User;
import cn.mobilephone.shop.service.AdminService;
import cn.mobilephone.shop.service.UserService;
import cn.mobilephone.shop.util.JsonResult;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Resource
	AdminService adminService;
	@Resource
	UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView adminLogin(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/back/adminLogin.jsp");
		return mav;
	}
	
	
	@RequestMapping("checkLogin.do")
	@ResponseBody
	public Map<String,String> checkLogin(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("UTF-8");
			String name = request.getParameter("name");
			String pwd = request.getParameter("pwd");
			Admin admin = adminService.checkAdmin(name, pwd);
			Map<String,String > map = new HashMap<String, String>();
			if(admin.getAdminPwd().equals(pwd)){
				map.put("msg", "true");
//				Cookie cookie = new Cookie("name", admin.getAdminName());
//				cookie.setPath("/");
//				response.addCookie(cookie);
				return map;
			}						
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping("toIndex")
	@ResponseBody
	public ModelAndView toIndex(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/back/index.jsp");
		return mav;
	}
	
	@RequestMapping("managePhone")
	@ResponseBody
	public ModelAndView toManagePhone(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/back/managePhone.jsp");
		return mav;
	}
	
	@RequestMapping("modifyAdminInfo")
	@ResponseBody
	public JsonResult<Boolean> modifyAdminInfo(HttpServletRequest req,HttpServletResponse res){
		String adminName = req.getParameter("adminName");
		String newPwd = req.getParameter("newPwd");
		Boolean b = adminService.updateAdmin(adminName, newPwd);
		return new JsonResult<Boolean>(b);
	}
	
	
	
	@RequestMapping("manageUser")
	@ResponseBody
	public ModelAndView toManageUser(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/back/manageUser.jsp");
		return mav;
	}
	
	@RequestMapping("queryUserByName")
	@ResponseBody
	public JsonResult<User> queryUser(HttpServletRequest req,HttpServletResponse res){
		String name = req.getParameter("name");
		User user = userService.findUserByName(name);
		return new JsonResult<User>(user);
	}
	
	@RequestMapping("modifyInf")
	@ResponseBody
	public ModelAndView toModifyInf(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/back/modifyInf.jsp");
		return mav;
	}
	
	
	
	@RequestMapping("manageArticle")
	@ResponseBody
	public ModelAndView toManageArticle(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/back/manageArticle.jsp");
		return mav;
	}
	
	
	@RequestMapping("manageOrders")
	@ResponseBody
	public ModelAndView toManageOrders(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/back/manageOrders.jsp");
		return mav;
	}
	
	
	@RequestMapping("loginOut")
	@ResponseBody
	public ModelAndView toLoginOut(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/back/loginOut.jsp");
		return mav;
	}
	
	
}
