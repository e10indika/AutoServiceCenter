package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class VehicleFacadeImpl implements VehicleFacade
{
  @Autowired
  private VehicleService vehicleService;
  
  /**
   * @return the vehicleService
   */
  public VehicleService getVehicleService()
  {
    return vehicleService;
  }

  /**
   * @param vehicleService the vehicleService to set
   */
  public void setVehicleService(VehicleService vehicleService)
  {
    this.vehicleService = vehicleService;
  }

  public long saveVehicleEntity(VehicleEntity vehicleEntity)
  {
    // TODO Auto-generated method stub
    return 0;
  }

  public VehicleEntity getVehicleEntityById(int id)
  {
    // TODO Auto-generated method stub
    return null;
  }

  public VehicleEntity[] getVehicleEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return null;
  }

  public boolean deleteVehicleEntityById(int id)
  {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean deleteVehicleByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return false;
  }

  public void updateVehicleEntity(VehicleEntity vehicleEntity)
  {
    // TODO Auto-generated method stub

  }

  public List<VehicleEntity> getAll()
  {
    // TODO Auto-generated method stub
    return null;
  }

}
