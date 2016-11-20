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
@Table(name = "ASC_Staff")
public class StaffEntity implements Serializable
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
  
  @Column(name = "birthDate")
  private Date birthDate;
  
  @Column(name = "mobileNumber")
  private String mobileNumber;
  
  @Column(name = "landNumber")
  private String landNumber;
  
  @Column(name = "salary")
  private long salary;
  
  @Column(name = "sex")
  private long sex;
  
  @Column(name = "NIC")
  private String NIC;
  
  public StaffEntity()
  {
    
  }  

  public StaffEntity(String firstName, String lastName, Date birthDate, String address1)
  {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.address1 = address1;
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
   * @return the fname
   */
  public String getFname()
  {
    return firstName;
  }

  /**
   * @param fname the fname to set
   */
  public void setFname(String fname)
  {
    this.firstName = fname;
  }

  /**
   * @return the lname
   */
  public String getLname()
  {
    return lastName;
  }

  /**
   * @param lname the lname to set
   */
  public void setLname(String lname)
  {
    this.lastName = lname;
  }

  /**
   * @return the birthDate
   */
  public Date getBirthDate()
  {
    return birthDate;
  }

  /**
   * @param birthDate the birthDate to set
   */
  public void setBirthDate(Date birthDate)
  {
    this.birthDate = birthDate;
  }

  /**
   * @return the email
   */
  public String getEmail()
  {
    return address1;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email)
  {
    this.address1 = email;
  }
  
}
