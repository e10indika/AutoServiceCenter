package se.wusl.project.asc;

import java.util.List;

public interface ServiceEntityDAO
{
  long save(ServiceEntity serviceEntity);
  
  void update(ServiceEntity serviceEntity);
  
  boolean deleteById(int id);
  
  boolean deleteByIds(int[] ids);
  
  ServiceEntity getById(int id);
  
  ServiceEntity[] getByIds(int[] ids);
  
  List<ServiceEntity> getAll();
}
