package cn.ucloud.udb.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udb.model.StartDBTransferTaskParam;
import cn.ucloud.udb.model.StartDBTransferTaskResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-08 14:37
 **/
public class StartDBTransferTaskTest {

    private UDBClient client;

    private StartDBTransferTaskParam param;
    // taskId
    // 16ed874b-59a4-443c-b5e3-2784cab13cdb
    // 39c27da5-8bc9-45b4-a5bc-172189a0f0c4

    @Before
    public void setUp() throws Exception {
        client = GetUDBClient.getUDBClient();
        param = new StartDBTransferTaskParam("cn-sh2", "cn-sh2-02",
                "16ed874b-59a4-443c-b5e3-2784cab13cdb");
        param.setProjectId("org-izug1m");
    }

    // todo 测试 没有权限

    @Test
    public void startUDBInstance() {
        try {
            StartDBTransferTaskResult result = client.startDBTransferTask(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void startUDBInstanceCallback() {
        client.startDBTransferTask(param, new UcloudHandler<StartDBTransferTaskResult>() {
            @Override
            public Object success(StartDBTransferTaskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(StartDBTransferTaskResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNull(e);
                return null;
            }
        }, false);
    }
}