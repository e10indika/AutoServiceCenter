package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class LeaveServiceImpl implements LeaveService
{
  @Autowired
  private LeaveEntityDAO leaveEntityDAO;

  private static final LeaveService instance = new LeaveServiceImpl();

  private LeaveServiceImpl()
  {

  }

  /**
   * @return the leaveEntityDAO
   */
  public LeaveEntityDAO getLeaveEntityDAO()
  {
    return leaveEntityDAO;
  }

  /**
   * @param leaveEntityDAO the leaveEntityDAO to set
   */
  public void setLeaveEntityDAO(LeaveEntityDAO leaveEntityDAO)
  {
    this.leaveEntityDAO = leaveEntityDAO;
  }

  /**
   * @return the instance
   */
  public LeaveService getInstance()
  {
    return instance;
  }

  public long saveLeaveEntity(LeaveEntity leaveEntity)
  {
    return leaveEntityDAO.save(leaveEntity);
  }

  public LeaveEntity getLeaveEntityById(int id)
  {
    return leaveEntityDAO.getById(id);
  }

  public LeaveEntity[] getLeaveEntitiesByIds(int[] ids)
  {
    return leaveEntityDAO.getByIds(ids);
  }

  public boolean deleteLeaveEntityById(int id)
  {
    return leaveEntityDAO.deleteById(id);
  }

  public boolean deleteLeaveByIds(int[] ids)
  {
    return leaveEntityDAO.deleteByIds(ids);
  }

  public void updateLeaveEntity(LeaveEntity leaveEntity)
  {
    leaveEntityDAO.update(leaveEntity);
  }

  public List<LeaveEntity> getAll()
  {
    return leaveEntityDAO.getAll();
  }

}
