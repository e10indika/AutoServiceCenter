package se.wusl.project.asc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class SupplierEntityDAOImpl implements SupplierEntityDAO
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

  public long save(SupplierEntity supplierEntity)
  {
    return (Long) getSession().save(supplierEntity);
  }

  public void update(SupplierEntity supplierEntity)
  {
    getSession().update(supplierEntity);
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

  public SupplierEntity getById(int id)
  {
    return (SupplierEntity) getSession().get(SupplierEntity.class, id);
  }

  public SupplierEntity[] getByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return null;
  }

  public List<SupplierEntity> getAll()
  {
    // TODO Auto-generated method stub
    return null;
  }

}
