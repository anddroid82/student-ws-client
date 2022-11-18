package hu.webuni.student.andro;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
public class LocalDateWrapper {

	@XmlJavaTypeAdapter(value = LocalDateAdapter.class,type = LocalDate.class)
	LocalDate date;
	
}
