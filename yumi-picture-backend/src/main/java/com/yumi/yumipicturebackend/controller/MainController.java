package com.yumi.yumipicturebackend.controller;

import com.yumi.yumipicturebackend.common.BaseResponse;
import com.yumi.yumipicturebackend.common.ResultUtils;
import com.yumi.yumipicturebackend.exception.BusinessException;
import com.yumi.yumipicturebackend.exception.ErrorCode;
import com.yumi.yumipicturebackend.exception.ThrowUtils;
import com.yumi.yumipicturebackend.model.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class MainController {

    /**
     * 健康检查
     */
    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }

    // todo delete
    /**
     * throwIfTest
     */
    @GetMapping("/throwIfTest")
    public BaseResponse<String> throwIfTest() {
        User user = null;

        try {
            ThrowUtils.throwIf(user == null, new BusinessException(ErrorCode.SYSTEM_ERROR,"异常报错"));
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
        System.out.println("执行！！！");
        System.out.println("执行！！！");
        System.out.println("执行！！！");
        System.out.println("执行！！！");
        System.out.println("执行！！！");
        return ResultUtils.success("ok");
    }

}
