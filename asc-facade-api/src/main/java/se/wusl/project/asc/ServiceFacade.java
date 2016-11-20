package se.wusl.project.asc;

import java.util.List;

public interface ServiceFacade
{
  long saveServiceEntity(ServiceEntity serviceEntity);

  ServiceEntity getServiceEntityById(int id);

  ServiceEntity[] getServiceEntitiesByIds(int[] ids);

  boolean deleteServiceEntityById(int id);

  boolean deleteServiceByIds(int[] ids);

  void updateServiceEntity(ServiceEntity serviceEntity);

  List<ServiceEntity> getAll();
}
