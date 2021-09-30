package dimov.pathfinder.model.entity;

import dimov.pathfinder.model.enums.RoleNameEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity{

    private RoleNameEnum name;


    public Role() {
    }
    @Enumerated(EnumType.STRING)
    public RoleNameEnum getName() {
        return name;
    }

    public void setName(RoleNameEnum name) {
        this.name = name;
    }
}
