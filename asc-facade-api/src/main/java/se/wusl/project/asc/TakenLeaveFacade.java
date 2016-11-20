package se.wusl.project.asc;

import java.util.List;

public interface TakenLeaveFacade
{
  long saveTakenLeaveEntity(TakenLeaveEntity takenLeaveEntity);

  TakenLeaveEntity getTakenLeaveEntityById(int id);

  TakenLeaveEntity[] getTakenLeaveEntitiesByIds(int[] ids);

  boolean deleteTakenLeaveEntityById(int id);

  boolean deleteTakenLeaveByIds(int[] ids);

  void updateTakenLeaveEntity(TakenLeaveEntity takenLeaveEntity);

  List<TakenLeaveEntity> getAll();
}
