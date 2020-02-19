package hubitat

// https://docs.hubitat.com/index.php?title=Raw_Socket_Interface
abstract class RawSocketInterface {

    abstract void connect(String ip, int port, Map options = null)

    abstract void close()

    abstract void sendMessage(String message)
}
