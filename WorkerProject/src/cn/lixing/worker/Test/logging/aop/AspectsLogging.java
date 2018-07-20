package cn.lixing.worker.Test.logging.aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;


@Aspect
@Component
public class AspectsLogging {
	private final Logger logger=Logger.getLogger(AspectsLogging.class);
	@Around("execution(public * cn.lixing.worker.Test.page.*.*(..))")
	public Object aroundMethod(ProceedingJoinPoint joinPoint) {
		String methodName=joinPoint.getSignature().getName();
		Object result=null;
		//前置通知
		logger.info("The method "+methodName+" begins with "+Arrays.asList(joinPoint.getArgs()));
		//执行方法
		try {
			result=joinPoint.proceed();
			//返回通知
			logger.info("The method "+ methodName+" begins result "+result);
		} catch (Throwable e) {
			//异常通知
			logger.info("the method "+ methodName+"exception "+e);
			throw new RuntimeException(e);
		}
		logger.info("the method "+ methodName+" ends");
		return result;
	}
}