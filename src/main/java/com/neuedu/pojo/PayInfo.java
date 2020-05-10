package com.neuedu.pojo;

public class PayInfo {
    private String out_trade_no;
    //付款金额，必填
    private String total_amount;
    //订单名称，必填
    private String subject;
    //商品描述，可空
    private String body;

    private String product_code = "FAST_INSTANT_TRADE_PAY";

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getProduct_code() {
        return product_code;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
