package se.wusl.project.asc;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ASC_Customer")
public class CustomerEntity implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "primaryKey")
  private long primaryKey;

  @Column(name = "firstName")
  private String firstName;

  @Column(name = "middleName")
  private String middleName;

  @Column(name = "lastName")
  private String lastName;

  @Column(name = "address1")
  private String address1;

  @Column(name = "address2")
  private String address2;

  @Column(name = "address3")
  private String address3;

  @Column(name = "mobileNumber")
  private String mobileNumber;

  @Column(name = "sex")
  private int sex;

  @Column(name = "type")
  private int type;

  /**
   * @param firstName
   * @param middleName
   * @param lastName
   * @param address1
   * @param address2
   * @param address3
   * @param mobileNumber
   * @param sex
   * @param type
   */
  public CustomerEntity(String firstName, String middleName, String lastName, String address1, String address2,
                        String address3, String mobileNumber, int sex, int type)
  {
    super();
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.address1 = address1;
    this.address2 = address2;
    this.address3 = address3;
    this.mobileNumber = mobileNumber;
    this.sex = sex;
    this.type = type;
  }  

  /**
   * @param firstName
   * @param lastName
   * @param address1
   * @param mobileNumber
   * @param sex
   * @param type
   */
  public CustomerEntity(String firstName, String lastName, String address1, String mobileNumber, int sex, int type)
  {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.address1 = address1;
    this.mobileNumber = mobileNumber;
    this.sex = sex;
    this.type = type;
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
   * @return the firstName
   */
  public String getFirstName()
  {
    return firstName;
  }

  /**
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  /**
   * @return the middleName
   */
  public String getMiddleName()
  {
    return middleName;
  }

  /**
   * @param middleName the middleName to set
   */
  public void setMiddleName(String middleName)
  {
    this.middleName = middleName;
  }

  /**
   * @return the lastName
   */
  public String getLastName()
  {
    return lastName;
  }

  /**
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName)
  {
    this.lastName = lastName;
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

  /**
   * @return the mobileNumber
   */
  public String getMobileNumber()
  {
    return mobileNumber;
  }

  /**
   * @param mobileNumber the mobileNumber to set
   */
  public void setMobileNumber(String mobileNumber)
  {
    this.mobileNumber = mobileNumber;
  }

  /**
   * @return the sex
   */
  public int getSex()
  {
    return sex;
  }

  /**
   * @param sex the sex to set
   */
  public void setSex(int sex)
  {
    this.sex = sex;
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
  
  

}
