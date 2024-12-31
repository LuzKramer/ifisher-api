package com.ifisher.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "images")
@Entity(name = "images")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mk_images {
    @Id @GeneratedValue( strategy = GenerationType.UUID)
    private UUID id;
    private String path;
    private Long mk_id;
}
