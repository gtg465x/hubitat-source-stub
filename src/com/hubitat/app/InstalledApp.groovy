package com.hubitat.app

/**
 * https://docs.hubitat.com/index.php?title=InstalledApp_Object
 * https://docs.smartthings.com/en/latest/ref-docs/installed-smart-app-wrapper-ref.html#installed-smart-app-wrapper
 */
abstract class InstalledApp {

    abstract String getLabel()

    abstract void updateLabel(String label)

    abstract void updateSetting(String name, Map options)

    abstract void updateSetting(String name, Long value)

    abstract void updateSetting(String name, Boolean value)

    abstract void updateSetting(String name, String value)

    abstract void updateSetting(String name, Double value)

    abstract void updateSetting(String name, Date value)

    abstract void updateSetting(String name, List value)

    abstract void removeSetting(String name)

    abstract void clearSetting(String name)

    abstract String getInstallationState()

    abstract Long getId()

    abstract Long getName()

    abstract List<EventSubscriptionWrapper> getSubscriptions()
}
