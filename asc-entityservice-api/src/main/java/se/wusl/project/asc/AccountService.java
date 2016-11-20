package se.wusl.project.asc;

import java.util.List;

public interface AccountService
{
  List<AccountEntity> saveAndGetAllAccountEntities(final AccountEntity accountEntity);

  long saveAccountEntity(AccountEntity accountEntity);

  AccountEntity getAccountEntityById(int id);
  
  AccountEntity[] getAccountEntitiesByIds(int[] ids);

  boolean deleteAccountEntityById(int id);
  
  boolean deleteAccountByIds(int[] ids);

  void updateAccountEntity(AccountEntity accountEntity);
  
  List<AccountEntity> getAll();
}
