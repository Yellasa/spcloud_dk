package com.video.cq.msconsumer.feign;

import com.video.cq.msconsumer.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "ms-provider-user")
public interface UserFeignClient
{
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public User findById(@PathVariable("id") Long id);

  @RequestMapping(value = "/post",method = RequestMethod.POST)
  User post(@RequestBody User user);
}
