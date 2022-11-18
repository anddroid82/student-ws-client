
@XmlJavaTypeAdapters({
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class, type = LocalDate.class)
})

package hu.webuni.student.andro;

import java.time.LocalDate;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;


