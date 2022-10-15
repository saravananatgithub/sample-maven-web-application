package com.mt.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class EmployeeService {

	
	@RequestMapping(value = "/getEmployeeDetails", method = RequestMethod.GET)
	@ResponseBody
	String uploadImage(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
			throws JSONException {

		JSONObject js = new JSONObject();
		js.put("Name", "Saravanan Seenivasan");
		js.put("Calling Name", "Saram");
		js.put("DOB", "28-Nov-1979");
		js.put("Hobbies", "Playing Basket Ball, Swimming, TT and Watching Movies");
		js.put("Places he like", "Kovilpatti");

		return js.toString();
}
}
