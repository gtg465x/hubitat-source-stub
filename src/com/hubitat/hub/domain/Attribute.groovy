package com.hubitat.hub.domain

/**
 * https://docs.hubitat.com/index.php?title=Attribute_Object
 * https://docs.smartthings.com/en/latest/ref-docs/attribute-ref.html
 */
abstract class Attribute {

    Long id
    Long version
    String dataType
    String name
    List<String> possibleValues

    abstract List<String> getValues()
}
