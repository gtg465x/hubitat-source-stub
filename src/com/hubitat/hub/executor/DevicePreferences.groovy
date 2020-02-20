package com.hubitat.hub.executor

/**
 * https://docs.smartthings.com/en/latest/device-type-developers-guide/device-preferences.html
 */
abstract class DevicePreferences {

    abstract void preferences(Closure closure)

    abstract void input(options = null, String name, String type)

    abstract void input(options)
}
