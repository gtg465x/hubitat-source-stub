package hubitat

// https://docs.hubitat.com/index.php?title=Websocket_Interface
abstract class WebsocketInterface {

    abstract void connect(String url, Map options = null)

    abstract void close()

    abstract void sendMessage(String message)
}
