package se.wusl.project.asc;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ASC_Payment")
public class PaymentEntity implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "primaryKey")
  private long primaryKey;

  @Column(name = "amount")
  private float amount;

  @Column(name = "costomerNIC")
  private String customerNIC;

  /**
   * @param primaryKey
   * @param amount
   * @param customerNIC
   */
  public PaymentEntity(long primaryKey, float amount, String customerNIC)
  {
    super();
    this.primaryKey = primaryKey;
    this.amount = amount;
    this.customerNIC = customerNIC;
  }

  /**
   * @return the primaryKey
   */
  public long getPrimaryKey()
  {
    return primaryKey;
  }

  /**
   * @param primaryKey the primaryKey to set
   */
  public void setPrimaryKey(long primaryKey)
  {
    this.primaryKey = primaryKey;
  }

  /**
   * @return the amount
   */
  public float getAmount()
  {
    return amount;
  }

  /**
   * @param amount the amount to set
   */
  public void setAmount(float amount)
  {
    this.amount = amount;
  }

  /**
   * @return the customerNIC
   */
  public String getCustomerNIC()
  {
    return customerNIC;
  }

  /**
   * @param customerNIC the customerNIC to set
   */
  public void setCustomerNIC(String customerNIC)
  {
    this.customerNIC = customerNIC;
  }

}
