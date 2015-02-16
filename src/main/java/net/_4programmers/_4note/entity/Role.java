package net._4programmers._4note.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_roles")
public class Role {
    @Id
    @Column
    @GeneratedValue
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private String role;

    public Role() {}

    public Role(User user, String role) {
        this.user = user;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
