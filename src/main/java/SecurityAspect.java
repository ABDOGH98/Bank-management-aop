import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Scanner;

@Aspect
public class SecurityAspect {
    private String username="root";
    private String password="123";
    @Around("call(* test.Application.start(..))")
    public void secureApp(ProceedingJoinPoint proceedingJoinPoint) throws
            Throwable {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Authentication");
        System.out.print("Username :");String username=scanner.next();
        System.out.print("Password :");String pass=scanner.next();
        if(username.equals("root")&&pass.equals("123")){
            System.out.println("Before starting");
            proceedingJoinPoint.proceed();
            System.out.println("End of Application");
        }
        else{
            System.out.println("Access denied ...");
        }
    }
}