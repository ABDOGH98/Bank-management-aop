import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestAspect {
    @Pointcut("execution(* abdo.App.test(..))")
    public void run(){

    }
    /*
        @Before("run()")
        public void testBefore(){
            System.out.println("test");
        }
        @After("run()")
        public void testAfter(){
            System.out.println("after");
    }*/

}
