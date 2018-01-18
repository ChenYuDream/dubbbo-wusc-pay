package wusc.edu.pay.facade.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import wusc.edu.pay.common.page.PageBean;
import wusc.edu.pay.common.page.PageParam;
import wusc.edu.pay.core.user.biz.MerchantActionBiz;
import wusc.edu.pay.facade.user.entity.MerchantRoleOperator;
import wusc.edu.pay.facade.user.service.MerchantRoleOperatorFacade;


/**
 * 
 * @author huqian
 * 
 */
@Component("merchantRoleOperatorFacade")
public class MerchantRoleOperatorFacadeImpl implements MerchantRoleOperatorFacade {
	@Autowired
	private MerchantActionBiz merchantActionBiz;

	
	@Override
    public long create(MerchantRoleOperator merchantRoleOperator) {
		return merchantActionBiz.createMerchantRoleOperator(merchantRoleOperator);
	}

	
	@Override
    public long update(MerchantRoleOperator merchantRoleOperator) {
		return merchantActionBiz.updateMerchantRoleOperator(merchantRoleOperator);
	}

	
	@Override
    public MerchantRoleOperator getById(long id) {
		return merchantActionBiz.getMerchantRoleOperatorById(id);
	}

	
	@Override
    public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return merchantActionBiz.listPageForMerchantRoleOperator(pageParam, paramMap);
	}

	
	@Override
    public String getRoleStrByOperatorId(Long id) {
		return merchantActionBiz.getRoleStrByOperatorId(id);
	}

	/**
	 * 根据角色ID查集合 getByRoleId: <br/>
	 * 
	 * @param roleId
	 * @return
	 */
	@Override
    @SuppressWarnings("rawtypes")
	public List listByRoleId(long roleId) {
		return merchantActionBiz.listMerchantRoleOperatorByRoleId(roleId);
	}

}
