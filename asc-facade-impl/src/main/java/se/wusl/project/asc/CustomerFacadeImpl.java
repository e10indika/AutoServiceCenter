package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerFacadeImpl implements CustomerFacade 
{
  @Autowired
  private CustomerService customerService;

  public CustomerService getCustomerService() {

    return customerService;
  }

  public void setCustomerService(CustomerService customerService) {

    this.customerService = customerService;
  }

  public List<CustomerEntity> saveAndGetAllCustomerEntities(CustomerEntity customerEntity)
  {
    // TODO Auto-generated method stub
    return customerService.saveAndGetAllCustomerEntities(customerEntity);
  }

  public long saveCustomerEntity(CustomerEntity customerEntity)
  {
    // TODO Auto-generated method stub
    return customerService.saveCustomerEntity(customerEntity);
  }

  public CustomerEntity getCustomerEntityById(int id)
  {
    // TODO Auto-generated method stub
    return customerService.getCustomerEntityById(id);
  }

  public CustomerEntity[] getCustomerEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return customerService.getCustomerEntitiesByIds(ids);
  }

  public boolean deleteCustomerEntityById(int id)
  {
    // TODO Auto-generated method stub
    return customerService.deleteCustomerEntityById(id);
  }

  public boolean deleteCustomerEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return customerService.deleteCustomerEntitiesByIds(ids);
  }

  public void updateCustomerEntity(CustomerEntity CustomerEntity)
  {
    // TODO Auto-generated method stub
    customerService.updateCustomerEntity(CustomerEntity);
    
  }  
  
}
