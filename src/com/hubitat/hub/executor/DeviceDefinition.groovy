package com.hubitat.hub.executor

/**
 * https://docs.smartthings.com/en/latest/device-type-developers-guide/definition-metadata.html
 * https://docs.smartthings.com/en/latest/ref-docs/device-handler-ref.html
 */
abstract class DeviceDefinition {

    abstract void metadata(Closure closure)

    abstract void definition(Map definitionData, Closure closure = null)

    abstract void capability(String capabilityName)

    abstract void attribute(String attributeName, String attributeType, List possibleValues = null)

    abstract void command(String commandName, List parameterTypes = [])

    abstract void fingerprint(parameters)
}
