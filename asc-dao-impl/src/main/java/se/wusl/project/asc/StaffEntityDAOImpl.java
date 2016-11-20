package se.wusl.project.asc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class StaffEntityDAOImpl implements StaffEntityDAO
{
  @Autowired
  SessionFactory sessionFactory;

  public SessionFactory getSessionFactory()
  {
    return sessionFactory;
  }

  public void setSessionFactory(SessionFactory sessionFactory)
  {
    this.sessionFactory = sessionFactory;
  }

  private Session getSession()
  {
    return sessionFactory.getCurrentSession();
  }

  public long save(StaffEntity staffEntity)
  {
    return (Long) getSession().save(staffEntity);
  }

  public void update(StaffEntity staffEntity)
  {
    getSession().update(staffEntity);
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

  public StaffEntity getById(int id)
  {
    return (StaffEntity) getSession().get(StaffEntity.class, id);
  }

  public StaffEntity[] getByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return null;
  }

  public List<StaffEntity> getAll()
  {
    // TODO Auto-generated method stub
    return null;
  }
}
