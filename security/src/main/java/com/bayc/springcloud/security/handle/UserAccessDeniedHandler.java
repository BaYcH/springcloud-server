package com.bayc.springcloud.security.handle;

import com.bayc.springcloud.core.model.response.Result;
import com.bayc.springcloud.core.model.util.ResponseUtil;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author bayc
 * @packageName com.bayc.springsecurity.handler
 * @className UserAccessDeniedHandler
 * @description
 * @date 2021/3/5 下午3:22
 */
@Component
public class UserAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        ResponseUtil.out(response, Result.forbidden(accessDeniedException.getMessage()));
    }
}
