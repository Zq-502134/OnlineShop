package com.neuedu.utils;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016102300744243";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCvW89rNK1R9CEGVhRLTMuL9NJNRFeTaNHaVis6y2eZ+DGjpQfqaPT0iSqFin5gwRADOIeYSBKS2PxLkRqeYyTZU4bVKBGCg5H0L4MQo9ZMZLPqm7PYl88n4PUPII7FnoKUBE/xiTrU4/kK5sxBz1uG7iVm0dcX0nwkfRM9LhwzjU+KeVV3eRbM9LCmRF4A79FXmhoIVQ6IsCjcpJ5b5iCazryJGvmcchjdYV/Ptih6+3liBO/FLukdC4ZunmnfBVOk86g3opnDpm5sbLj87iVc4IK6mDll3+iMaDdSRlyqIooWgHs9DrPfnG6sYLIHD7WDBZVV/4fyKYmMQTmQa7KjAgMBAAECggEAZU7fSApIz34Azk5QrygQuCyairUe+zSleEQr+W2lztgKpYYkSpKUYeoUvM3EMVWYUKQKAjoxMNFXALk17adNlJii3ualJwen/LCuQaDFn6DWKIYHouwha+KU8UZX9Web/LN5FAu6B2AlctzfyG1pbUyMIxi78TFTMylnQgMvm7/iCY5x+E4PpW2/6u+0MEtMzouwoKSJHntVCCgIxZHlBID0cGKvsQ1E6wG5+tjJDit9IEs5j10gJ9HU7y3b7Edbxu9XNqrlvg9GxNx4Gk5v98MWtPIobY/HYWYW6wdoCe5d6xnoGW+bsFCh8dGt3z46GxWx7ByksDksFKsAfssfgQKBgQD38h7x1k/OHS2YGK5yy/cS1bCGUuXmX2ygo7/ryEqZqcIXUEAm5HtMRhQV9cDcGbPbi74wDZq7eS9jiZAQ0bg4440DdELLUzOGakT4eT354g/PUFZAcYlgYrOGvWb9ji62GPXN9i6ncfPRXFR9ayE+Mn+STL2A9lVsF9bazWhcwwKBgQC1DhDUEQWHreN8E4Ega0vSHdcjMmP2LI9wWC2J4CtIsYh0Jv9AxNTNlwADN80b+bfxDskmch8Bq8xBZTTJJDayZelk/ViAVrHPB+hZw1Khfeeh4DKZ7oIffRBb0Cd+sHvsKMMBNClgA2T1TW1Cu/Prj6Yz7CBBZXTAEUJSQSt0oQKBgHzKvupnPCl4JA+ONJcQs10mcj9ZD98AHjNH13u7hliKyWZkfLVWf/wmtUtMMnJU+WJBlkqnPj6nQsOtY/YjJ75yQPIBHPErAh7f87C/jQLs1Zo5TAAJZOQ/KS5iu6hYXIhITccI5fhe8SFpgBjTx5p/XhfrSeHTmbDa2serZKBzAoGBAJlkhVVl5m2BIU4pqCizPtWReofTVWVnc08XJd2+Em3QG29s6q0RFcnouJYBXMDq3LBaeokb/rEHwFFXUVVoXP7f4NEy4xw4VwS0CmKiXQt9BBXdQIGx1IShDI7817k6BIOcNTp72uIBfjNlmcAERS+50HIFB37gWf2voaTWmd6BAoGAcLwMqCJYbawexakwuTlbFzqHdYmTPMZmnpZxvnpWdfoUS7qJCf/SNU7d7++z/+lG7EP+rHMBNKOpkB+WV+rxfl5wp4r+5Fye0p9pZqhKpDkxkbIS1c7PkJaVtpKwycnw1lnI6P8QnfJHT51G0zmUYH43A+a9I12cHCl/rNMmtnA=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAt4SE66WXgHSZuOddaJm0vYrynMGSLSQyU6SHyaGQW0MbRF0TVSF+8G4RZ1RUwJWxImi6d8pZK6obwEkuGNIc5Qpe6nb+0o44TcBfCb/XBvRG5eRkH2pTx6L3eHFr5Z3l9RZJaOlaLKd8T9yHX6tl3Ebeiu8HCBacjiwIwsu4iOfEmEJ4nu1jM/WeSy3z94WUb433RJ/dGVNtaGJol5vzeJW+Pyo+N+ieCjrtqpCCsvMwuOFvS0npw28tzxyZ/zYvD4qF5/MSa6YgdSL9PdeHuu6mI8YanyUa1j8wdz3BRVwZOCytIQh3AzPNhTr56PN6IWvQF1DqnaaNzTv6GsJvZwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//	public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";
    public static String notify_url = "http://localhost:9090/notify_url";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:9090/#/PaySuccess";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

