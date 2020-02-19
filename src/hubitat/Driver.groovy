package hubitat

import hubitat.zigbee.Zigbee
import hubitat.zwave.Zwave

// https://docs.hubitat.com/index.php?title=Driver_Object
// https://docs.smartthings.com/en/latest/ref-docs/device-handler-ref.html
abstract class Driver extends CommonMethods, Script {

    Interfaces interfaces

    // User defined methods - guessed return types

    abstract void parse(String message)

    // From https://docs.hubitat.com/index.php?title=EventStream_Interface
    abstract void eventStreamStatus(String message)

    // From https://docs.hubitat.com/index.php?title=Telnet_Interface
    abstract void telnetStatus(String message)

    // https://docs.hubitat.com/index.php?title=Websocket_Interface
    abstract void webSocketStatus(String message)

    // https://docs.hubitat.com/index.php?title=Raw_Socket_Interface
    abstract void socketStatus(String message)

    // https://docs.hubitat.com/index.php?title=MQTT_Interface
    abstract void mqttClientStatus(String message)

    // Hubitat Provided Methods

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

    abstract HubAction response(hubitat.zwave.Command cmd)

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
