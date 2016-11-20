package se.wusl.project.asc;

public interface StaffPM 
{
  long setStaffEntity(StaffEntity staffEntity);

  void deleteStaffEntityById(int id);

  StaffEntity retrieveStaffEntityById(int id);

  void updateStaffEntity(StaffEntity staffEntity);
}
