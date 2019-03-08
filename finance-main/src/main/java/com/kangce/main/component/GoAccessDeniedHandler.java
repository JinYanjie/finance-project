package com.kangce.main.component;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {

        response.setHeader("Content-Type", "application/json;charset=utf-8");
        response.getWriter().print("{\"code\":403,\"message\":\""+"未授权："+accessDeniedException.getMessage()+"\"}");
        response.getWriter().flush();
    }

}
