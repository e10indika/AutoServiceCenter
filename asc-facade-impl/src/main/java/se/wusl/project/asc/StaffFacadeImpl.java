package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class StaffFacadeImpl implements StaffFacade 
{
  @Autowired
  private StaffService staffService;

  public StaffService getStaffService() {

    return staffService;
  }

  public void setStaffService(StaffService staffService) {

    this.staffService = staffService;
  }

  public long saveStaffEntity(StaffEntity staffEntity)
  {
    // TODO Auto-generated method stub
    return staffService.saveStaffEntity(staffEntity);
  }

  public StaffEntity getStaffEntityById(int id)
  {
    // TODO Auto-generated method stub
    return staffService.getStaffEntityById(id);
  }

  public StaffEntity[] getStaffEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return staffService.getStaffEntitiesByIds(ids);
  }

  public boolean deleteStaffEntityById(int id)
  {
    // TODO Auto-generated method stub
    return staffService.deleteStaffEntityById(id);
  }

  public boolean deleteStaffByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return staffService.deleteStaffByIds(ids);
  }

  public void updateStaffEntity(StaffEntity staffEntity)
  {
    // TODO Auto-generated method stub
    staffService.updateStaffEntity(staffEntity);
  }

  public List<StaffEntity> getAll()
  {
    // TODO Auto-generated method stub
    return staffService.getAll();
  }
  
 
}
