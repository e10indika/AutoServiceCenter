package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class AccountFacadeImpl implements AccountFacade
{
  @Autowired
  private AccountService accountService;

  /**
   * @return the accountService
   */
  public AccountService getAccountService()
  {
    return accountService;
  }

  /**
   * @param accountService the accountService to set
   */
  public void setAccountService(AccountService accountService)
  {
    this.accountService = accountService;
  }

  public long saveAccountEntity(AccountEntity accountEntity)
  {
    // TODO Auto-generated method stub
    return accountService.saveAccountEntity(accountEntity);
  }

  public AccountEntity getAccountEntityById(int id)
  {
    // TODO Auto-generated method stub
    return accountService.getAccountEntityById(id);
  }

  public AccountEntity[] getAccountEntitiesByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return accountService.getAccountEntitiesByIds(ids);
  }

  public boolean deleteAccountEntityById(int id)
  {
    // TODO Auto-generated method stub
    return accountService.deleteAccountEntityById(id);
  }

  public boolean deleteAccountByIds(int[] ids)
  {
    // TODO Auto-generated method stub
    return accountService.deleteAccountByIds(ids);
  }

  public void updateAccountEntity(AccountEntity accountEntity)
  {
    // TODO Auto-generated method stub
    accountService.updateAccountEntity(accountEntity);
  }

  public List<AccountEntity> getAll()
  {
    // TODO Auto-generated method stub
    return accountService.getAll();
  }
}
