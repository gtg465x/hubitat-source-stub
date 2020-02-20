package com.hubitat.hub.domain

/**
 * https://docs.hubitat.com/index.php?title=Location_Object
 * https://docs.smartthings.com/en/latest/ref-docs/location-ref.html
 */
abstract class Location {

    Long id
    String name
    String temperatureScale
    TimeZone timeZone
    String zipCode
    BigDecimal latitude
    BigDecimal longitude
    Date sunrise
    Date sunset
    List<Hub> hubs
    Hub hub

    // ? Undocumented return type
    abstract def getFormattedLatitude()

    // ? Undocumented return type
    abstract def getFormattedLongitude()

    // ? Undocumented return type
    abstract def getTimeFormat()

    abstract List<Mode> getModes()

    abstract String getMode()

    // ? Return type and param type from https://docs.smartthings.com/en/latest/ref-docs/location-ref.html#setmode
    abstract void setMode(String mode)

    // ? Return type and param type from https://docs.smartthings.com/en/latest/ref-docs/location-ref.html#setmode
    abstract void setMode(Mode mode)

    // https://docs.smartthings.com/en/latest/ref-docs/location-ref.html#getcurrentmode
    abstract Mode getCurrentMode()
}
