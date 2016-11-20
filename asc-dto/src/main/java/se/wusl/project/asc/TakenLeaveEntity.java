package se.wusl.project.asc;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ASC_TakenLeave")
public class TakenLeaveEntity implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Column(name = "leaveType")
  private int leaveType;

  @Column(name = "date")
  private Date date;

  @Column(name = "period")
  private String period;

  @Column(name = "reason")
  private String reason;

  /**
   * @param leaveType
   * @param date
   * @param period
   * @param reason
   */
  public TakenLeaveEntity(int leaveType, Date date, String period, String reason)
  {
    super();
    this.leaveType = leaveType;
    this.date = date;
    this.period = period;
    this.reason = reason;
  }

  /**
   * @return the leaveType
   */
  public int getLeaveType()
  {
    return leaveType;
  }

  /**
   * @param leaveType the leaveType to set
   */
  public void setLeaveType(int leaveType)
  {
    this.leaveType = leaveType;
  }

  /**
   * @return the date
   */
  public Date getDate()
  {
    return date;
  }

  /**
   * @param date the date to set
   */
  public void setDate(Date date)
  {
    this.date = date;
  }

  /**
   * @return the period
   */
  public String getPeriod()
  {
    return period;
  }

  /**
   * @param period the period to set
   */
  public void setPeriod(String period)
  {
    this.period = period;
  }

  /**
   * @return the reason
   */
  public String getReason()
  {
    return reason;
  }

  /**
   * @param reason the reason to set
   */
  public void setReason(String reason)
  {
    this.reason = reason;
  }

}
