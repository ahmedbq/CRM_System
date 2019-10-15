package com.ahmedbq.demo.entity;

import com.ahmedbq.demo.util.Membership;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length =  50, nullable = false)
    private String name;

    @JsonIgnore
    private Boolean disabled;

    @Column(unique = true, nullable = true)
    private String email;

    @JsonIgnore
    @Enumerated(EnumType.STRING)
    private Membership membership;

    @JsonIgnore
    @Column(name = "social_security_number", nullable = true)
    private String socialSecurityNumber;

}
