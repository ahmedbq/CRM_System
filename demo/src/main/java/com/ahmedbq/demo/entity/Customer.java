package com.ahmedbq.demo.entity;

import com.ahmedbq.demo.util.Membership;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter @NoArgsConstructor
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length =  50, nullable = false)
    private String name;

    private Boolean disabled;

    @Column(unique = true, nullable = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private Membership membership;
}
