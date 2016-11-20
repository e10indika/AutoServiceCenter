package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class SupplierServiceImpl implements SupplierService
{
  @Autowired
  private SupplierEntityDAO supplierEntityDAO;

  private static final SupplierService instance = new SupplierServiceImpl();

  private SupplierServiceImpl()
  {

  }

  /**
   * @return the supplierEntityDAO
   */
  public SupplierEntityDAO getSupplierEntityDAO()
  {
    return supplierEntityDAO;
  }

  /**
   * @param supplierEntityDAO the supplierEntityDAO to set
   */
  public void setSupplierEntityDAO(SupplierEntityDAO supplierEntityDAO)
  {
    this.supplierEntityDAO = supplierEntityDAO;
  }

  /**
   * @return the instance
   */
  public SupplierService getInstance()
  {
    return instance;
  }

  public long saveSupplierEntity(SupplierEntity supplierEntity)
  {
    // TODO Auto-generated method stub
    return supplierEntityDAO.save(supplierEntity);
  }

  public SupplierEntity getSupplierEntityById(int id)
  {
    // TODO Auto-generated method stub
    return supplierEntityDAO.getById(id);
  }

  public SupplierEntity[] getSupplierEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return supplierEntityDAO.getByIds(ids);
  }

  public boolean deleteSupplierEntityById(int id)
  {
    // TODO Auto-generated method stub
    return supplierEntityDAO.deleteById(id);
  }

  public boolean deleteSupplierByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return supplierEntityDAO.deleteByIds(ids);
  }

  public void updateSupplierEntity(SupplierEntity supplierEntity)
  {
    // TODO Auto-generated method stub
    supplierEntityDAO.update(supplierEntity);
  }

  public List<SupplierEntity> getAll()
  {
    // TODO Auto-generated method stub
    return supplierEntityDAO.getAll();
  }

}
