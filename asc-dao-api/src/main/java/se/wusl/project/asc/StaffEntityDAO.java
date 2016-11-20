package se.wusl.project.asc;

import java.util.List;

public interface StaffEntityDAO 
{
  long save(StaffEntity staffEntity);
  
  void update(StaffEntity staffEntity);
  
  boolean deleteById(int id);
  
  boolean deleteByIds(int[] ids);
  
  StaffEntity getById(int id);
  
  StaffEntity[] getByIds(int[] ids);

  List<StaffEntity> getAll(); 
}
