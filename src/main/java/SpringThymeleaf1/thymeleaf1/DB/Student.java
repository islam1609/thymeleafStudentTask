package SpringThymeleaf1.thymeleaf1.DB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    Long id;
    String name;
    String surname;
    int exam;
    String mark;
}
