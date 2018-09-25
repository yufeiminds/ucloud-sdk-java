package cn.ucloud.client;

import cn.ucloud.model.ResetUHostInstancePasswordParam;
import cn.ucloud.model.ResetUHostInstancePasswordResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 14:46
 **/
public class ResetUHostInstancePasswordTest {

    private UhostClient client;

    private ResetUHostInstancePasswordParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new ResetUHostInstancePasswordParam("cn-bj2","uhost-uvzzyt");
        param.setProjectId("org-4nfe1i");
        param.setPassword("123456ab");
    }
    @Test
    public void resetUHostInstancePassword() {
        try {
            ResetUHostInstancePasswordResult resetUHostInstancePasswordResult = client.resetUHostInstancePassword(param);
            System.out.println(resetUHostInstancePasswordResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}