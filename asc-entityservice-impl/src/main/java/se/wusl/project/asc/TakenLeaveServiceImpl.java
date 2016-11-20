package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class TakenLeaveServiceImpl implements TakenLeaveService
{
  @Autowired
  private TakenLeaveEntityDAO takenLeaveEntityDAO;

  private static final TakenLeaveService instance = new TakenLeaveServiceImpl();

  private TakenLeaveServiceImpl()
  {
  }

  /**
   * @return the takenLeaveEntityDAO
   */
  public TakenLeaveEntityDAO getTakenLeaveEntityDAO()
  {
    return takenLeaveEntityDAO;
  }

  /**
   * @param takenLeaveEntityDAO the takenLeaveEntityDAO to set
   */
  public void setTakenLeaveEntityDAO(TakenLeaveEntityDAO takenLeaveEntityDAO)
  {
    this.takenLeaveEntityDAO = takenLeaveEntityDAO;
  }

  /**
   * @return the instance
   */
  public TakenLeaveService getInstance()
  {
    return instance;
  }

  public long saveTakenLeaveEntity(TakenLeaveEntity takenLeaveEntity)
  {
    // TODO Auto-generated method stub
    return takenLeaveEntityDAO.save(takenLeaveEntity);
  }

  public TakenLeaveEntity getTakenLeaveEntityById(int id)
  {
    // TODO Auto-generated method stub
    return takenLeaveEntityDAO.getById(id);
  }

  public TakenLeaveEntity[] getTakenLeaveEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return takenLeaveEntityDAO.getByIds(ids);
  }

  public boolean deleteTakenLeaveEntityById(int id)
  {
    // TODO Auto-generated method stub
    return takenLeaveEntityDAO.deleteById(id);
  }

  public boolean deleteTakenLeaveByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return takenLeaveEntityDAO.deleteByIds(ids);
  }

  public void updateTakenLeaveEntity(TakenLeaveEntity takenLeaveEntity)
  {
    // TODO Auto-generated method stub
    takenLeaveEntityDAO.update(takenLeaveEntity);
  }

  public List<TakenLeaveEntity> getAll()
  {
    // TODO Auto-generated method stub
    return takenLeaveEntityDAO.getAll();
  }

}
