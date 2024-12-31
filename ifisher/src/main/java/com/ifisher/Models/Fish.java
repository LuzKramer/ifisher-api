package com.ifisher.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "fishes")
@Entity(name = "fishes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fish {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sci_name;
    private String pop_name;
    private String img;
}
