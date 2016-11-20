package se.wusl.project.asc;

import java.util.List;

public interface OrderService
{
  long saveOrderEntity(OrderEntity orderEntity);

  OrderEntity getOrderEntityById(int id);

  OrderEntity[] getOrderEntitiesByIds(int[] ids);

  boolean deleteOrderEntityById(int id);

  boolean deleteOrderByIds(int[] ids);

  void updateOrderEntity(OrderEntity orderEntity);

  List<OrderEntity> getAll();
}
