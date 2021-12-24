/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.uhost.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uhost.models.CopyCustomImageRequest;
import cn.ucloud.uhost.models.CopyCustomImageResponse;
import cn.ucloud.uhost.models.CreateCustomImageRequest;
import cn.ucloud.uhost.models.CreateCustomImageResponse;
import cn.ucloud.uhost.models.CreateIsolationGroupRequest;
import cn.ucloud.uhost.models.CreateIsolationGroupResponse;
import cn.ucloud.uhost.models.CreateUHostInstanceRequest;
import cn.ucloud.uhost.models.CreateUHostInstanceResponse;
import cn.ucloud.uhost.models.CreateUHostKeyPairRequest;
import cn.ucloud.uhost.models.CreateUHostKeyPairResponse;
import cn.ucloud.uhost.models.DeleteIsolationGroupRequest;
import cn.ucloud.uhost.models.DeleteIsolationGroupResponse;
import cn.ucloud.uhost.models.DeleteUHostKeyPairsRequest;
import cn.ucloud.uhost.models.DeleteUHostKeyPairsResponse;
import cn.ucloud.uhost.models.DescribeImageRequest;
import cn.ucloud.uhost.models.DescribeImageResponse;
import cn.ucloud.uhost.models.DescribeIsolationGroupRequest;
import cn.ucloud.uhost.models.DescribeIsolationGroupResponse;
import cn.ucloud.uhost.models.DescribeUHostInstanceRequest;
import cn.ucloud.uhost.models.DescribeUHostInstanceResponse;
import cn.ucloud.uhost.models.DescribeUHostKeyPairsRequest;
import cn.ucloud.uhost.models.DescribeUHostKeyPairsResponse;
import cn.ucloud.uhost.models.DescribeUHostTagsRequest;
import cn.ucloud.uhost.models.DescribeUHostTagsResponse;
import cn.ucloud.uhost.models.GetAttachedDiskUpgradePriceRequest;
import cn.ucloud.uhost.models.GetAttachedDiskUpgradePriceResponse;
import cn.ucloud.uhost.models.GetUHostInstancePriceRequest;
import cn.ucloud.uhost.models.GetUHostInstancePriceResponse;
import cn.ucloud.uhost.models.GetUHostInstanceVncInfoRequest;
import cn.ucloud.uhost.models.GetUHostInstanceVncInfoResponse;
import cn.ucloud.uhost.models.GetUHostUpgradePriceRequest;
import cn.ucloud.uhost.models.GetUHostUpgradePriceResponse;
import cn.ucloud.uhost.models.ImportCustomImageRequest;
import cn.ucloud.uhost.models.ImportCustomImageResponse;
import cn.ucloud.uhost.models.ImportUHostKeyPairsRequest;
import cn.ucloud.uhost.models.ImportUHostKeyPairsResponse;
import cn.ucloud.uhost.models.LeaveIsolationGroupRequest;
import cn.ucloud.uhost.models.LeaveIsolationGroupResponse;
import cn.ucloud.uhost.models.ModifyUHostIPRequest;
import cn.ucloud.uhost.models.ModifyUHostIPResponse;
import cn.ucloud.uhost.models.ModifyUHostInstanceNameRequest;
import cn.ucloud.uhost.models.ModifyUHostInstanceNameResponse;
import cn.ucloud.uhost.models.ModifyUHostInstanceRemarkRequest;
import cn.ucloud.uhost.models.ModifyUHostInstanceRemarkResponse;
import cn.ucloud.uhost.models.ModifyUHostInstanceTagRequest;
import cn.ucloud.uhost.models.ModifyUHostInstanceTagResponse;
import cn.ucloud.uhost.models.PoweroffUHostInstanceRequest;
import cn.ucloud.uhost.models.PoweroffUHostInstanceResponse;
import cn.ucloud.uhost.models.RebootUHostInstanceRequest;
import cn.ucloud.uhost.models.RebootUHostInstanceResponse;
import cn.ucloud.uhost.models.ReinstallUHostInstanceRequest;
import cn.ucloud.uhost.models.ReinstallUHostInstanceResponse;
import cn.ucloud.uhost.models.ResetUHostInstancePasswordRequest;
import cn.ucloud.uhost.models.ResetUHostInstancePasswordResponse;
import cn.ucloud.uhost.models.ResizeAttachedDiskRequest;
import cn.ucloud.uhost.models.ResizeAttachedDiskResponse;
import cn.ucloud.uhost.models.ResizeUHostInstanceRequest;
import cn.ucloud.uhost.models.ResizeUHostInstanceResponse;
import cn.ucloud.uhost.models.StartUHostInstanceRequest;
import cn.ucloud.uhost.models.StartUHostInstanceResponse;
import cn.ucloud.uhost.models.StopUHostInstanceRequest;
import cn.ucloud.uhost.models.StopUHostInstanceResponse;
import cn.ucloud.uhost.models.TerminateCustomImageRequest;
import cn.ucloud.uhost.models.TerminateCustomImageResponse;
import cn.ucloud.uhost.models.TerminateUHostInstanceRequest;
import cn.ucloud.uhost.models.TerminateUHostInstanceResponse;
import cn.ucloud.uhost.models.UpgradeToArkUHostInstanceRequest;
import cn.ucloud.uhost.models.UpgradeToArkUHostInstanceResponse;

