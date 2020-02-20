package com.hubitat.hub.executor

// From https://docs.smartthings.com/en/latest/device-type-developers-guide/device-preferences.html
abstract class DevicePreferences {

    abstract def preferences(Closure closure)

    abstract def input(options = null, String name, String type)

    abstract def input(options)
}
