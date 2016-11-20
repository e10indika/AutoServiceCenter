package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class TakenLeaveFacadeImpl implements TakenLeaveFacade
{
  @Autowired
  private TakenLeaveService takenLeaveService;
  
  /**
   * @return the takenLeaveService
   */
  public TakenLeaveService getTakenLeaveService()
  {
    return takenLeaveService;
  }

  /**
   * @param takenLeaveService the takenLeaveService to set
   */
  public void setTakenLeaveService(TakenLeaveService takenLeaveService)
  {
    this.takenLeaveService = takenLeaveService;
  }

  public long saveTakenLeaveEntity(TakenLeaveEntity takenLeaveEntity)
  {
    // TODO Auto-generated method stub
    return 0;
  }

  public TakenLeaveEntity getTakenLeaveEntityById(int id)
  {
    // TODO Auto-generated method stub
    return null;
  }

  public TakenLeaveEntity[] getTakenLeaveEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return null;
  }

  public boolean deleteTakenLeaveEntityById(int id)
  {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean deleteTakenLeaveByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return false;
  }

  public void updateTakenLeaveEntity(TakenLeaveEntity takenLeaveEntity)
  {
    // TODO Auto-generated method stub

  }

  public List<TakenLeaveEntity> getAll()
  {
    // TODO Auto-generated method stub
    return null;
  }

}
