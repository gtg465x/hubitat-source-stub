package hubitat.helper

import hubitat.helper.interfaces.*

abstract class InterfaceHelper {

    EventStream eventStream
    WebSocket webSocket
    RawSocket rawSocket
    Mqtt mqtt
}
