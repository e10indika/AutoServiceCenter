package se.wusl.project.asc;

import java.util.List;

public interface PaymentService
{
  long savePaymentEntity(PaymentEntity paymentEntity);

  PaymentEntity getPaymentEntityById(int id);

  PaymentEntity[] getPaymentEntitiesByIds(int[] ids);

  boolean deletePaymentEntityById(int id);

  boolean deletePaymentByIds(int[] ids);

  void updatePaymentEntity(PaymentEntity paymentEntity);

  List<PaymentEntity> getAll();
}
