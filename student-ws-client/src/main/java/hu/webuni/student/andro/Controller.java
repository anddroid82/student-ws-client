package hu.webuni.student.andro;

import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hu.webuni.student.andro.wsclient.FromToLocalDate;
import hu.webuni.student.andro.wsclient.ScheduleEntryWithDateDto;
import hu.webuni.student.andro.wsclient.ScheduleEntryWsServiceImplService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class Controller {

	private ScheduleEntryWsServiceImplService scheduleEntryWsServiceImplService;
	
	/*
	@RequestMapping("/api/schedule/{id}")
	public ResponseEntity<List<ScheduleEntryWithDateDto>> getStudentSchedule(@PathVariable int id, LocalDate from, LocalDate to) {
		List<ScheduleEntryWithDateDto> schedules=scheduleEntryWsServiceImplService
				.getScheduleEntryWsServiceImplPort()
				.getAllScheduleEntryOfStudentById(id, from, to);
		return ResponseEntity.ok(schedules);		
	}
	*/
	
	
	@RequestMapping("/api/schedule/{id}")
	public ResponseEntity<List<ScheduleEntryWithDateDto>> getStudentSchedule(@PathVariable int id, @RequestBody FromToLocalDate ft) {
		List<ScheduleEntryWithDateDto> schedules=scheduleEntryWsServiceImplService
				.getScheduleEntryWsServiceImplPort()
				.getAllScheduleEntryOfStudentById(id, ft);
		return ResponseEntity.ok(schedules);
	}
	
	@RequestMapping("/api/test")
	public ResponseEntity<String> getTest() {
		String test=scheduleEntryWsServiceImplService.getScheduleEntryWsServiceImplPort().getTest();
		return ResponseEntity.ok(test);
	}
}
