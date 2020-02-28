package com.hubitat.hub.domain

import com.hubitat.app.Device

/**
 * https://docs.hubitat.com/index.php?title=Event_Object
 * https://docs.smartthings.com/en/latest/ref-docs/event-ref.html
 */
abstract class Event {

    boolean archivable
    String descriptionText
    boolean displayed
    String source
    Boolean isStateChange
    String name
    String value
    String unit
    String description
    boolean translatable
    String type
    Long locationId
    Long hubId
    Long installedAppId

    // ? All method return types from https://docs.smartthings.com/en/latest/ref-docs/event-ref.html unless stated otherwise

    abstract String getData()

    // ? Return type from https://docs.smartthings.com/en/latest/ref-docs/event-ref.html#getjsonvalue
    abstract Object getJsonData()

    abstract Boolean isPhysical()

    abstract Boolean isDigital()

    abstract Date getDate()

    // ? Guessed return type
    abstract Long getUnixTime()

    abstract String getDisplayName()

    // Documentation says this returns a String, but I got a Long
    abstract Long getDeviceId()

    abstract Device getDevice()

    abstract Location getLocation()

    abstract Double getDoubleValue()

    abstract Float getFloatValue()

    abstract Date getDateValue()

    abstract Integer getIntegerValue()

    abstract Long getLongValue()

    abstract Number getNumberValue()

    abstract Number getNumericValue()
}
