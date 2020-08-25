package com.jk.service;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "backstage-provider")
public interface UserServiceFeign extends UserService{

}
