package com.ecommerce.project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int roleId;

    @ToString.Exclude
    @Enumerated(EnumType.STRING) //AppRole is string, by default is int
    @Column(length = 20, name = "role_name")
    private AppRole roleName; //AppRole is enumeration

    public Role(AppRole roleName) {
        this.roleName = roleName;
    }
}
