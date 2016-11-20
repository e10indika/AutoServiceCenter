package se.wusl.project.asc;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ASC_Order")
public class OrderEntity implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "primaryKey")
  private long primaryKey;
  
  @Column(name = "total")
  private float total;
  
  @Column(name = "advance")
  private float advance;
  
  @Column(name = "balance")
  private float balance;
  
  @Column(name = "orderTime")
  private Date orderTime;
  
  @Column(name = "deliverTime")
  private Date deliverTime;
  
  @Column(name = "vahicleNumber")
  private String vehicleNumber;

  /**
   * @param total
   * @param advance
   * @param balance
   * @param orderTime
   * @param deliverTime
   * @param vehicleNumber
   */
  public OrderEntity(float total, float advance, float balance, Date orderTime, Date deliverTime, String vehicleNumber)
  {
    super();
    this.total = total;
    this.advance = advance;
    this.balance = balance;
    this.orderTime = orderTime;
    this.deliverTime = deliverTime;
    this.vehicleNumber = vehicleNumber;
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
   * @return the total
   */
  public float getTotal()
  {
    return total;
  }

  /**
   * @param total the total to set
   */
  public void setTotal(float total)
  {
    this.total = total;
  }

  /**
   * @return the advance
   */
  public float getAdvance()
  {
    return advance;
  }

  /**
   * @param advance the advance to set
   */
  public void setAdvance(float advance)
  {
    this.advance = advance;
  }

  /**
   * @return the balance
   */
  public float getBalance()
  {
    return balance;
  }

  /**
   * @param balance the balance to set
   */
  public void setBalance(float balance)
  {
    this.balance = balance;
  }

  /**
   * @return the orderTime
   */
  public Date getOrderTime()
  {
    return orderTime;
  }

  /**
   * @param orderTime the orderTime to set
   */
  public void setOrderTime(Date orderTime)
  {
    this.orderTime = orderTime;
  }

  /**
   * @return the deliverTime
   */
  public Date getDeliverTime()
  {
    return deliverTime;
  }

  /**
   * @param deliverTime the deliverTime to set
   */
  public void setDeliverTime(Date deliverTime)
  {
    this.deliverTime = deliverTime;
  }

  /**
   * @return the vehicleNumber
   */
  public String getVehicleNumber()
  {
    return vehicleNumber;
  }

  /**
   * @param vehicleNumber the vehicleNumber to set
   */
  public void setVehicleNumber(String vehicleNumber)
  {
    this.vehicleNumber = vehicleNumber;
  }
  
  
}
