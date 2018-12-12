package org.spring.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.spring.springboot.domain.Person;
import org.spring.springboot.domain.Result;
import org.springframework.stereotype.Service;

/**
 * Created by cll on 2018/8/22.
 */
@Service
public class PersonConsumeService {

	@Reference(version = "1.0.0")
	private PersonDubboService personDubboService;

	public Result printPerson() {
		String name = "chenliangliang";
		Result result = personDubboService.getPersonByName(name);
		System.out.println(result);
		return result;
	}

}
