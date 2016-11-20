package se.wusl.project.asc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CustomerEntityDAOImpl implements CustomerEntityDAO
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
  
  public long save(CustomerEntity CustomerEntity)
  {
    return (Long) getSession().save(CustomerEntity);
  }

  public void update(CustomerEntity CustomerEntity)
  {
    getSession().update(CustomerEntity);
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

  public CustomerEntity getById(int id)
  {
    return (CustomerEntity) getSession().get(CustomerEntity.class, id);
  }

  public CustomerEntity[] getByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return null;
  }

  public List<CustomerEntity> getAll()
  {
    // TODO Auto-generated method stub
    return null;
  }

}
