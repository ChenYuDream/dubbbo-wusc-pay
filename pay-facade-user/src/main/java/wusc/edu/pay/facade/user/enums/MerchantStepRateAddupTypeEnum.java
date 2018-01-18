package wusc.edu.pay.facade.user.enums;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 商户阶梯费率－统计类型
 * 
 * @author zhangwensi
 * 
 */
public enum MerchantStepRateAddupTypeEnum {

	Day {
		@Override
        public String getDesc() {
			return "天";
		}
	},
	Week {
		@Override
        public String getDesc() {
			return "周";
		}
	},
	Month {
		@Override
        public String getDesc() {
			return "月";
		}
	},
	Quarter {
		@Override
        public String getDesc() {
			return "季度";
		}
	},
	Year {
		@Override
        public String getDesc() {
			return "年";
		}
	},
	All {
		@Override
        public String getDesc() {
			return "总计";
		}
	};

	public static Map<String, String> toStringMap() {
		MerchantStepRateAddupTypeEnum[] type = values();
		Map<String, String> map = new LinkedHashMap<String, String>();
		if (type != null) {
			for (MerchantStepRateAddupTypeEnum e : type) {
				map.put(e.toString(), e.getDesc());
			}
		}
		return map;
	}

	public abstract String getDesc();

}
