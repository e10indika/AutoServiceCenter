package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentServiceImpl implements PaymentService
{
  @Autowired
  private PaymentEntityDAO paymentEntityDAO;

  private static final PaymentService instance = new PaymentServiceImpl();

  private PaymentServiceImpl()
  {

  }

  /**
   * @return the paymentEntityDAO
   */
  public PaymentEntityDAO getPaymentEntityDAO()
  {
    return paymentEntityDAO;
  }

  /**
   * @param paymentEntityDAO the paymentEntityDAO to set
   */
  public void setPaymentEntityDAO(PaymentEntityDAO paymentEntityDAO)
  {
    this.paymentEntityDAO = paymentEntityDAO;
  }

  /**
   * @return the instance
   */
  public PaymentService getInstance()
  {
    return instance;
  }

  public long savePaymentEntity(PaymentEntity paymentEntity)
  {
    // TODO Auto-generated method stub
    return paymentEntityDAO.save(paymentEntity);
  }

  public PaymentEntity getPaymentEntityById(int id)
  {
    // TODO Auto-generated method stub
    return paymentEntityDAO.getById(id);
  }

  public PaymentEntity[] getPaymentEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return paymentEntityDAO.getByIds(ids);
  }

  public boolean deletePaymentEntityById(int id)
  {
    // TODO Auto-generated method stub
    return paymentEntityDAO.deleteById(id);
  }

  public boolean deletePaymentByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return paymentEntityDAO.deleteByIds(ids);
  }

  public void updatePaymentEntity(PaymentEntity paymentEntity)
  {
    // TODO Auto-generated method stub
    paymentEntityDAO.update(paymentEntity);
  }

  public List<PaymentEntity> getAll()
  {
    // TODO Auto-generated method stub
    return paymentEntityDAO.getAll();
  }

}
