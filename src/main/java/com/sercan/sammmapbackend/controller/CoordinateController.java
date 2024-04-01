package com.sercan.sammmapbackend.controller;

import com.sercan.sammmapbackend.dto.CoordinateSaveReq;
import com.sercan.sammmapbackend.service.CoordinateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/app/v1/coordinates")
@CrossOrigin
@RequiredArgsConstructor
public class CoordinateController {

  private final CoordinateService coordinateService;

  @PostMapping("")
  public ResponseEntity<?> save(@RequestBody CoordinateSaveReq req) {
    return new ResponseEntity<>(coordinateService.save(req), HttpStatus.OK);
  }

  @GetMapping("")
  public ResponseEntity<?> getAll() {
    return new ResponseEntity<>(coordinateService.getAll(), HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
    coordinateService.deleteById(id);
    return new ResponseEntity<>(null, HttpStatus.OK);
  }
}
