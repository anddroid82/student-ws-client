package hu.webuni.student.andro;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.webuni.student.andro.wsclient.LocalDate;
import hu.webuni.student.andro.wsclient.ScheduleEntryWithDateDto;
import hu.webuni.student.andro.wsclient.ScheduleEntryWsServiceImplService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class Controller {

	private ScheduleEntryWsServiceImplService scheduleEntryWsServiceImplService;
	
	@RequestMapping("/api/schedule/{id}")
	public ResponseEntity<List<ScheduleEntryWithDateDto>> getStudentSchedule(@PathVariable int id, LocalDate from, LocalDate to) {
		List<ScheduleEntryWithDateDto> schedules=scheduleEntryWsServiceImplService
				.getScheduleEntryWsServiceImplPort()
				.getAllScheduleEntryOfStudentById(id, from, to);
		return ResponseEntity.ok(schedules);		
	}
	
}
