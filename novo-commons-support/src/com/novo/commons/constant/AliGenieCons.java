package com.novo.commons.constant;

/**
 * @author MickeyChen
 * @date 2020/12/19
 */
public interface AliGenieCons {

    String PRODUCT_PICTURE_URI = "https://novoyun-1253879509.file.myqcloud.com/";

    String HEADER_NAME_CONTROL_DEVICES = "ControlDevices";
    String HEADER_NAMESPACE_CUSTOM = "AliGenie.Iot.Device.Custom";

    String HEADER_NAME_QUERY_DEVICES = "QueryDevices";
    String HEADER_NAMESPACE_QUERY = "AliGenie.Iot.Device.Query";


    /** 阿里定义参数 */
    String PARAMS_HEADER_NAMESPACE_DISCOVERY = "AliGenie.Iot.Device.Discovery";
    String PARAMS_HEADER_NAMESPACE_CONTROL = "AliGenie.Iot.Device.Control";
    String PARAMS_HEADER_NAMESPACE_QUERY = "AliGenie.Iot.Device.Query";

    /** ------------------------------------阿里相应参数------------------------------------ */

    /** 返回错误的name，异常响应 */
    String RESPONSE_HEADER_CONTROL_NAME_ERRORRESPONSE = "ErrorResponse";


    /** ------------------------------------设备发现------------------------------------ */

    /** 设备发现参数 */
    String PARAMS_HEADER_DISCOVERY_NAME_DISCOVERYDEVICES = "DiscoveryDevices";

    /** ------------------------------------设备控制------------------------------------ */

    /** 控制类参数 */
    String PARAMS_HEADER_CONTROL_NAME_TURNON = "TurnOn";//打开
    String PARAMS_HEADER_CONTROL_NAME_TURNON_RESPONSE = "TurnOnResponse";//打开响应
    String PARAMS_HEADER_CONTROL_NAME_TURNOFF = "TurnOff";//关闭
    String PARAMS_HEADER_CONTROL_NAME_TURNOFF_RESPONSE = "TurnOffResponse";//关闭响应
    String PARAMS_HEADER_CONTROL_NAME_SELECTCHANNEL = "SelectChannel";//频道切换
    String PARAMS_HEADER_CONTROL_NAME_ADJUSTUPCHANNEL = "AdjustUpChannel";//频道增加
    String PARAMS_HEADER_CONTROL_NAME_ADJUSTUPVOLUME = "AdjustDownChannel";//频道减少
    String PARAMS_HEADER_CONTROL_NAME_AdjustUpVolume = "AdjustUpVolume";//声音按照步长调大
    String PARAMS_HEADER_CONTROL_NAME_ADJUSTDOWNVOLUME = "AdjustDownVolume";//声音按照步长调小
    String PARAMS_HEADER_CONTROL_NAME_SETVOLUME = "SetVolume";//声音调到某个值
    String PARAMS_HEADER_CONTROL_NAME_SETMUTE = "SetMute";//设置静音
    String PARAMS_HEADER_CONTROL_NAME_CANCELMUTE = "CancelMute";//取消静音
    String PARAMS_HEADER_CONTROL_NAME_PLAY = "Play";//播放
    String PARAMS_HEADER_CONTROL_NAME_PLAY_RESPONSE = "PlayResponse";//播放响应
    String PARAMS_HEADER_CONTROL_NAME_PAUSE = "Pause";//暂停
    String PARAMS_HEADER_CONTROL_NAME_PAUSE_RESPONSE = "PauseResponse";//暂停响应
    String PARAMS_HEADER_CONTROL_NAME_CONTINUE = "Continue";//继续
    String PARAMS_HEADER_CONTROL_NAME_NEXT = "Next";//下一首或下一台
    String PARAMS_HEADER_CONTROL_NAME_PREVIOUS = "Previous";//上一首或上一台
    String PARAMS_HEADER_CONTROL_NAME_SETBRIGHTNESS = "SetBrightness";//设置亮度
    String PARAMS_HEADER_CONTROL_NAME_ADJUSTUPBRIGHTNESS = "AdjustUpBrightness";//调大亮度
    String PARAMS_HEADER_CONTROL_NAME_ADJUSTDOWNBRIGHTNESS = "AdjustDownBrightness";//调小亮度
    String PARAMS_HEADER_CONTROL_NAME_SETTEMPERATURE = "SetTemperature";//设置温度
    String PARAMS_HEADER_CONTROL_NAME_ADJUSTUPTEMPERATURE = "AdjustUpTemperature";//调高温度
    String PARAMS_HEADER_CONTROL_NAME_ADJUSTDOWNTEMPERATURE = "AdjustDownTemperature";//调低温度
    String PARAMS_HEADER_CONTROL_NAME_SETWINDSPEED = "SetWindSpeed";//设置风速
    String PARAMS_HEADER_CONTROL_NAME_ADJUSTUPWINDSPEED = "AdjustUpWindSpeed";//调大风速
    String PARAMS_HEADER_CONTROL_NAME_ADJUSTDOWNWINDSPEED = "AdjustDownWindSpeed";//调小风速
    String PARAMS_HEADER_CONTROL_NAME_SETMODE = "SetMode";//模式的切换
    String PARAMS_HEADER_CONTROL_NAME_SETMODE_RESPONSE = "SetModeResponse";//模式的切换响应
    String PARAMS_HEADER_CONTROL_NAME_SETCOLOR = "SetColor";//设置颜色
    String PARAMS_HEADER_CONTROL_NAME_OPENFUNCTION = "OpenFunction";//打开功能
    String PARAMS_HEADER_CONTROL_NAME_OPENFUNCTION_RESPONSE = "OpenFunctionResponse";//打开功能响应
    String PARAMS_HEADER_CONTROL_NAME_CLOSEFUNCTION = "CloseFunction";//关闭功能
    String PARAMS_HEADER_CONTROL_NAME_CANCEL = "Cancel";//取消
    String PARAMS_HEADER_CONTROL_NAME_CANCELMODE = "CancelMode";//取消模式(退出模式)

