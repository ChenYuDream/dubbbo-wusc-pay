package wusc.edu.pay.facade.payrule.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import wusc.edu.pay.common.page.PageBean;
import wusc.edu.pay.common.page.PageParam;
import wusc.edu.pay.core.payrule.dao.FrpDao;
import wusc.edu.pay.facade.payrule.entity.Frp;
import wusc.edu.pay.facade.payrule.exceptions.PayruleBizException;
import wusc.edu.pay.facade.payrule.service.FrpFacade;


/**
 * 支付渠道
 * 
 * @author xiehui
 * @time 2013-9-29,上午10:49:16
 */
@Component("frpFacade")
public class FrpFacadeImpl implements FrpFacade {
	@Autowired
	private FrpDao frpDao;

	@Override
    public long create(Frp frp) {
		return frpDao.insert(frp);
	}

	@Override
    public long update(Frp frp) {
		return frpDao.update(frp);
	}

	@Override
    public Frp getById(long id) {
		return frpDao.getById(id);
	}

	@Override
    public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return frpDao.listPage(pageParam, paramMap);
	}

	@Override
    public Frp findByFrpCode(String frpCode) {
		return frpDao.getByFrpCode(frpCode);
	}

	@Override
    @SuppressWarnings("rawtypes")
	public List listAll() throws PayruleBizException {
		return frpDao.listAll();
	}

	/***
	 * 根据map查询支付渠道列表
	 * 
	 * @param map
	 * @return
	 */
	@Override
    @SuppressWarnings("rawtypes")
	public List listByMap(Map<String, Object> map) {
		return frpDao.listByMap(map);
	}

	@Override
    public List<Frp> listByPayType(Integer payType) {
		return frpDao.listByPayType(payType);
	}

}
