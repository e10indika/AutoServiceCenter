package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService
{
  @Autowired
  private OrderEntityDAO orderEntityDAO;

  private static final OrderService instance = new OrderServiceImpl();

  private OrderServiceImpl()
  {

  }

  /**
   * @return the orderEntityDAO
   */
  public OrderEntityDAO getOrderEntityDAO()
  {
    return orderEntityDAO;
  }

  /**
   * @param orderEntityDAO the orderEntityDAO to set
   */
  public void setOrderEntityDAO(OrderEntityDAO orderEntityDAO)
  {
    this.orderEntityDAO = orderEntityDAO;
  }

  /**
   * @return the instance
   */
  public OrderService getInstance()
  {
    return instance;
  }

  public long saveOrderEntity(OrderEntity orderEntity)
  {
    return orderEntityDAO.save(orderEntity);
  }

  public OrderEntity getOrderEntityById(int id)
  {
    return orderEntityDAO.getById(id);
  }

  public OrderEntity[] getOrderEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return orderEntityDAO.getByIds(ids);
  }

  public boolean deleteOrderEntityById(int id)
  {
    // TODO Auto-generated method stub
    return orderEntityDAO.deleteById(id);
  }

  public boolean deleteOrderByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return orderEntityDAO.deleteByIds(ids);
  }

  public void updateOrderEntity(OrderEntity orderEntity)
  {
    // TODO Auto-generated method stub
    orderEntityDAO.update(orderEntity);
  }

  public List<OrderEntity> getAll()
  {
    // TODO Auto-generated method stub
    return orderEntityDAO.getAll();
  }

}
