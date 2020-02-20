package com.example.testgeoip;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class GeoLocationController {
	
	@GetMapping("/")
	@ResponseBody
	public String getIp() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		return "IP : "+request.getRemoteAddr() + "     " + GeoIPv4.getLocation(request.getRemoteAddr());
	}
	
//	@GetMapping("/")
//	@ResponseBody
//	public String getIp() {
//		return "hello";
//	}
	
	
	
	

}
