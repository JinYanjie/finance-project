package com.kangce.main.component;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {


        response.setHeader("Content-Type", "application/json;charset=utf-8");
        response.getWriter().print("{\"code\":401,\"msg\":\""+"未认证："+authException.getMessage()+"\"}");
        response.getWriter().flush();
    }
}
