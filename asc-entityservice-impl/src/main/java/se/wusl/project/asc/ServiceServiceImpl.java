package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceServiceImpl implements ServiceService
{
  @Autowired
  private ServiceEntityDAO serviceEntityDAO;

  private static final ServiceService instance = new ServiceServiceImpl();

  private ServiceServiceImpl()
  {
  }

  /**
   * @return the serviceEntityDAO
   */
  public ServiceEntityDAO getServiceEntityDAO()
  {
    return serviceEntityDAO;
  }

  /**
   * @param serviceEntityDAO the serviceEntityDAO to set
   */
  public void setServiceEntityDAO(ServiceEntityDAO serviceEntityDAO)
  {
    this.serviceEntityDAO = serviceEntityDAO;
  }

  /**
   * @return the instance
   */
  public ServiceService getInstance()
  {
    return instance;
  }

  public long saveServiceEntity(ServiceEntity serviceEntity)
  {
    // TODO Auto-generated method stub
    return serviceEntityDAO.save(serviceEntity);
  }

  public ServiceEntity getServiceEntityById(int id)
  {
    // TODO Auto-generated method stub
    return serviceEntityDAO.getById(id);
  }

  public ServiceEntity[] getServiceEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return serviceEntityDAO.getByIds(ids);
  }

  public boolean deleteServiceEntityById(int id)
  {
    // TODO Auto-generated method stub
    return serviceEntityDAO.deleteById(id);
  }

  public boolean deleteServiceByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return serviceEntityDAO.deleteByIds(ids);
  }

  public void updateServiceEntity(ServiceEntity serviceEntity)
  {
    // TODO Auto-generated method stub
    serviceEntityDAO.update(serviceEntity);
  }

  public List<ServiceEntity> getAll()
  {
    // TODO Auto-generated method stub
    return serviceEntityDAO.getAll();
  }

}
