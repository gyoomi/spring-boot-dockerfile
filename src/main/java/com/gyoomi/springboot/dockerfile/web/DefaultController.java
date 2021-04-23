/**
 * Copyright © 2020-2021, Glodon Digital Supplier & Purchaser BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.springboot.dockerfile.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Default Controller
 *
 * @author Leon
 * @date 2021-04-22 15:30
 */
@RestController
public class DefaultController
{

	/**
	 * Home
	 */
	@GetMapping("/")
	public Object home()
	{
		System.out.println("Gyoomi Spring Cloud Dockerfile");

		HashMap<String, Object> resp = new HashMap<>();
		resp.put("status", 200);
		resp.put("message", "Gyoomi Spring Cloud Dockerfile");
		resp.put("data", null);
		return resp;
	}
}
