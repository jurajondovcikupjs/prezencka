package sk.upjs.ondovcik.juraj;

import java.util.Set;

public class UserService {
    Set<User> users;

    public UserService(Set<User> users) {
        this.users = users;
    }

    GenderRatio calculateGenderRatio() {
        int noOfUsers = users.size();
        if (users == null || users.isEmpty()){
            return new GenderRatio(0.0,0.0,0.0);
        }
        double boys = 0, girls = 0, others = 0;
        for (User user : users) {
            switch (user.gender()) {
                case MALE -> boys++;
                case FEMALE -> girls++;
                case OTHER -> others++;
                default ->  others++;
            }
        }
        return new GenderRatio(
                boys / noOfUsers,
                girls / noOfUsers,
                others / noOfUsers
        );
    }
}
