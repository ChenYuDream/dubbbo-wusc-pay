package wusc.edu.pay.web.permission.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import wusc.edu.pay.common.core.dao.BaseDaoImpl;
import wusc.edu.pay.web.permission.dao.PmsRoleActionDao;
import wusc.edu.pay.web.permission.entity.PmsRoleAction;


/**
 * 
 * @描述: 角色-权限点关联表数据访问层接口实现类.
 * @作者: WuShuicheng .
 * @创建时间: 2013-7-22,下午5:51:47 .
 * @版本: 1.0 .
 */
@Repository("pmsRoleActionDao")
public class PmsRoleActionDaoImpl extends BaseDaoImpl<PmsRoleAction> implements PmsRoleActionDao {

	/**
	 * 根据角色ID找到角色关联的权限点.
	 * 
	 * @param roleId
	 *            .
	 * @return roleActionList .
	 */
	@Override
    public List<PmsRoleAction> listByRoleId(final long roleId) {
		return super.getSqlSession().selectList(getStatement("listByRoleId"), roleId);
	}
	
	/**
	 * 根据角色ID字符串获取相应角色-权限关联信息.
	 * 
	 * @param roleIds
	 * @return
	 */
	@Override
    public List<PmsRoleAction> listByRoleIds(String roleIdsStr) {
		List<String> roldIds = Arrays.asList(roleIdsStr.split(","));
		return super.getSqlSession().selectList(getStatement("listByRoleIds"), roldIds);
	}

	/**
	 * 根据权限ID查找权限所关联的角色.
	 * 
	 * @param actionId
	 *            .
	 * @return roleActionList.
	 */
	@Override
    public List<PmsRoleAction> listByActionId(long actionId) {
		return super.getSqlSession().selectList(getStatement("listByActionId"), actionId);
	}

	/**
	 * 根据权限ID删除权限与角色的关联关系.
	 * 
	 * @param actionId
	 *            .
	 */
	@Override
    public void deleteByActionId(long actionId) {
		super.getSqlSession().delete(getStatement("deleteByActionId"), actionId);
	}

	/**
	 * 根据角色ID删除角色与权限的关联记录.
	 * 
	 * @param roleId
	 *            .
	 */

	@Override
    public void deleteByRoleId(long roleId) {
		super.getSqlSession().delete(getStatement("deleteByRoleId"), roleId);
	}

}
