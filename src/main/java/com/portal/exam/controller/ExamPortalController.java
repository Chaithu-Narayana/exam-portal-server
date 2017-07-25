/**
 * 
 */
package com.portal.exam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class ExamPortalController {
	
	@RequestMapping("/api/hello")
	public String hello()
	{
		return "Welcome to my first Angular App!!";
	}

}