/** This client is used to call actions of **UHost** service */
public interface UHostClientInterface extends Client {

    /**
     * CopyCustomImage - 复制自制镜像
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/CopyCustomImage
     */
    public CopyCustomImageResponse copyCustomImage(CopyCustomImageRequest request)
            throws UCloudException;

    /**
     * CreateCustomImage - 创建自制镜像
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/CreateCustomImage
     */
    public CreateCustomImageResponse createCustomImage(CreateCustomImageRequest request)
            throws UCloudException;

    /**
     * CreateIsolationGroup - 创建硬件隔离组
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/CreateIsolationGroup
     */
    public CreateIsolationGroupResponse createIsolationGroup(CreateIsolationGroupRequest request)
            throws UCloudException;

    /**
     * CreateUHostInstance - 创建云主机
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/CreateUHostInstance
     */
    public CreateUHostInstanceResponse createUHostInstance(CreateUHostInstanceRequest request)
            throws UCloudException;

    /**
     * CreateUHostKeyPair - 创建主机密钥对
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/CreateUHostKeyPair
     */
    public CreateUHostKeyPairResponse createUHostKeyPair(CreateUHostKeyPairRequest request)
            throws UCloudException;

    /**
     * DeleteIsolationGroup - 删除硬件隔离组
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/DeleteIsolationGroup
     */
    public DeleteIsolationGroupResponse deleteIsolationGroup(DeleteIsolationGroupRequest request)
            throws UCloudException;

    /**
     * DeleteUHostKeyPairs - 删除主机密钥
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/DeleteUHostKeyPairs
     */
    public DeleteUHostKeyPairsResponse deleteUHostKeyPairs(DeleteUHostKeyPairsRequest request)
            throws UCloudException;

    /**
     * DescribeImage - 获取镜像列表
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/DescribeImage
     */
    public DescribeImageResponse describeImage(DescribeImageRequest request) throws UCloudException;

    /**
     * DescribeIsolationGroup - 查询硬件隔离组
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/DescribeIsolationGroup
     */
    public DescribeIsolationGroupResponse describeIsolationGroup(
            DescribeIsolationGroupRequest request) throws UCloudException;

    /**
     * DescribeUHostInstance - 获取主机信息
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/DescribeUHostInstance
     */
    public DescribeUHostInstanceResponse describeUHostInstance(DescribeUHostInstanceRequest request)
            throws UCloudException;

    /**
     * DescribeUHostKeyPairs - 查询主机密钥信息
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/DescribeUHostKeyPairs
     */
    public DescribeUHostKeyPairsResponse describeUHostKeyPairs(DescribeUHostKeyPairsRequest request)
            throws UCloudException;

    /**
     * DescribeUHostTags - 获取主机业务组列表
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/DescribeUHostTags
     */
    public DescribeUHostTagsResponse describeUHostTags(DescribeUHostTagsRequest request)
            throws UCloudException;

    /**
     * GetAttachedDiskUpgradePrice - 获取挂载磁盘的升级价格
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/GetAttachedDiskUpgradePrice
     */
    public GetAttachedDiskUpgradePriceResponse getAttachedDiskUpgradePrice(
            GetAttachedDiskUpgradePriceRequest request) throws UCloudException;

    /**
     * GetUHostInstancePrice - 获取主机价格
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/GetUHostInstancePrice
     */
    public GetUHostInstancePriceResponse getUHostInstancePrice(GetUHostInstancePriceRequest request)
            throws UCloudException;

    /**
     * GetUHostInstanceVncInfo - 获取VNC登录信息
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/GetUHostInstanceVncInfo
     */
    public GetUHostInstanceVncInfoResponse getUHostInstanceVncInfo(
            GetUHostInstanceVncInfoRequest request) throws UCloudException;

