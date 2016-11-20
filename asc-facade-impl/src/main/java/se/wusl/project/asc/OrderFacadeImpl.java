package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderFacadeImpl implements OrderFacade
{
  @Autowired
  private OrderService orderService;

  /**
   * @return the orderService
   */
  public OrderService getOrderService()
  {
    return orderService;
  }

  /**
   * @param orderService the orderService to set
   */
  public void setOrderService(OrderService orderService)
  {
    this.orderService = orderService;
  }

  public long saveOrderEntity(OrderEntity orderEntity)
  {
    // TODO Auto-generated method stub
    return orderService.saveOrderEntity(orderEntity);
  }

  public OrderEntity getOrderEntityById(int id)
  {
    // TODO Auto-generated method stub
    return orderService.getOrderEntityById(id);
  }

  public OrderEntity[] getOrderEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return orderService.getOrderEntitiesByIds(ids);
  }

  public boolean deleteOrderEntityById(int id)
  {
    // TODO Auto-generated method stub
    return orderService.deleteOrderEntityById(id);
  }

  public boolean deleteOrderByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return orderService.deleteOrderByIds(ids);
  }

  public void updateOrderEntity(OrderEntity orderEntity)
  {
    // TODO Auto-generated method stub
    orderService.updateOrderEntity(orderEntity);

  }

  public List<OrderEntity> getAll()
  {
    // TODO Auto-generated method stub
    return orderService.getAll();
  }

}
