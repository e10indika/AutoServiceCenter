package se.wusl.project.asc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ServiceEntityDAOImpl implements ServiceEntityDAO
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
  public long save(ServiceEntity serviceEntity)
  {
    return (Long) getSession().save(serviceEntity);
  }

  public void update(ServiceEntity serviceEntity)
  {
   getSession().update(serviceEntity);
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

  public ServiceEntity getById(int id)
  {
    return (ServiceEntity) getSession().get(ServiceEntity.class, id);
  }

  public ServiceEntity[] getByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return null;
  }

  public List<ServiceEntity> getAll()
  {
    // TODO Auto-generated method stub
    return null;
  }

}
