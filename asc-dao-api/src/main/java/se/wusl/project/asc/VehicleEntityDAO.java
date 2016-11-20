package se.wusl.project.asc;

import java.util.List;

public interface VehicleEntityDAO
{
  long save(VehicleEntity vehicleEntity);
  
  void update(VehicleEntity vehicleEntity);
  
  boolean deleteById(int id);
  
  boolean deleteByIds(int[] ids);
  
  VehicleEntity getById(int id);
  
  VehicleEntity[] getByIds(int[] ids);
  
  List<VehicleEntity> getAll();
}
