package se.wusl.project.asc;

import java.util.List;

public interface SupplierEntityDAO
{
  long save(SupplierEntity supplierEntity);
  
  void update(SupplierEntity supplierEntity);
  
  boolean deleteById(int id);
  
  boolean deleteByIds(int[] ids);
  
  SupplierEntity getById(int id);
  
  SupplierEntity[] getByIds(int[] ids);
  
  List<SupplierEntity> getAll();
}
