package wusc.edu.pay.facade.remit.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import wusc.edu.pay.common.page.PageBean;
import wusc.edu.pay.common.page.PageParam;
import wusc.edu.pay.core.remit.biz.RemitChannelBiz;
import wusc.edu.pay.facade.remit.entity.RemitChannel;
import wusc.edu.pay.facade.remit.exceptions.RemitBizException;
import wusc.edu.pay.facade.remit.service.RemitChannelFacade;


/**
 * @Title: 打款通道接口服务实现类
 * @Description:
 * @author zzh
 * @date 2014-7-22 下午4:06:24
 */
@Component("remitChannelFacade")
public class RemitChannelFacadeImpl implements RemitChannelFacade {
	@Autowired
	private RemitChannelBiz remitChannelBiz;

	@Override
    public long create(RemitChannel remitChannel) {
		return remitChannelBiz.create(remitChannel);
	}

	@Override
    public long update(RemitChannel remitChannel) {
		return remitChannelBiz.update(remitChannel);
	}

	@Override
    public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return remitChannelBiz.listPage(pageParam, paramMap);
	}

	@Override
    public RemitChannel getById(long id) {
		return remitChannelBiz.getById(id);
	}

	@Override
    public void deleteById(long id) {
		remitChannelBiz.deleteById(id);
	}

	@Override
    public List<RemitChannel> getAllOpenChannel() {
		return remitChannelBiz.getAllOpenChannel();
	}

	@Override
    public List<RemitChannel> listBy(Map<String, Object> paramMap) {
		return remitChannelBiz.listBy(paramMap);
	}

	@Override
    public RemitChannel getByChannelCode(String channelCode) throws RemitBizException {
		return remitChannelBiz.getByChannelCode(channelCode);
	}
}
