package com.taoyuanmin.project.common.exception.handle;


import com.taoyuanmin.project.common.domain.Result;
import com.taoyuanmin.project.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 *
 * @author taojianmin
 */
@ControllerAdvice
public class GlobalExceptionHandle {

    private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandle.class);

    /**
     * 错误页面
     */
    private static final String DEFAULT_ERROR_VIEW = "error";

    /**
     * 统一 json 异常处理
     *
     * @return 统一返回 json 格式
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result resolveException(Exception exception) {
        logger.error("【GlobalExceptionResolver】:{}", exception.getMessage(), exception);
        return ResultUtil.fail(exception.getLocalizedMessage());
    }


//    /**
//     * 统一 页面 异常处理
//     *
//     * @param exception PageException
//     * @return 统一跳转到异常页面
//     */
//    @ExceptionHandler(value = PageException.class)
//    public ModelAndView pageErrorHandler(PageException exception) {
//        logger.error("【DemoPageException】:{}", exception.getMessage());
//        ModelAndView view = new ModelAndView();
//        view.addObject("message", exception.getMessage());
//        view.setViewName(DEFAULT_ERROR_VIEW);
//        return view;
//    }

}