package com.hubitat.app

import com.hubitat.hub.domain.*

/**
 * https://docs.hubitat.com/index.php?title=Device_Object
 * https://docs.smartthings.com/en/latest/ref-docs/device-ref.html
 */
abstract class Device {

    abstract List<Event> events(Map options = null)

    abstract List<Event> eventsSince(Date startDate, Map options = null)

    abstract List<Event> eventsBetween(Date startDate, Date endDate, Map options = null)

    abstract List<State> statesSince(String attributeName, Date startDate, Map options = null)

    abstract void sendEvent(Map properties)

    abstract void updateSetting(String name, Map options)

    abstract void updateSetting(String name, Long value)

    abstract void updateSetting(String name, Boolean value)

    abstract void updateSetting(String name, String value)

    abstract void updateSetting(String name, Double value)

    abstract void updateSetting(String name, Date value)

    abstract void updateSetting(String name, List value)

    abstract void removeSetting(String name)

    abstract void clearSetting(String name)

    abstract Long getIdAsLong()

    abstract String getId()

    abstract String getEndpointId()

    abstract String getZigbeeId()

    abstract Hub getHub()

    abstract Map getData()

    abstract void updateDataValue(String name, String value)

    abstract String getDataValue(String name)

    abstract String getDeviceDataByName(String name)

    abstract String getStatus()

    abstract String getName()

    abstract void setName(String name)

    abstract String getLabel()

    abstract void setLabel(String label)

    abstract String getDisplayName()

    abstract void setDisplayName(String displayName)

    abstract String getDeviceNetworkId()

    abstract void setDeviceNetworkId(String dni)

    abstract Object currentValue(String attributeName)

    abstract Object currentValue(String attributeName, boolean skipCache)

    abstract State currentState(String attributeName)

    abstract State currentState(String attributeName, boolean skipCache)

    abstract Object latestValue(String attributeName)

    abstract Object latestValue(String attributeName, boolean skipCache)

    abstract State latestState(String attributeName)

    abstract State latestState(String attributeName, boolean skipCache)

    abstract List<State> getCurrentStates()

    abstract List<Command> getSupportedCommands()

    abstract List<Attribute> getSupportedAttributes()

    abstract List<Capability> getCapabilities()

    abstract Boolean hasCommand(String command)

    abstract Boolean hasAttribute(String attribute)

    abstract Boolean hasCapability(String capability)

    abstract Date getLastActivity()

    abstract Long getParentDeviceId()

    abstract Long getParentAppId()

    abstract Boolean getIsComponent()

    abstract boolean isDisabled()
}
