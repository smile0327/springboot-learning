package com.kevin.study.springboot.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: kevin
 * @Description: 拦截器定义，实现HandlerInterceptor接口
 * @Company: 上海博般数据技术有限公司
 * @Version: 1.0.0
 * @Date: Created in 10:23 2022/2/27
 * @ProjectName: springboot-learning
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 目标方法调用前执行
     *
     * @param request
     * @param response
     * @param handler
     * @return true:继续执行  false：中断执行
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser == null) {
            //未登录，返回登陆页
            request.setAttribute("msg", "您没有权限进行此操作，请先登陆！");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        } else {
            //放行
            return true;
        }
    }

        /**
         * 目标方法调用后，解析视图之前执行
         * @param request
         * @param response
         * @param handler
         * @param modelAndView
         * @throws Exception
         */
        @Override
        public void postHandle (HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView
        modelAndView) throws Exception {
            log.info("postHandle执行{}", modelAndView);
        }

        /**
         * 视图渲染结束后执行
         * @param request
         * @param response
         * @param handler
         * @param ex
         * @throws Exception
         */
        @Override
        public void afterCompletion (HttpServletRequest request, HttpServletResponse response, Object handler, Exception
        ex) throws Exception {
            log.info("afterCompletion执行异常{}", ex);
        }

    }
