package se.wusl.project.asc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class TakenLeaveEntityDAOImpl implements TakenLeaveEntityDAO
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
  
  public long save(TakenLeaveEntity takenLeaveEntity)
  {
    return (Long) getSession().save(takenLeaveEntity);
  }

  public void update(TakenLeaveEntity takenLeaveEntity)
  {
    getSession().update(takenLeaveEntity);
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

  public TakenLeaveEntity getById(int id)
  {
    return (TakenLeaveEntity) getSession().get(TakenLeaveEntity.class, id);
  }

  public TakenLeaveEntity[] getByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return null;
  }

  public List<TakenLeaveEntity> getAll()
  {
    // TODO Auto-generated method stub
    return null;
  }

}
