package se.wusl.project.asc;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class LeaveEntityDAOImpl implements LeaveEntityDAO
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

  public long save(LeaveEntity leaveEntity)
  {
    return (Long) getSession().save(leaveEntity);
  }

  public void update(LeaveEntity leaveEntity)
  {
    getSession().update(leaveEntity);
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

  public LeaveEntity getById(int id)
  {
    return (LeaveEntity) getSession().get(LeaveEntity.class, id);
  }

  public LeaveEntity[] getByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return null;
  }

  public List<LeaveEntity> getAll()
  {
    // TODO Auto-generated method stub
    return null;
  }

}
