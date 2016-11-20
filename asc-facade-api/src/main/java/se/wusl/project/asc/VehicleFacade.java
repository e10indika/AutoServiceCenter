package se.wusl.project.asc;

import java.util.List;

public interface VehicleFacade
{
  long saveVehicleEntity(VehicleEntity vehicleEntity);

  VehicleEntity getVehicleEntityById(int id);

  VehicleEntity[] getVehicleEntitiesByIds(int[] ids);

  boolean deleteVehicleEntityById(int id);

  boolean deleteVehicleByIds(int[] ids);

  void updateVehicleEntity(VehicleEntity vehicleEntity);

  List<VehicleEntity> getAll();
}
