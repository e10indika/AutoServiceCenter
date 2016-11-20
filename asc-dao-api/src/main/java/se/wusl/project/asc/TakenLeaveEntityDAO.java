package se.wusl.project.asc;

import java.util.List;

public interface TakenLeaveEntityDAO
{
  long save(TakenLeaveEntity takenLeaveEntity);
  
  void update(TakenLeaveEntity takenLeaveEntity);
  
  boolean deleteById(int id);
  
  boolean deleteByIds(int[] ids);
  
  TakenLeaveEntity getById(int id);
  
  TakenLeaveEntity[] getByIds(int[] ids);
  
  List<TakenLeaveEntity> getAll();
}
