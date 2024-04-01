package com.sercan.sammmapbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "COORDINATE")
public class CoordinateEntity {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "ID", nullable = false)
  private Integer id;

  @Column(name = "LAT")
  private Double lat;

  @Column(name = "LNG")
  private Double lng;

  @Column(name = "DATETIME")
  private LocalDateTime datetime;
}