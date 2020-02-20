package hubitat.helper.interfaces

/**
 * https://docs.hubitat.com/index.php?title=Websocket_Interface
 *
 * @since 2.1.2
 */
abstract class WebSocket {

    abstract void connect(String url, Map options = null)

    abstract void close()

    abstract void sendMessage(String message)
}
