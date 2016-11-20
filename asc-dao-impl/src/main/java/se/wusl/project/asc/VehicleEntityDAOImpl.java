package se.wusl.project.asc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class VehicleEntityDAOImpl implements VehicleEntityDAO
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

  public long save(VehicleEntity vehicleEntity)
  {
    return (Long) getSession().save(vehicleEntity);
  }

  public void update(VehicleEntity vehicleEntity)
  {
    getSession().update(vehicleEntity);
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

  public VehicleEntity getById(int id)
  {
    return (VehicleEntity) getSession().get(VehicleEntity.class, id);
  }

  public VehicleEntity[] getByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return null;
  }

  public List<VehicleEntity> getAll()
  {
    // TODO Auto-generated method stub
    return null;
  }

}
