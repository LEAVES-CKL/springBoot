package com.lxit.springboot.springBootFour;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("clientserver")
public interface ClientService {
	@RequestMapping("/demo/getBootThree")
	String add();
}
