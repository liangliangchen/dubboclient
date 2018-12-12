package org.spring.springboot.dubbo;

import org.spring.springboot.domain.Person;
import org.spring.springboot.domain.Result;

/**
 * Created by cll on 2018/8/22.
 */
public interface PersonDubboService {

	Result getPersonByName(String name);
}
