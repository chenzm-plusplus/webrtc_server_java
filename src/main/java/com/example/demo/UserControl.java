package com.example.demo;


import com.example.demo.bean.RoomInfo;
import com.example.demo.bean.UserBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class UserControl {

    @RequestMapping("/")
    public String index() {
        return "welcome to my webRTC demo";
    }

    @RequestMapping("/roomList")
    public List<String> roomList() {
        ConcurrentHashMap<String, RoomInfo> rooms = MemCons.rooms;
        return new ArrayList<>(rooms.keySet());
    }

    @RequestMapping("/userList")
    public List<UserBean> userList() {
        ConcurrentHashMap<String, UserBean> userBeans = MemCons.userBeans;
        Collection<UserBean> values = userBeans.values();
        return new ArrayList<>(values);
    }

}
