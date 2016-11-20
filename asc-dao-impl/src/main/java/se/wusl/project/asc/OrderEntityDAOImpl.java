package se.wusl.project.asc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class OrderEntityDAOImpl implements OrderEntityDAO
{
  @Autowired
  private SessionFactory sessionFactory;
  
  /**
   * @return the sessionFactory
   */
  public SessionFactory getSessionFactory()
  {
    return sessionFactory;
  }

  /**
   * @param sessionFactory the sessionFactory to set
   */
  public void setSessionFactory(SessionFactory sessionFactory)
  {
    this.sessionFactory = sessionFactory;
  }

  private Session getSession()
  {
    return sessionFactory.getCurrentSession();
  }
  
  public long save(OrderEntity orderEntity)
  {
    return (Long) getSession().save(orderEntity);
  }

  public void update(OrderEntity orderEntity)
  {
    getSession().update(orderEntity);
  }

  public boolean deleteById(int id)
  {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean deleteByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return false;
  }

  public OrderEntity getById(int id)
  {
    return (OrderEntity) getSession().get(OrderEntity.class, id);
  }

  public OrderEntity[] getByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return null;
  }

  public List<OrderEntity> getAll()
  {
    // TODO Auto-generated method stub
    return null;
  }

}
