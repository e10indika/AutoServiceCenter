package se.wusl.project.asc;

import java.util.List;

public interface LeaveFacade
{
  long saveLeaveEntity(LeaveEntity leaveEntity);

  LeaveEntity getLeaveEntityById(int id);

  LeaveEntity[] getLeaveEntitiesByIds(int[] ids);

  boolean deleteLeaveEntityById(int id);

  boolean deleteLeaveByIds(int[] ids);

  void updateLeaveEntity(LeaveEntity leaveEntity);

  List<LeaveEntity> getAll();
}
