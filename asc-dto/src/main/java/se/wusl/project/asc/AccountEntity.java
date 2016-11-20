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
@Table(name = "ASC_Account")
public class AccountEntity implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "primaryKey")
  private long primaryKey;

  @Column(name = "beginTime")
  private Date beginTime;

  @Column(name = "lastActiveTIme")
  private Date lastActiveTime;

  @Column(name = "lastPaymentId")
  private long lastPaymentId;

  /**
   * @param beginTime
   * @param lastActiveTime
   * @param lastPaymentId
   */
  public AccountEntity(Date beginTime, Date lastActiveTime, long lastPaymentId)
  {
    super();
    this.beginTime = beginTime;
    this.lastActiveTime = lastActiveTime;
    this.lastPaymentId = lastPaymentId;
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
   * @return the beginTime
   */
  public Date getBeginTime()
  {
    return beginTime;
  }

  /**
   * @param beginTime the beginTime to set
   */
  public void setBeginTime(Date beginTime)
  {
    this.beginTime = beginTime;
  }

  /**
   * @return the lastActiveTime
   */
  public Date getLastActiveTime()
  {
    return lastActiveTime;
  }

  /**
   * @param lastActiveTime the lastActiveTime to set
   */
  public void setLastActiveTime(Date lastActiveTime)
  {
    this.lastActiveTime = lastActiveTime;
  }

  /**
   * @return the lastPaymentId
   */
  public long getLastPaymentId()
  {
    return lastPaymentId;
  }

  /**
   * @param lastPaymentId the lastPaymentId to set
   */
  public void setLastPaymentId(long lastPaymentId)
  {
    this.lastPaymentId = lastPaymentId;
  }

}
