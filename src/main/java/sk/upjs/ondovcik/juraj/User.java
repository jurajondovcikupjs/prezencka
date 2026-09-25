package sk.upjs.ondovcik.juraj;

import java.time.LocalDate;

public record User(
        Long id,
        String name,
        String surname,
        Gender gender,
        LocalDate birthDate,
        Role role
) {

    public enum Role {
        STUDENT,
        TEACHER,
        ADMIN
    }

    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

}
