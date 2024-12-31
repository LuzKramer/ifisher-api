package com.ifisher.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity( name = "marks")
@Table( name = "marks")
public class Mark {
    @Id @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String latitude;
    private String longitude;
    private Integer weight;
    private String type;
    private Timestamp datetime;
    private String user_id;
    private Long fish_id;

}
