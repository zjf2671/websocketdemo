package com.websocket.demowebsocket.controller;

import com.websocket.demowebsocket.config.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Harry
 */
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/im/{userId}")
    public String IM(ModelMap modelMap,@PathVariable String userId){
        modelMap.put("userId",userId);
        return "IM";
    }

    @RequestMapping(value="/pushListToWeb")
    @ResponseBody
    public Map<String,Object> pushVideoListToWeb(String cid,String message) {
        Map<String,Object> result =new HashMap<>();

        try {
            WebSocketServer.sendInfo(message,cid);
            result.put("operationResult", true);
        }catch (IOException e) {
            result.put("operationResult", true);
        }
        return result;
    }
}