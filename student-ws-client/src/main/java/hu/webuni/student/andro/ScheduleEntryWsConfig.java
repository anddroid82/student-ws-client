package hu.webuni.student.andro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hu.webuni.student.andro.wsclient.ScheduleEntryWsServiceImplService;

@Configuration
public class ScheduleEntryWsConfig {

	@Bean
	public ScheduleEntryWsServiceImplService getScheduleEntryWsServiceImplService() {
		return new ScheduleEntryWsServiceImplService();
	}
	
}
