package core.enums;

/**
 * 卡券的投放状态
 *
 * @author Hystar
 * @date 2018/7/13
 */
public enum CardPutStatusEnum {
    WAIT_PUTTING(0, "待投放"),
    ALREADY_PUTTING(1, "已投放"),
    ;

    private Integer key;
    private String value;

    CardPutStatusEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
