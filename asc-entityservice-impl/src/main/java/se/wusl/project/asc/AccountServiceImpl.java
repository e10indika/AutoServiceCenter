package se.wusl.project.asc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl implements AccountService
{
  @Autowired
  AccountEntityDAO accountEntityDAO;
  
  private static final AccountService instance = new AccountServiceImpl();
  
  private AccountServiceImpl()
  {    
  }
  
  /**
   * @return the accountEntityDAO
   */
  public AccountEntityDAO getAccountEntityDAO()
  {
    return accountEntityDAO;
  }

  /**
   * @param accountEntityDAO the accountEntityDAO to set
   */
  public void setAccountEntityDAO(AccountEntityDAO accountEntityDAO)
  {
    this.accountEntityDAO = accountEntityDAO;
  }

  /**
   * @return the instance
   */
  public AccountService getInstance()
  {
    return instance;
  }
  
  public AccountEntity getAccountEntityById(int id)
  {
    return accountEntityDAO.getById(id);
  }

  public AccountEntity[] getAccountEntitiesByIds(int[] ids)
  {
    return accountEntityDAO.getByIds(ids);
  }

  public boolean deleteAccountEntityById(int id)
  {
    return accountEntityDAO.deleteById(id);
  }

  public boolean deleteAccountByIds(int[] ids)
  {
    return accountEntityDAO.deleteByIds(ids);
  }

  public void updateAccountEntity(AccountEntity accountEntity)
  {
    accountEntityDAO.update(accountEntity);
  }

  public List<AccountEntity> saveAndGetAllAccountEntities(AccountEntity accountEntity)
  {
    accountEntityDAO.save(accountEntity);
    return accountEntityDAO.getAll();
  }

  public long saveAccountEntity(AccountEntity accountEntity)
  {
    return accountEntityDAO.save(accountEntity);
  }

  public List<AccountEntity> getAll()
  {
    return accountEntityDAO.getAll();
  }

}
