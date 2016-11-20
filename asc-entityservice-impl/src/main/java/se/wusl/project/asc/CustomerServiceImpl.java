package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService
{
  @Autowired
  private CustomerEntityDAO customerEntityDAO;

  private static final CustomerService instance = new CustomerServiceImpl();

  /**
   * @return the customerEntityDAO
   */
  public CustomerEntityDAO getCustomerEntityDAO()
  {
    return customerEntityDAO;
  }

  /**
   * @param customerEntityDAO the customerEntityDAO to set
   */
  public void setCustomerEntityDAO(CustomerEntityDAO customerEntityDAO)
  {
    this.customerEntityDAO = customerEntityDAO;
  }

  /**
   * @return the instance
   */
  public CustomerService getInstance()
  {
    return instance;
  }

  /**
   * 
   */
  private CustomerServiceImpl()
  {
    super();
  }

  public List<CustomerEntity> saveAndGetAllCustomerEntities(CustomerEntity CustomerEntity)
  {
    saveCustomerEntity(CustomerEntity);
    return customerEntityDAO.getAll();
  }

  public long saveCustomerEntity(CustomerEntity CustomerEntity)
  {
    return customerEntityDAO.save(CustomerEntity);
  }

  public CustomerEntity getCustomerEntityById(int id)
  {
    return customerEntityDAO.getById(id);
  }

  public boolean deleteCustomerEntityById(int id)
  {
    return customerEntityDAO.deleteById(id);
  }

  public void updateCustomerEntity(CustomerEntity CustomerEntity)
  {
    customerEntityDAO.update(CustomerEntity);
  }

  public CustomerEntity[] getCustomerEntitiesByIds(int[] ids)
  {
    return customerEntityDAO.getByIds(ids);
  }

  public boolean deleteCustomerEntitiesByIds(int[] ids)
  {
    return customerEntityDAO.deleteByIds(ids);
  }

}
