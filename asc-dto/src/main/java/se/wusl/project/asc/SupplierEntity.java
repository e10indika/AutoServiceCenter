package se.wusl.project.asc;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ASC_Supplier")
public class SupplierEntity implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "primaryKey")
  private long primaryKey;

  @Column(name = "compnayName")
  private String compnayName;

  @Column(name = "address1")
  private String address1;

  @Column(name = "address2")
  private String address2;

  @Column(name = "address3")
  private String address3;

  /**
   * @param compnayName
   * @param address1
   * @param address2
   * @param address3
   */
  public SupplierEntity(String compnayName, String address1, String address2, String address3)
  {
    super();
    this.compnayName = compnayName;
    this.address1 = address1;
    this.address2 = address2;
    this.address3 = address3;
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
   * @return the compnayName
   */
  public String getCompnayName()
  {
    return compnayName;
  }

  /**
   * @param compnayName the compnayName to set
   */
  public void setCompnayName(String compnayName)
  {
    this.compnayName = compnayName;
  }

  /**
   * @return the address1
   */
  public String getAddress1()
  {
    return address1;
  }

  /**
   * @param address1 the address1 to set
   */
  public void setAddress1(String address1)
  {
    this.address1 = address1;
  }

  /**
   * @return the address2
   */
  public String getAddress2()
  {
    return address2;
  }

  /**
   * @param address2 the address2 to set
   */
  public void setAddress2(String address2)
  {
    this.address2 = address2;
  }

  /**
   * @return the address3
   */
  public String getAddress3()
  {
    return address3;
  }

  /**
   * @param address3 the address3 to set
   */
  public void setAddress3(String address3)
  {
    this.address3 = address3;
  }

}
