package com.hubitat.hub.domain

/**
 * https://docs.hubitat.com/index.php?title=Mode_Object
 * https://docs.smartthings.com/en/latest/ref-docs/mode-ref.html
 */
abstract class Mode {

    // ? https://docs.smartthings.com/en/latest/ref-docs/mode-ref.html#getid
    abstract String getId()

    // ? https://docs.smartthings.com/en/latest/ref-docs/mode-ref.html#getname
    abstract String getName()
}
