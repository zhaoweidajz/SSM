package zwd.dao;

import zwd.domain.Account;

import java.util.List;

/**
 * 账户持久层接口
 * @author ghy
 */
public interface AccountDao {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Account findById(Integer id);

    /**
     * 新增
     * @param account
     */
    void insert(Account account);

    /**
     * 更新
     * @param account
     * @return
     */
    int update(Account account);

    /**
     * 根据ID删除
     * @param id
     * @return
     */
    boolean delete(Integer id);
}
