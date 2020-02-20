package hubitat.helper.interfaces

/**
 * https://docs.hubitat.com/index.php?title=Raw_Socket_Interface
 *
 * @since 2.1.2
 */
abstract class RawSocket {

    abstract void connect(String ip, int port, Map options = null)

    abstract void close()

    abstract void sendMessage(String message)
}
