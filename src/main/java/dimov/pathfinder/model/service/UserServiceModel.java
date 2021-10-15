package dimov.pathfinder.model.service;

import dimov.pathfinder.model.entity.Role;
import dimov.pathfinder.model.enums.LevelUserEnum;

import java.util.Set;

public class UserServiceModel {

    private Long id;

    private String username;

    private String password;

    private String fullName;

    private Integer age;

    private Set<Role> roles;

    private LevelUserEnum level;

    private String email;

    public UserServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public LevelUserEnum getLevel() {
        return level;
    }

    public void setLevel(LevelUserEnum level) {
        this.level = level;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
