package spring_to_remember.lesson_08.aop_around.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Around("execution(String returnBook())")
    public Object aroundReturningGetStudentsLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("aroundReturningGetStudentsLoggingAdvice: возвращаем книгу в библиотеку ");
        Object targetMethodResult =  null;
        try {
            targetMethodResult = proceedingJoinPoint.getTarget();
        } catch (ArithmeticException e) {
            System.out.println("aroundReturningGetStudentsLoggingAdvice: было поймано исключение "  + e);
            targetMethodResult = "Неизвестное название книги";
            //throw new RuntimeException(e);
        }

        System.out.println("aroundReturningGetStudentsLoggingAdvice: книгу вернули в библиотеку ");
        return targetMethodResult;
    }

}
