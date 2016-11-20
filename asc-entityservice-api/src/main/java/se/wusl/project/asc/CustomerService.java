package se.wusl.project.asc;

import java.util.List;

public interface CustomerService
{
  List<CustomerEntity> saveAndGetAllCustomerEntities(final CustomerEntity CustomerEntity);

  long saveCustomerEntity(CustomerEntity CustomerEntity);

  CustomerEntity getCustomerEntityById(int id);
  
  CustomerEntity[] getCustomerEntitiesByIds(int[] ids);

  boolean deleteCustomerEntityById(int id);
  
  boolean deleteCustomerEntitiesByIds(int[] ids);

  void updateCustomerEntity(CustomerEntity CustomerEntity);

}
