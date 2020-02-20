package com.hubitat.hub.domain

/**
 * https://docs.hubitat.com/index.php?title=Capability_Object
 * https://docs.smartthings.com/en/latest/ref-docs/capability-ref.html
 */
abstract class Capability {

    Long id
    String name
    String reference
    List<Attribute> attributes
    List<Command> commands
}
