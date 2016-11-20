package se.wusl.project.asc;

public class StaffPMImpl implements StaffPM
{
  StaffDelegate staffDelegate = new StaffDelegateImpl();

  public StaffPMImpl()
  {
    super();
  }

  public long setStaffEntity(StaffEntity staffEntity)
  {
    return staffDelegate.setStaffEntity(staffEntity);
  }

  public void deleteStaffEntityById(int id)
  {
    staffDelegate.deleteStaffEntityById(id);
  }

  public StaffEntity retrieveStaffEntityById(int id)
  {
    return staffDelegate.retrieveStaffEntityById(id);
  }

  public void updateStaffEntity(StaffEntity staffEntity)
  {
    staffDelegate.updateStaffEntity(staffEntity);
  }

}
