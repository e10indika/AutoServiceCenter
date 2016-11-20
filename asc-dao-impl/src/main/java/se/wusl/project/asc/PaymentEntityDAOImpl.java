package se.wusl.project.asc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class PaymentEntityDAOImpl implements PaymentEntityDAO
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
  public long save(PaymentEntity paymentEntity)
  {
    return (Long) getSession().save(paymentEntity);
  }

  public void update(PaymentEntity paymentEntity)
  {
    getSession().update(paymentEntity);
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

  public PaymentEntity getById(int id)
  {
    return (PaymentEntity) getSession().get(PaymentEntity.class, id);
  }

  public PaymentEntity[] getByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return null;
  }

  public List<PaymentEntity> getAll()
  {
    // TODO Auto-generated method stub
    return null;
  }

}
