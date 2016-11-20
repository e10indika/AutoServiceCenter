package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ItemServiceImpl implements ItemService
{
  @Autowired
  private ItemEntityDAO itemEntityDAO;

  private static final ItemService instance = new ItemServiceImpl();

  private ItemServiceImpl()
  {

  }

  /**
   * @return the itemEntityDAO
   */
  public ItemEntityDAO getItemEntityDAO()
  {
    return itemEntityDAO;
  }

  /**
   * @param itemEntityDAO the itemEntityDAO to set
   */
  public void setItemEntityDAO(ItemEntityDAO itemEntityDAO)
  {
    this.itemEntityDAO = itemEntityDAO;
  }

  /**
   * @return the instance
   */
  public ItemService getInstance()
  {
    return instance;
  }

  public long saveItemEntity(ItemEntity itemEntity)
  {
    return itemEntityDAO.save(itemEntity);

  }

  public ItemEntity getItemEntityById(int id)
  {
    return itemEntityDAO.getById(id);
  }

  public ItemEntity[] getItemEntitiesByIds(int[] ids)
  {
    return itemEntityDAO.getByIds(ids);
  }

  public boolean deleteItemEntityById(int id)
  {
    return itemEntityDAO.deleteById(id);
  }

  public boolean deleteItemByIds(int[] ids)
  {
    return itemEntityDAO.deleteByIds(ids);
  }

  public void updateItemEntity(ItemEntity itemEntity)
  {
    itemEntityDAO.update(itemEntity);
  }

  public List<ItemEntity> getAll()
  {
    return itemEntityDAO.getAll();
  }

}
