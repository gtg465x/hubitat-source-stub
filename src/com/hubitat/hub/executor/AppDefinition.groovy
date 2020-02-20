package com.hubitat.hub.executor

/**
 * https://docs.smartthings.com/en/latest/smartapp-developers-guide/anatomy-and-life-cycle-of-a-smartapp.html#definition
 */
abstract class AppDefinition {

    abstract void definition(Map definitionData, Closure closure = null)

    // https://docs.smartthings.com/en/latest/smartapp-developers-guide/preferences-and-settings.html#private-settings
    abstract void appSetting(String name)
}
