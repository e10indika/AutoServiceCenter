package se.wusl.project.asc;

public interface StaffDelegate
{
  long insertStaffEntity(final StaffEntity staffEntity);

  long setStaffEntity(StaffEntity staffEntity);

  void deleteStaffEntityById(int id);

  StaffEntity retrieveStaffEntityById(int id);

  void updateStaffEntity(StaffEntity staffEntity);

}