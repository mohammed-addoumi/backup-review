package com.backreview.backreview.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="users_seq_generator")
    @SequenceGenerator(name = "users_seq_generator",sequenceName = "users_seq",allocationSize = 1)
    private Long id;
    private String name;

}
