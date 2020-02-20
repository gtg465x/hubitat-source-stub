package com.hubitat.hub.executor

// From https://docs.smartthings.com/en/latest/device-type-developers-guide/definition-metadata.html
abstract class DeviceDefinition {

    abstract def metadata(Closure closure)

    abstract def definition(parameters, Closure closure = null)

    abstract def capability(String capabilityName)

    abstract def attribute(String attributeName, String attributeType, List possibleValues = null)

    abstract def command(String commandName, List parameterTypes = [])

    abstract def fingerprint(parameters)
}
