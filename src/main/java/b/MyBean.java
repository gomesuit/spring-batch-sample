package b;

import org.springframework.scheduling.annotation.Scheduled;

public class MyBean {
 
    @Scheduled(cron="*/5 * * * * ?")
    public void printMessage() {
        System.out.println("I am called by Spring scheduler");
    }
}