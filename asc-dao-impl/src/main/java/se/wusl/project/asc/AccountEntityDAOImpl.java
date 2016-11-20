package se.wusl.project.asc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AccountEntityDAOImpl implements AccountEntityDAO
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

  public Session getSession()
  {
    return sessionFactory.getCurrentSession();
  }
  public long save(AccountEntity accountEntity)
  {
    return (Long) getSession().save(accountEntity);
  }

  public void update(AccountEntity accountEntity)
  {
    getSession().update(accountEntity);
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

  public AccountEntity getById(int id)
  {
    return (AccountEntity) getSession().get(AccountEntity.class, id);
  }

  public AccountEntity[] getByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return null;
  }

  public List<AccountEntity> getAll()
  {
    // TODO Auto-generated method stub
    return null;
  }

}
