package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ItemFacadeImpl implements ItemFacade
{
  @Autowired
  private ItemService itemService;
  
  /**
   * @return the itemService
   */
  public ItemService getItemService()
  {
    return itemService;
  }

  /**
   * @param itemService the itemService to set
   */
  public void setItemService(ItemService itemService)
  {
    this.itemService = itemService;
  }

  public long saveItemEntity(ItemEntity itemEntity)
  {
    // TODO Auto-generated method stub
    return itemService.saveItemEntity(itemEntity);
  }

  public ItemEntity getItemEntityById(int id)
  {
    // TODO Auto-generated method stub
    return itemService.getItemEntityById(id);
  }

  public ItemEntity[] getItemEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return itemService.getItemEntitiesByIds(ids);
  }

  public boolean deleteItemEntityById(int id)
  {
    // TODO Auto-generated method stub
    return itemService.deleteItemEntityById(id);
  }

  public boolean deleteItemByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return itemService.deleteItemByIds(ids);
  }

  public void updateItemEntity(ItemEntity itemEntity)
  {
    // TODO Auto-generated method stub
    itemService.updateItemEntity(itemEntity);
  }

  public List<ItemEntity> getAll()
  {
    // TODO Auto-generated method stub
    return itemService.getAll();
  }

}
