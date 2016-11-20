package se.wusl.project.asc;

import java.util.List;

public interface SupplierService
{
  long saveSupplierEntity(SupplierEntity supplierEntity);

  SupplierEntity getSupplierEntityById(int id);

  SupplierEntity[] getSupplierEntitiesByIds(int[] ids);

  boolean deleteSupplierEntityById(int id);

  boolean deleteSupplierByIds(int[] ids);

  void updateSupplierEntity(SupplierEntity supplierEntity);

  List<SupplierEntity> getAll();
}
