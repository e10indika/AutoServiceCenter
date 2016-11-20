package se.wusl.project.asc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StaffDelegateImpl implements StaffDelegate
{
  ApplicationContext context = new FileSystemXmlApplicationContext(
      new String[] { "..\\asc-delegate-impl\\src\\res\\context.xml" });

  StaffFacade staffFacade = (StaffFacade) context.getBean("staffService");

  public StaffDelegateImpl()
  {
    super();
  }

  public long insertStaffEntity(StaffEntity staffEntity)
  {
    return staffFacade.saveStaffEntity(staffEntity);
  }

  public long setStaffEntity(StaffEntity staffEntity)
  {
    return staffFacade.saveStaffEntity(staffEntity);
  }

  public void deleteStaffEntityById(int id)
  {
    staffFacade.deleteStaffEntityById(id);
  }

  public StaffEntity retrieveStaffEntityById(int id)
  {
    return staffFacade.getStaffEntityById(id);
  }

  public void updateStaffEntity(StaffEntity staffEntity)
  {
    staffFacade.updateStaffEntity(staffEntity);
  }
}
