package sk.upjs.ondovcik.juraj;

import java.time.LocalDate;
import java.util.Set;

public record Attendance(
        LocalDate date,
        Subject subject,
        Set<User> presentStudents
) {
}
