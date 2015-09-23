package b;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.CronTask;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

@Configuration
@EnableScheduling
public class AppConfig implements SchedulingConfigurer {
// 
//    @Bean
//    public MyBean bean() {
//        return new MyBean();
//    }

	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		// TODO Auto-generated method stub
		//CronTrigger CronTrigger = new CronTrigger("*/5 * * * * ?");
		SubThread SubThread = new SubThread();
		CronTask CronTask = new CronTask(SubThread, "*/5 * * * * ?");
		taskRegistrar.addCronTask(CronTask);
		
	}
	class SubThread implements Runnable{
		  public void run(){
			  System.out.println("I am called by Spring scheduler");
		  }
		}
}