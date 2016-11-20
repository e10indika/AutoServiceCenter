package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceFacadeImpl implements ServiceFacade
{
  @Autowired
  private ServiceService serviceService;
  
  /**
   * @return the serviceService
   */
  public ServiceService getServiceService()
  {
    return serviceService;
  }

  /**
   * @param serviceService the serviceService to set
   */
  public void setServiceService(ServiceService serviceService)
  {
    this.serviceService = serviceService;
  }

  public long saveServiceEntity(ServiceEntity serviceEntity)
  {
    // TODO Auto-generated method stub
    return serviceService.saveServiceEntity(serviceEntity);
  }

  public ServiceEntity getServiceEntityById(int id)
  {
    // TODO Auto-generated method stub
    return serviceService.getServiceEntityById(id);
  }

  public ServiceEntity[] getServiceEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return serviceService.getServiceEntitiesByIds(ids);
  }

  public boolean deleteServiceEntityById(int id)
  {
    // TODO Auto-generated method stub
    return serviceService.deleteServiceEntityById(id);
  }

  public boolean deleteServiceByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return serviceService.deleteServiceByIds(ids);
  }

  public void updateServiceEntity(ServiceEntity serviceEntity)
  {
    // TODO Auto-generated method stub
    serviceService.updateServiceEntity(serviceEntity);
  }

  public List<ServiceEntity> getAll()
  {
    // TODO Auto-generated method stub
    return serviceService.getAll();
  }

}
