package se.wusl.project.asc;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ASC_Service")
public class ServiceEntity implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "primaryKey")
  private long primaryKey;

  @Column(name = "type")
  private int type;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "fees")
  private float fees;

  /**
   * @param primaryKey
   * @param type
   * @param name
   * @param description
   * @param fees
   */
  public ServiceEntity(long primaryKey, int type, String name, String description, float fees)
  {
    super();
    this.primaryKey = primaryKey;
    this.type = type;
    this.name = name;
    this.description = description;
    this.fees = fees;
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
   * @return the type
   */
  public int getType()
  {
    return type;
  }

  /**
   * @param type the type to set
   */
  public void setType(int type)
  {
    this.type = type;
  }

  /**
   * @return the name
   */
  public String getName()
  {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name)
  {
    this.name = name;
  }

  /**
   * @return the description
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * @param description the description to set
   */
  public void setDescription(String description)
  {
    this.description = description;
  }

  /**
   * @return the fees
   */
  public float getFees()
  {
    return fees;
  }

  /**
   * @param fees the fees to set
   */
  public void setFees(float fees)
  {
    this.fees = fees;
  }

}
