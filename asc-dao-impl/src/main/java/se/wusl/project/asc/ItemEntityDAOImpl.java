package se.wusl.project.asc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ItemEntityDAOImpl implements ItemEntityDAO
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

  public long save(ItemEntity itemEntity)
  {
    return (Long) getSession().save(itemEntity);
  }

  public void update(ItemEntity itemEntity)
  {
    getSession().update(itemEntity);
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

  public ItemEntity getById(int id)
  {
    return (ItemEntity) getSession().get(ItemEntity.class, id);
  }

  public ItemEntity[] getByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return null;
  }

  public List<ItemEntity> getAll()
  {
    // TODO Auto-generated method stub
    return null;
  }

}
