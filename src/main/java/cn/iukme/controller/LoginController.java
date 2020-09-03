package cn.iukme.controller;

import cn.iukme.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author feng
 */
@RequestMapping("/user")
@Controller
public class LoginController {
    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> login(@RequestBody Map<String,Object> param){
        Map<String,Object> map = new HashMap<>();
        String username = (String) param.get("username");
        String password = (String) param.get("password");
        System.out.println(param.get("username"));
        System.out.println(param.get("password"));
        if("admin".equals(username)&&"123456".equals(password)){
            map.put("code",200);
            map.put("token",username);
        }else{
            map.put("code",201);
            map.put("message","用户名或密码错误！");
        };
        return map;
    }


    @RequestMapping("/info")
    @ResponseBody
    public Map<String,Object> login(String token){
        Map<String,Object> map = new HashMap<>();
        User user = new User();
        user.setUsername("123");
        List<User> list = new ArrayList<>();
        list.add(user);
        map.put("code",200);
        map.put("token","123");
        return map;
    }
    @RequestMapping("/logout")
    @ResponseBody
    public List<User> logout(){
        User user = new User();
        user.setUsername("123");
        List<User> list = new ArrayList<>();
        list.add(user);
        return list;
    }

}
