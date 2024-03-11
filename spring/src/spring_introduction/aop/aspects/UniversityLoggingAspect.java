package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice(): логируем получение списка студентов"+
                "перед методом getStudents");
    }

    @Before("execution(* getStudents())")
    public void afterReturningStudentsLoggingAdvice(){
        System.out.println("afterReturningStudentsLoggingAdvice(): логируем получение списка студентов"+
                "после работы метода getStudents");

    }

}
