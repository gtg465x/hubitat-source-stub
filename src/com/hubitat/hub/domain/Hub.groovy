package com.hubitat.hub.domain

/**
 * https://docs.hubitat.com/index.php?title=Hub_Object
 * https://docs.smartthings.com/en/latest/ref-docs/hub-ref.html
 */
abstract class Hub {

    Long id
    String name
    Map data
    String zigbeeId
    String zigbeeEui
    String hardwareID
    String type
    String localIP
    String localSrvPortTCP
    String firmwareVersionString
    BigInteger uptime

    abstract boolean updateSystemTime(Date date)
}
