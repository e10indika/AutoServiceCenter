package se.wusl.project.asc;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ASC_Leaves")
public class LeaveEntity implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "primaryKey")
  private long primaryKey;

  @Column(name = "leaveType")
  private int leaveType;

  /**
   * @param leaveType
   */
  public LeaveEntity(int leaveType)
  {
    super();
    this.leaveType = leaveType;
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

}
