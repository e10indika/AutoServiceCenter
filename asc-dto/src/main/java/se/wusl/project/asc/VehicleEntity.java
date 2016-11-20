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
@Table(name = "ASC_Vehicle")
public class VehicleEntity implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "primaryKey")
  private long primaryKey;
  
  @Column(name = "brand")
  private String brand;
  
  @Column(name = "type")
  private int type;
  
  @Column(name = "numberOfWheels")
  private int numberOfWheels;
  
  @Column(name = "color")
  private String color;
  
  @Column(name = "ownerId")
  private String ownerId;
  
  @Column(name = "enteredDateTime")
  private Date enteredDateTime;
  
  @Column(name = "leftDateTime")
  private Date leftDateTime;

  /**
   * @param brand
   * @param type
   * @param numberOfWheels
   * @param color
   * @param ownerId
   * @param enteredDateTime
   * @param leftDateTime
   */
  public VehicleEntity(String brand, int type, int numberOfWheels, String color, String ownerId,
                       Date enteredDateTime, Date leftDateTime)
  {
    super();
    this.brand = brand;
    this.type = type;
    this.numberOfWheels = numberOfWheels;
    this.color = color;
    this.ownerId = ownerId;
    this.enteredDateTime = enteredDateTime;
    this.leftDateTime = leftDateTime;
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
   * @return the brand
   */
  public String getBrand()
  {
    return brand;
  }

  /**
   * @param brand the brand to set
   */
  public void setBrand(String brand)
  {
    this.brand = brand;
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
   * @return the numberOfWheels
   */
  public int getNumberOfWheels()
  {
    return numberOfWheels;
  }

  /**
   * @param numberOfWheels the numberOfWheels to set
   */
  public void setNumberOfWheels(int numberOfWheels)
  {
    this.numberOfWheels = numberOfWheels;
  }

  /**
   * @return the color
   */
  public String getColor()
  {
    return color;
  }

  /**
   * @param color the color to set
   */
  public void setColor(String color)
  {
    this.color = color;
  }

  /**
   * @return the ownerId
   */
  public String getOwnerId()
  {
    return ownerId;
  }

  /**
   * @param ownerId the ownerId to set
   */
  public void setOwnerId(String ownerId)
  {
    this.ownerId = ownerId;
  }

  /**
   * @return the enteredDateTime
   */
  public Date getEnteredDateTime()
  {
    return enteredDateTime;
  }

  /**
   * @param enteredDateTime the enteredDateTime to set
   */
  public void setEnteredDateTime(Date enteredDateTime)
  {
    this.enteredDateTime = enteredDateTime;
  }

  /**
   * @return the leftDateTime
   */
  public Date getLeftDateTime()
  {
    return leftDateTime;
  }

  /**
   * @param leftDateTime the leftDateTime to set
   */
  public void setLeftDateTime(Date leftDateTime)
  {
    this.leftDateTime = leftDateTime;
  }
  
  
}
