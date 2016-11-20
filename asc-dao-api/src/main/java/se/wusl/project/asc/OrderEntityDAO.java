package se.wusl.project.asc;

import java.util.List;

public interface OrderEntityDAO
{
  long save(OrderEntity orderEntity);
  
  void update(OrderEntity orderEntity);
  
  boolean deleteById(int id);
  
  boolean deleteByIds(int[] ids);
  
  OrderEntity getById(int id);
  
  OrderEntity[] getByIds(int[] ids);
  
  List<OrderEntity> getAll();
}
