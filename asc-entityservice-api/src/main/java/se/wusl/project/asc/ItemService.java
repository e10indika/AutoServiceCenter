package se.wusl.project.asc;

import java.util.List;

public interface ItemService
{
  long saveItemEntity(ItemEntity itemEntity);

  ItemEntity getItemEntityById(int id);
  
  ItemEntity[] getItemEntitiesByIds(int[] ids);

  boolean deleteItemEntityById(int id);
  
  boolean deleteItemByIds(int[] ids);

  void updateItemEntity(ItemEntity itemEntity);
  
  List<ItemEntity> getAll();
}