    /** 模式切换参数 */
    String[] CONTROL_NAME_SETMODE_ENERGYSAVE = {"energySave", "energySaveWash", "节能洗", "节能模式", "节能洗模式"};
    String[] CONTROL_NAME_SETMODE_POWER = {"power", "strongWash", "强力洗", "强力模式", "强力洗模式", "强劲洗", "强劲模式", "强劲洗模式"};
    String[] CONTROL_NAME_SETMODE_NORMAL = {"standard","日常洗", "日常模式", "日常洗模式", "正常模式", "正常洗模式", "正常洗", "异常洗", "异常洗模式", "异常模式"};
    String[] CONTROL_NAME_SETMODE_QUICK = {"fastWash","快速模式", "快速洗", "快速洗模式", "速洗模式"};
    String[] CONTROL_NAME_SETMODE_BOTTLE = {"奶瓶洗", "奶瓶洗模式", "奶瓶模式", "一瓶模式", "瓶子模式"};
    String[] CONTROL_NAME_SETMODE_FRUIT = {"瓜果洗", "瓜果模式", "瓜瓜模式", "瓜果洗模式", "刮刮模式", "国旗模式", "乖乖洗模式", "果蔬模式", "果蔬洗模式"};
    String[] CONTROL_NAME_SETMODE_OWN = {"自清洁", "自清洁模式", "清洁模式", "自清洗", "自清洗模式", "清洗模式"};
    String[] CONTROL_NAME_SETMODE_CUSTOM = {"自定义模式", "自定义洗", "自定义"};
    String[] CONTROL_NAME_SETMODE_SMART = {"smart", "智能洗", "智能洗模式", "智能模式"};
    String[] CONTROL_NAME_SETMODE_CHILDLOCK = {"童锁模式"};
    String[] CONTROL_NAME_CANCALMODE_CHILDLOCK = {"童锁模式"};
    String[] CONTROL_NAME_SETMODE_RUN = {"功能模式"};


    /** ------------------------------------设备查询------------------------------------ */

    /** 查询类参数 */
    String PARAMS_HEADER_QUERY_NAME_QUERY = "Query";//查询
    String PARAMS_HEADER_QUERY_NAME_QUERY_RESPONSE = "QueryResponse";//查询响应
    String PARAMS_HEADER_QUERY_NAME_LEFTTIME = "QueryLeftTime";//洗涤剩余时间
    String PARAMS_HEADER_QUERY_NAME_LEFTTIME_RESPONSE = "QueryLeftTimeResponse";//洗涤剩余时间响应
    String PARAMS_HEADER_QUERY_NAME_POWERSTATE = "QueryPowerState";//电源开关状态

}
