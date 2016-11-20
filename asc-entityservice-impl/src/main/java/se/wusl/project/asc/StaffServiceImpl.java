package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class StaffServiceImpl implements StaffService
{
  @Autowired
  StaffEntityDAO staffEntityDAO;
  
  private static StaffService instance = new StaffServiceImpl();
  
  public StaffEntityDAO getStaffEntityDAO() {
    return staffEntityDAO;
  }

  public void setStaffEntityDAO(StaffEntityDAO staffEntityDAO) {
    this.staffEntityDAO = staffEntityDAO;
  }
  
  private StaffServiceImpl()
  {    
  }
  
  public static StaffService getInstance()
  {
    return instance;
  }

  public long saveStaffEntity(StaffEntity staffEntity)
  {
    return staffEntityDAO.save(staffEntity);
  }

  public StaffEntity getStaffEntityById(int id)
  {
    return staffEntityDAO.getById(id);
  }

  public boolean deleteStaffEntityById(int id)
  {
    return staffEntityDAO.deleteById(id);
  }

  public void updateStaffEntity(StaffEntity staffEntity)
  {
    staffEntityDAO.update(staffEntity);
  }

  public StaffEntity[] getStaffEntitiesByIds(int[] ids)
  {
    return staffEntityDAO.getByIds(ids);
  }

  public boolean deleteStaffByIds(int[] ids)
  {
    return staffEntityDAO.deleteByIds(ids);
  }

  public List<StaffEntity> getAll()
  {
    // TODO Auto-generated method stub
    return null;
  }
}
