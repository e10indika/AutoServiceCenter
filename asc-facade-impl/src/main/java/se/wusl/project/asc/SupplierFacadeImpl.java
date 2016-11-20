package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class SupplierFacadeImpl implements SupplierFacade
{
  @Autowired
  private SupplierService supplierService;
  
  /**
   * @return the supplierService
   */
  public SupplierService getSupplierService()
  {
    return supplierService;
  }

  /**
   * @param supplierService the supplierService to set
   */
  public void setSupplierService(SupplierService supplierService)
  {
    this.supplierService = supplierService;
  }

  public long saveSupplierEntity(SupplierEntity supplierEntity)
  {
    // TODO Auto-generated method stub
    return supplierService.saveSupplierEntity(supplierEntity);
  }

  public SupplierEntity getSupplierEntityById(int id)
  {
    // TODO Auto-generated method stub
    return supplierService.getSupplierEntityById(id);
  }

  public SupplierEntity[] getSupplierEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return supplierService.getSupplierEntitiesByIds(ids);
  }

  public boolean deleteSupplierEntityById(int id)
  {
    // TODO Auto-generated method stub
    return supplierService.deleteSupplierEntityById(id);
  }

  public boolean deleteSupplierByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return supplierService.deleteSupplierByIds(ids);
  }

  public void updateSupplierEntity(SupplierEntity supplierEntity)
  {
    // TODO Auto-generated method stub
    supplierService.updateSupplierEntity(supplierEntity);
    
  }

  public List<SupplierEntity> getAll()
  {
    // TODO Auto-generated method stub
    return supplierService.getAll();
  }

}
