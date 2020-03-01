package com.hubitat.app

abstract class EventSubscriptionWrapper {

    // All properties are undocumented

    Long id
    Long locationId
    Long deviceId
    DeviceWrapper device
    // Attribute name
    String data
    String handler
}
