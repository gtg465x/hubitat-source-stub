package hubitat

// From https://docs.smartthings.com/en/latest/tools-and-ide/logging.html
abstract class Logger {

    abstract error(String, Throwable = null)

    abstract warn(String, Throwable = null)

    abstract info(String, Throwable = null)

    abstract debug(String, Throwable = null)

    abstract trace(String, Throwable = null)
}
