package se.wusl.project.asc;

import java.util.List;

public interface StaffService
{
  long saveStaffEntity(StaffEntity staffEntity);

  StaffEntity getStaffEntityById(int id);

  StaffEntity[] getStaffEntitiesByIds(int[] ids);

  boolean deleteStaffEntityById(int id);

  boolean deleteStaffByIds(int[] ids);

  void updateStaffEntity(StaffEntity staffEntity);

  List<StaffEntity> getAll();
}
