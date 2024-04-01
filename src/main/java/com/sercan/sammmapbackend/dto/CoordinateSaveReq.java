package com.sercan.sammmapbackend.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.Instant;
import java.time.LocalDateTime;

@Data
public class CoordinateSaveReq {
  private Double lat;
  private Double lng;

  //@JsonFormat(pattern="dd-MM-yyyy hh:mm:ss")
  //@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss")
  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
  private LocalDateTime datetime;
}
