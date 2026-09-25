package sk.upjs.ondovcik.juraj;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    UserService userService;
    @Test
    void calculateGenderRatio_ok(){
        userService = new UserService(Set.of(
                new User(null, "Alica", "Martonova", User.Gender.FEMALE, LocalDate.of(2000,10,30), User.Role.STUDENT),
                new User(null, "Marek", "Marton", User.Gender.MALE, LocalDate.of(2000,11,30), User.Role.STUDENT),
                new User(null, "Ivan", "Ulicky", User.Gender.MALE, LocalDate.of(2000,10,25), User.Role.STUDENT),
                new User(null, "Alica", "Kapakova", User.Gender.FEMALE, LocalDate.of(2004,10,30), User.Role.STUDENT)

        ));
        GenderRatio gr = userService.calculateGenderRatio();
        assertEquals((double) 1/2, gr.girls());
        assertEquals((double) 1/2, gr.boys());
        assertEquals((double) 0.0, gr.other());

    }

    void calculateGenderRation_empty(){
        userService = new UserService(Collections.emptySet());
        GenderRatio gr = userService.calculateGenderRatio();
        assertEquals((double) 0.0, gr.girls());
        assertEquals((double) 0.0, gr.boys());
        assertEquals((double) 0.0, gr.other());
    }

    void calculateGenderRation_Null(){
        userService = new UserService(null);
        GenderRatio gr = userService.calculateGenderRatio();
        assertEquals((double) 0.0, gr.girls());
        assertEquals((double) 0.0, gr.boys());
        assertEquals((double) 0.0, gr.other());
    }

}