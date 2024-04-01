package com.sercan.sammmapbackend.mapper;

import com.sercan.sammmapbackend.dto.CoordinateSaveReq;
import com.sercan.sammmapbackend.model.CoordinateEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CoordinateMapper {

  CoordinateSaveReq toCoordinateSaveReq(CoordinateEntity entity);
  CoordinateEntity toCoordinateEntity(CoordinateSaveReq saveReq);

  List<CoordinateSaveReq> toCoordinateSaveReqs(List<CoordinateEntity> entities);
  List<CoordinateEntity> toCoordinateEntities(List<CoordinateSaveReq> saveReqs);

}
