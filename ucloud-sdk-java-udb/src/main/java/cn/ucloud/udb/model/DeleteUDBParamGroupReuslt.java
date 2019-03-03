package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 删除配置 结果类
 * @Author : codezhang
 * @Date : 2019-03-03 15:59
 **/
public class DeleteUDBParamGroupReuslt extends BaseResponseResult {


    @Override
    public String toString() {
        return "DeleteUDBParamGroupReuslt{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
