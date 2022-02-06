package org.hellotech.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class LoggingAspectConfig {

    // pointCut expression accessModifier returnType packageName.className.methodName(..)
    @Before("execution(public * org.hellotech.controller.*.*(..))")
    public void logBeforeExecutingControllerPublicMethods(JoinPoint joinPoint) {
        log.info("Triggered : {}", joinPoint.getSignature().getName());
    }

    @After("execution(public * org.hellotech.controller.*.*(..))")
    public void logAfterExecutingControllerPublicMethods(JoinPoint joinPoint) {
        log.info("Executed : {}", joinPoint.getSignature().getName());
    }

    // TODO: @Around, @AfterReturning @AfterThrowing
    /**
     * For implementing @AfterReturning @AfterThrowing
     * we have to inject service beans in this class
     */
}
