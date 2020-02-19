package hubitat.zwave

// https://docs.hubitat.com/index.php?title=Zwave_Object
abstract class Zwave {

    abstract Command getCommand(Short commandClass, Short command, List<Short> payload, Integer version = null)
}
