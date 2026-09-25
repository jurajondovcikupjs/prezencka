package sk.upjs.ondovcik.juraj;

import java.util.Set;

public record Subject(
        Long id,
        String name,
        int year,
        Set<User> students

) {
}
