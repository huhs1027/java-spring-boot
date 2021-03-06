package com.learn.controller;

import com.learn.entity.ProxyRequest;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author huhongsen
 * @date 2018/12/13
 */
@Controller
@RequestMapping("/proxy")
public class ProxyController {

    private Logger logger = LoggerFactory.getLogger(ProxyController.class);

    @RequestMapping("/stream")
    public void proxyStream(ProxyRequest proxyRequest, HttpServletResponse httpServletResponse) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        logger.info("requestUrl={}", proxyRequest.getRequestUrl());
        HttpGet httpGet = new HttpGet(proxyRequest.getRequestUrl());
        HttpResponse httpResponse = httpClient.execute(httpGet);

        //把代理相应流转成图片流
//        BufferedImage read = ImageIO.read(httpResponse.getEntity().getContent());
//        ImageIO.write(read, "jpg", httpServletResponse.getOutputStream());
        //不处理直接返回代理相应流.
        byte[] bytes = IOUtils.toByteArray(httpResponse.getEntity().getContent());
        httpServletResponse.getOutputStream().write(bytes);
    }
}
