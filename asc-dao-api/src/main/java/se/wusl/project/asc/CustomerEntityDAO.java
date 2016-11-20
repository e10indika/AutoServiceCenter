package se.wusl.project.asc;

import java.util.List;

public interface CustomerEntityDAO
{
  long save(CustomerEntity customerEntity);

  void update(CustomerEntity customerEntity);

  boolean deleteById(int id);

  boolean deleteByIds(int[] ids);

  CustomerEntity getById(int id);

  CustomerEntity[] getByIds(int[] ids);

  List<CustomerEntity> getAll();
}
