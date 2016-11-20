package se.wusl.project.asc;

import java.util.List;

public interface LeaveEntityDAO
{
  long save(LeaveEntity leaveEntity);
  
  void update(LeaveEntity leaveEntity);
  
  boolean deleteById(int id);
  
  boolean deleteByIds(int[] ids);
  
  LeaveEntity getById(int id);
  
  LeaveEntity[] getByIds(int[] ids);
  
  List<LeaveEntity> getAll();
}
