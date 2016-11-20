package se.wusl.project.asc;

import java.util.List;

public interface AccountEntityDAO
{
  long save(AccountEntity accountEntity);
  
  void update(AccountEntity accountEntity);
  
  boolean deleteById(int id);
  
  boolean deleteByIds(int[] ids);
  
  AccountEntity getById(int id);
  
  AccountEntity[] getByIds(int[] ids);
  
  List<AccountEntity> getAll();
}
