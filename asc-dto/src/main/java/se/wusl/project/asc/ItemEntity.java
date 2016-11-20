package se.wusl.project.asc;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ASC_Item")
public class ItemEntity implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "primaryKey")
  private long primaryKey;

  @Column(name = "itemPrice")
  private String itemPrice;

  @Column(name = "brand")
  private String brand;

  @Column(name = "qty")
  private String qty;

  @Column(name = "itemName")
  private String itemName;

  @Column(name = "description")
  private String description;

  /**
   * @param itemPrice
   * @param brand
   * @param qty
   * @param itemName
   * @param description
   */
  public ItemEntity(String itemPrice, String brand, String qty, String itemName, String description)
  {
    super();
    this.itemPrice = itemPrice;
    this.brand = brand;
    this.qty = qty;
    this.itemName = itemName;
    this.description = description;
  }

  /**
   * @param brand
   * @param qty
   * @param itemName
   * @param description
   */
  public ItemEntity(String brand, String qty, String itemName, String description)
  {
    super();
    this.brand = brand;
    this.qty = qty;
    this.itemName = itemName;
    this.description = description;
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
   * @return the itemPrice
   */
  public String getItemPrice()
  {
    return itemPrice;
  }

  /**
   * @param itemPrice the itemPrice to set
   */
  public void setItemPrice(String itemPrice)
  {
    this.itemPrice = itemPrice;
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
   * @return the qty
   */
  public String getQty()
  {
    return qty;
  }

  /**
   * @param qty the qty to set
   */
  public void setQty(String qty)
  {
    this.qty = qty;
  }

  /**
   * @return the itemName
   */
  public String getItemName()
  {
    return itemName;
  }

  /**
   * @param itemName the itemName to set
   */
  public void setItemName(String itemName)
  {
    this.itemName = itemName;
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

}
