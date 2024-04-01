package com.sercan.sammmapbackend.service;

import com.sercan.sammmapbackend.dto.CoordinateSaveReq;
import com.sercan.sammmapbackend.mapper.CoordinateMapper;
import com.sercan.sammmapbackend.model.CoordinateEntity;
import com.sercan.sammmapbackend.repository.CoordinateRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
public class CoordinateService {

  @Autowired
  private CoordinateRepository coordinateRepository;

  @Autowired
  private CoordinateMapper coordinateMapper;

  public CoordinateEntity save(CoordinateSaveReq req) {
    return coordinateRepository.save(coordinateMapper.toCoordinateEntity(req));
  }

  public List<CoordinateEntity> getAll () {
    return coordinateRepository.findAll();
  }

  public void deleteById (Integer id) {
    coordinateRepository.deleteById(id);
  }
}
