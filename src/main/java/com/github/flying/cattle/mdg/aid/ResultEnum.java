/**
 * @author tiangang
 * @date 2018年10月29日 
 */
package com.github.flying.cattle.mdg.aid;

/**
 * @author tiangang
 *
 */
public enum ResultEnum {
    PROB_NOT_LARGER("0025", "奖品概率不能多于2位小数"),
    VOTE_NOT_SET("0024", "投票未设置，不能设置开奖时间"),
    STOCK_SURPLUS_FAILE("0023", "当前剩余库存不足，不能减少总库存"),
    STOCK_OFFER_FAILE("0022", "奖品库存不能大于offer剩余库存"),
    STOCK_NOT_RIGHT("0021", "每日库存必须小于或等于总库存"),
    PARAM_NOT_NULL("0020", "红点数据项不能为空"),
    POINT_ITEM_ERROR("0019", "积分项创建失败"),
    UN_SHELF("0018", "活动未上架"),
    HAVE_SHELFED("0017", "活动已下架"),
    NOT_START("0016", "活动未开始"),
    HAVE_END("0015", "活动已结束"),
    NO_CHANCE("0013", "剩余抽奖机会数不足"),
    UP_CHANCE_LIMIT("0012", "附加机会上限必须大于或等于每日成功分享次数"),
    NO_POINTS_ENOUGH("0011", "剩余积分不足"),
    DEDUCT_POINTS_FAILE("0010", "积分扣除失败"),
    REFUSE_JOIN_LOTTERY("0009", "经验证您不能参与抽奖活动"),
    RISK_LEVEL_HIGH("0008", "高风险等级，需要验明真身"),
    DEFAULT_PRIZE_ERROR("0007", "默认奖品只能设置1个"),
    PRIZE_NUM_NOT_ENOUGH("0006", "奖品数量不足8个"),
    NO_ACTIVITY("0005", "没有该活动"),
    DATA_SUM_NOT_100("0004", "概率之和不等于100"),
    DATA_LESS_THAN_ZERO("0003", "数据不能小于0"),
    PARAM_ERROR("0002", "亲，参数不全"),
    FAILE("9999", "操作失败"),
    SUCESS("0000", "操作成功"),
    NO_LOGIN("-1", "用户未登录");

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
