package com.hubitat.hub.executor

// From https://docs.smartthings.com/en/latest/smartapp-developers-guide/anatomy-and-life-cycle-of-a-smartapp.html#definition
abstract class AppDefinition {

    abstract def definition(parameters, Closure closure = null)

    // From https://docs.smartthings.com/en/latest/smartapp-developers-guide/preferences-and-settings.html#private-settings
    abstract def appSetting(String name)
}
