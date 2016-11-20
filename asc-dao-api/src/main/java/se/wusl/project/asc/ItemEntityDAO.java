package se.wusl.project.asc;

import java.util.List;

public interface ItemEntityDAO
{
  long save(ItemEntity itemEntity);

  void update(ItemEntity itemEntity);

  boolean deleteById(int id);

  boolean deleteByIds(int[] ids);

  ItemEntity getById(int id);

  ItemEntity[] getByIds(int[] ids);

  List<ItemEntity> getAll();
}
