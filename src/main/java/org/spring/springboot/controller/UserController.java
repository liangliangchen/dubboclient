package org.spring.springboot.controller;

import com.sun.tools.javac.main.Main;
import org.spring.springboot.domain.Param;
import org.spring.springboot.domain.Result;
import org.spring.springboot.dubbo.PersonConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

/**
 * Created by cll on 2018/8/24.
 */
@Controller
public class UserController {
	@Autowired
	private PersonConsumeService personConsumeService;

	@ResponseBody
	@RequestMapping("")
	public Result getUserName() {
		personConsumeService.printPerson();
		int i = new Random().nextInt(10000);
		Result result = new Result();
		result.setName("operator" + i);
		result.setTime(new Date());
		result.setMessage("操作成功");
		return result;
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "/product/ajaxPay")
	public Result saveMoney(String payPassword, BigDecimal investMoney, String verifyCode, String productId) throws InterruptedException {
		Thread.sleep(100);
		personConsumeService.printPerson();
		int i = new Random().nextInt(10000);
		Result result = new Result();
		result.setName("operator" + i);
		result.setTime(new Date());
		result.setMessage("操作成功");
		return result;
	}
}
