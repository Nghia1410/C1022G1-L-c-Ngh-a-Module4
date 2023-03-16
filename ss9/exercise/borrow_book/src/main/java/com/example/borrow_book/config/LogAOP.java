package com.example.borrow_book.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
public class LogAOP {
    @Pointcut("execution(* com.example.borrow_book.controller.BookController.*Book(..))")
    public void borrowOrPayBookMethod() {
    }

    private int count1;

    @Before("borrowOrPayBookMethod()")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("Phương thức đang sử dụng: " + joinPoint.getSignature().getName() +
                " Time is: " + LocalDateTime.now() + " Số lần thực hiện " + count1++);
    }

    @Pointcut("execution(* com.example.borrow_book.controller.BookController.showList())")
    public void loggingShowAllList() {
    }

    int count = 0;

    @AfterReturning(pointcut = "loggingShowAllList()")
    public void handleAfterReturningLoggingShowAllList() {
        System.out.println("Tong so nguoi ghe tham thu vien:" + ++count);
    }
}
