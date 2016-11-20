package se.wusl.project.asc;

import java.util.List;

public interface PaymentEntityDAO
{
  long save(PaymentEntity paymentEntity);
  
  void update(PaymentEntity paymentEntity);
  
  boolean deleteById(int id);
  
  boolean deleteByIds(int[] ids);
  
  PaymentEntity getById(int id);
  
  PaymentEntity[] getByIds(int[] ids);
  
  List<PaymentEntity> getAll();
}
