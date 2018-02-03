package freight.DO;



/**
 * <p>创建时间: 2018/1/14</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public class Message {
    private String msg;
    private String event;

    public Message(String msg, String event) {
        this.msg = msg;
        this.event = event;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
