package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentFacadeImpl implements PaymentFacade
{
  @Autowired
  private PaymentService paymentService;
  
  /**
   * @return the paymentService
   */
  public PaymentService getPaymentService()
  {
    return paymentService;
  }

  /**
   * @param paymentService the paymentService to set
   */
  public void setPaymentService(PaymentService paymentService)
  {
    this.paymentService = paymentService;
  }

  public long savePaymentEntity(PaymentEntity paymentEntity)
  {
    // TODO Auto-generated method stub
    return paymentService.savePaymentEntity(paymentEntity);
  }

  public PaymentEntity getPaymentEntityById(int id)
  {
    // TODO Auto-generated method stub
    return paymentService.getPaymentEntityById(id);
  }

  public PaymentEntity[] getPaymentEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return paymentService.getPaymentEntitiesByIds(ids);
  }

  public boolean deletePaymentEntityById(int id)
  {
    // TODO Auto-generated method stub
    return paymentService.deletePaymentEntityById(id);
  }

  public boolean deletePaymentByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return paymentService.deletePaymentByIds(ids);
  }

  public void updatePaymentEntity(PaymentEntity paymentEntity)
  {
    // TODO Auto-generated method stub
    paymentService.updatePaymentEntity(paymentEntity);
  }

  public List<PaymentEntity> getAll()
  {
    // TODO Auto-generated method stub
    return paymentService.getAll();
  }

}
