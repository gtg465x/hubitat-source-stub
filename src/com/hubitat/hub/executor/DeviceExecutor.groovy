package com.hubitat.hub.executor

import com.hubitat.app.ChildDeviceWrapper
import com.hubitat.app.Device
import com.hubitat.hub.domain.Event
import hubitat.device.HubAction
import hubitat.device.HubMultiAction
import hubitat.helper.InterfaceHelper
import hubitat.zigbee.Zigbee
import hubitat.zwave.Command
import hubitat.zwave.Zwave

/**
 * https://docs.hubitat.com/index.php?title=Driver_Object
 * https://docs.smartthings.com/en/latest/ref-docs/device-handler-ref.html
 */
abstract class DeviceExecutor extends BaseExecutor {

    // https://docs.smartthings.com/en/latest/ref-docs/device-handler-ref.html#device
    public final Device device

    public final InterfaceHelper interfaces

    public final Zwave zwave

    public final Zigbee zigbee

    // Device definition methods
    // https://docs.smartthings.com/en/latest/device-type-developers-guide/definition-metadata.html
    // https://docs.smartthings.com/en/latest/ref-docs/device-handler-ref.html

    abstract void metadata(Closure closure)

    abstract void definition(Map definitionData, Closure closure = null)

    abstract void capability(String capabilityName)

    abstract void attribute(String attributeName, String attributeType, List possibleValues = null)

    abstract void command(String commandName, List parameterTypes = [])

    abstract void fingerprint(parameters)

    // Device preferences methods
    // https://docs.smartthings.com/en/latest/device-type-developers-guide/device-preferences.html

    abstract void preferences(Closure closure)

    abstract void input(options = null, String name, String type)

    abstract void input(options)

    // User defined methods with undocumented return types

    abstract def parse(String message)

    // https://docs.hubitat.com/index.php?title=EventStream_Interface
    abstract def eventStreamStatus(String message)

    // https://docs.hubitat.com/index.php?title=Telnet_Interface
    abstract def telnetStatus(String message)

    // https://docs.hubitat.com/index.php?title=Websocket_Interface
    abstract def webSocketStatus(String message)

    // https://docs.hubitat.com/index.php?title=Raw_Socket_Interface
    abstract def socketStatus(String message)

    // https://docs.hubitat.com/index.php?title=MQTT_Interface
    abstract def mqttClientStatus(String message)

    // Hubitat provided methods

    abstract void sendHubCommand(HubAction hubAction)

    abstract ChildDeviceWrapper addChildDevice(String namespace, String typeName, String deviceNetworkId, Map properties = [:])

    abstract ChildDeviceWrapper addChildDevice(String typeName, String deviceNetworkId, Map properties = [:])

    abstract List<ChildDeviceWrapper> getChildDevices()

    abstract ChildDeviceWrapper getChildDevice(String deviceNetworkId)

    abstract void deleteChildDevice(String deviceNetworkId)

    abstract Object getParent()

    abstract Map getState()

    abstract Zwave getZwave()

    abstract Zigbee getZigbee()

    abstract void updateDataValue(String name, String value)

    abstract String getDataValue(String name)

    abstract String getDeviceDataByName(String name)

    abstract HubAction response(String cmd)

    abstract HubAction response(Command cmd)

    abstract HubMultiAction response(List cmds)

    abstract Short getZwaveHubNodeId()

    abstract void sendEvent(Map properties)

    abstract List<Event> eventsSince(Date startDate, Map options = null)

    abstract void telnetConnect(Map options, String ip, int port, String username, String password)

    abstract void telnetConnect(String ip, int port, String username, String password)

    abstract void telnetClose()

    abstract Map createEvent(Map options)

    abstract List<String> delayBetween(List<String> cmds, Long delay)

    abstract List<String> delayBetween(List<String> cmds)
}
