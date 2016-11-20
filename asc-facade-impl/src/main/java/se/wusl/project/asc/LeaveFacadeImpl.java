package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class LeaveFacadeImpl implements LeaveFacade
{
  @Autowired
  private LeaveService leaveService;
  

  /**
   * @return the leaveService
   */
  public LeaveService getLeaveService()
  {
    return leaveService;
  }

  /**
   * @param leaveService the leaveService to set
   */
  public void setLeaveService(LeaveService leaveService)
  {
    this.leaveService = leaveService;
  }

  public long saveLeaveEntity(LeaveEntity leaveEntity)
  {
    // TODO Auto-generated method stub
    return leaveService.saveLeaveEntity(leaveEntity);
  }

  public LeaveEntity getLeaveEntityById(int id)
  {
    // TODO Auto-generated method stub
    return leaveService.getLeaveEntityById(id);
  }

  public LeaveEntity[] getLeaveEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return leaveService.getLeaveEntitiesByIds(ids);
  }

  public boolean deleteLeaveEntityById(int id)
  {
    // TODO Auto-generated method stub
    return leaveService.deleteLeaveEntityById(id);
  }

  public boolean deleteLeaveByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return leaveService.deleteLeaveByIds(ids);
  }

  public void updateLeaveEntity(LeaveEntity leaveEntity)
  {
    // TODO Auto-generated method stub
    leaveService.updateLeaveEntity(leaveEntity);
  }

  public List<LeaveEntity> getAll()
  {
    // TODO Auto-generated method stub
    return leaveService.getAll();
  }

}