    /**
     * GetUHostUpgradePrice - 获取主机规格调整差价
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/GetUHostUpgradePrice
     */
    public GetUHostUpgradePriceResponse getUHostUpgradePrice(GetUHostUpgradePriceRequest request)
            throws UCloudException;

    /**
     * ImportCustomImage - 导入镜像
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ImportCustomImage
     */
    public ImportCustomImageResponse importCustomImage(ImportCustomImageRequest request)
            throws UCloudException;

    /**
     * ImportUHostKeyPairs - 导入密钥对的公钥部分
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ImportUHostKeyPairs
     */
    public ImportUHostKeyPairsResponse importUHostKeyPairs(ImportUHostKeyPairsRequest request)
            throws UCloudException;

    /**
     * LeaveIsolationGroup - 移除硬件隔离组中的主机
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/LeaveIsolationGroup
     */
    public LeaveIsolationGroupResponse leaveIsolationGroup(LeaveIsolationGroupRequest request)
            throws UCloudException;

    /**
     * ModifyUHostIP - 修改云主机内部 IP 地址
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ModifyUHostIP
     */
    public ModifyUHostIPResponse modifyUHostIP(ModifyUHostIPRequest request) throws UCloudException;

    /**
     * ModifyUHostInstanceName - 修改主机名
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ModifyUHostInstanceName
     */
    public ModifyUHostInstanceNameResponse modifyUHostInstanceName(
            ModifyUHostInstanceNameRequest request) throws UCloudException;

    /**
     * ModifyUHostInstanceRemark - 修改主机备注
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ModifyUHostInstanceRemark
     */
    public ModifyUHostInstanceRemarkResponse modifyUHostInstanceRemark(
            ModifyUHostInstanceRemarkRequest request) throws UCloudException;

    /**
     * ModifyUHostInstanceTag - 修改主机业务组
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ModifyUHostInstanceTag
     */
    public ModifyUHostInstanceTagResponse modifyUHostInstanceTag(
            ModifyUHostInstanceTagRequest request) throws UCloudException;

    /**
     * PoweroffUHostInstance - 模拟主机掉电
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/PoweroffUHostInstance
     */
    public PoweroffUHostInstanceResponse poweroffUHostInstance(PoweroffUHostInstanceRequest request)
            throws UCloudException;

    /**
     * RebootUHostInstance - 重启主机
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/RebootUHostInstance
     */
    public RebootUHostInstanceResponse rebootUHostInstance(RebootUHostInstanceRequest request)
            throws UCloudException;

    /**
     * ReinstallUHostInstance - 重装系统
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ReinstallUHostInstance
     */
    public ReinstallUHostInstanceResponse reinstallUHostInstance(
            ReinstallUHostInstanceRequest request) throws UCloudException;

    /**
     * ResetUHostInstancePassword - 重置主机密码
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ResetUHostInstancePassword
     */
    public ResetUHostInstancePasswordResponse resetUHostInstancePassword(
            ResetUHostInstancePasswordRequest request) throws UCloudException;

    /**
     * ResizeAttachedDisk - 修改挂载的磁盘大小
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ResizeAttachedDisk
     */
    public ResizeAttachedDiskResponse resizeAttachedDisk(ResizeAttachedDiskRequest request)
            throws UCloudException;

    /**
     * ResizeUHostInstance - 修改主机规格
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/ResizeUHostInstance
     */
    public ResizeUHostInstanceResponse resizeUHostInstance(ResizeUHostInstanceRequest request)
            throws UCloudException;

    /**
     * StartUHostInstance - 启动主机
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/StartUHostInstance
     */
    public StartUHostInstanceResponse startUHostInstance(StartUHostInstanceRequest request)
            throws UCloudException;

    /**
     * StopUHostInstance - 关闭主机
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/StopUHostInstance
     */
    public StopUHostInstanceResponse stopUHostInstance(StopUHostInstanceRequest request)
            throws UCloudException;

    /**
     * TerminateCustomImage - 删除自制镜像
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/TerminateCustomImage
     */
    public TerminateCustomImageResponse terminateCustomImage(TerminateCustomImageRequest request)
            throws UCloudException;

    /**
     * TerminateUHostInstance - 删除云主机
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/TerminateUHostInstance
     */
    public TerminateUHostInstanceResponse terminateUHostInstance(
            TerminateUHostInstanceRequest request) throws UCloudException;

    /**
     * UpgradeToArkUHostInstance - 普通升级为方舟机型
     *
     * <p>See also: https://docs.ucloud.cn/api/uhost-api/UpgradeToArkUHostInstance
     */
    public UpgradeToArkUHostInstanceResponse upgradeToArkUHostInstance(
            UpgradeToArkUHostInstanceRequest request) throws UCloudException;
}