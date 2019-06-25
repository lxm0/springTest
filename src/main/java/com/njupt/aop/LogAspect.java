package com.njupt.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

//告诉spring切面类
@Aspect
public class LogAspect {

    @Pointcut("execution(public int com.njupt.aop.MathCalculator.*(..))")
    public void pointCut(){}

    @Before("pointCut()")//joinpoin需要在参数前面
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(""+joinPoint.getSignature().getName()+"除法运行"+ Arrays.asList(args));
    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println(""+joinPoint.getSignature().getName()+"除法结束");
    }

    @AfterReturning(value = "pointCut()" ,returning = "result")
    public void logReturn(JoinPoint joinPoint,Object result){
        System.out.println(""+joinPoint.getSignature().getName()+"除法返回,返回值："+result);
    }

    @AfterThrowing(value = "pointCut()",throwing = "e")
    public void logException(JoinPoint joinPoint,Exception e){
        System.out.println(""+joinPoint.getSignature().getName()+"除法异常,异常信息："+e);
    }

}
