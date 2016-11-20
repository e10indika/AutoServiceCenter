package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class VehicleServiceImpl implements VehicleService
{
  @Autowired
  private VehicleEntityDAO vehicleEntityDAO;

  private static final VehicleService instance = new VehicleServiceImpl();

  private VehicleServiceImpl()
  {

  }

  /**
   * @return the vehicleEntityDAO
   */
  public VehicleEntityDAO getVehicleEntityDAO()
  {
    return vehicleEntityDAO;
  }

  /**
   * @param vehicleEntityDAO the vehicleEntityDAO to set
   */
  public void setVehicleEntityDAO(VehicleEntityDAO vehicleEntityDAO)
  {
    this.vehicleEntityDAO = vehicleEntityDAO;
  }

  /**
   * @return the instance
   */
  public VehicleService getInstance()
  {
    return instance;
  }

  public long saveVehicleEntity(VehicleEntity vehicleEntity)
  {
    // TODO Auto-generated method stub
    return vehicleEntityDAO.save(vehicleEntity);
  }

  public VehicleEntity getVehicleEntityById(int id)
  {
    // TODO Auto-generated method stub
    return vehicleEntityDAO.getById(id);
  }

  public VehicleEntity[] getVehicleEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return  vehicleEntityDAO.getByIds(ids);
  }

  public boolean deleteVehicleEntityById(int id)
  {
    // TODO Auto-generated method stub
    return vehicleEntityDAO.deleteById(id);
  }

  public boolean deleteVehicleByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return vehicleEntityDAO.deleteByIds(ids);
  }

  public void updateVehicleEntity(VehicleEntity vehicleEntity)
  {
    // TODO Auto-generated method stub
    vehicleEntityDAO.update(vehicleEntity);
  }

  public List<VehicleEntity> getAll()
  {
    // TODO Auto-generated method stub
    return vehicleEntityDAO.getAll();
  }

}
