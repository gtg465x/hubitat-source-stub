package com.hubitat.hub.executor

import com.hubitat.hub.domain.Location
import groovy.util.slurpersupport.GPathResult

/**
 * https://docs.hubitat.com/index.php?title=Common_Methods_Object
 */
abstract class BaseExecutor extends Script {

    // https://docs.smartthings.com/en/latest/tools-and-ide/logging.html
    public final Log log

    // https://docs.smartthings.com/en/latest/ref-docs/smartapp-ref.html#settings
    public final Map settings

    // https://docs.smartthings.com/en/latest/smartapp-developers-guide/state.html#state-and-atomic-state-overview
    public final Map state

    // https://docs.smartthings.com/en/latest/ref-docs/location-ref.html
    public final Location location

    // User defined methods

    abstract void installed()

    abstract void updated()

    abstract void uninstalled()

    // Hubitat provided methods

    abstract Location getLocation()

    abstract Map getSunriseAndSunset(Map options = null)

    abstract String getTemperatureScale()

    abstract Date timeToday(String timeString, TimeZone timeZone = null)

    // ? timeZone param may need to be passed in an options Map
    abstract boolean timeOfDayIsBetween(Date start, Date stop, Date value, TimeZone timeZone = null)

    abstract void unschedule()

    abstract void unschedule(handlerMethod)

    abstract void asynchttpGet(callbackMethod, Map params, Map data = null)

    abstract void asynchttpPost(String callbackMethod = null, Map params, Map data = null)

    abstract void asynchttpPatch(String callbackMethod = null, Map params, Map data = null)

    abstract void httpGet(String uri, Closure closure)

    abstract void httpGet(Map params, Closure closure)

    abstract void httpPost(String uri, String body, Closure closure)

    abstract void httpPost(Map params, Closure closure)

    abstract void httpPostJson(String uri, String stringBody, Closure closure)

    abstract void httpPostJson(String uri, Map mapBody, Closure closure)

    abstract void httpPostJson(Map params, Closure closure)

    abstract void httpPut(String uri, String body, Closure closure)

    abstract void httpPut(Map params, Closure closure)

    abstract void httpPatch(String uri, String body, Closure closure)

    abstract void httpPatch(Map params, Closure closure)

    abstract void runIn(Long delayInSeconds, String handlerMethod, Map options = null)

    abstract void runInMillis(Long delayInMilliSeconds, String handlerMethod, Map options = null)

    abstract void pauseExecution(Long millisecs)

    abstract Date toDateTime(String dateTimeString)

    abstract BigDecimal celsiusToFahrenheit(BigDecimal val)

    abstract BigDecimal fahrenheitToCelsius(BigDecimal val)

    abstract void httpPutJson(String uri, String body, Closure closure)

    abstract void httpPutJson(String uri, Map body, Closure closure)

    abstract void httpPutJson(Map params, Closure closure)

    abstract void httpDelete(Map params, Closure closure)

    abstract String getMACFromIP(String ipAddr)

    abstract String convertTemperatureIfNeeded(BigDecimal value, String scale, Integer precision)

    abstract Object parseJson(String stringToParse)

    abstract GPathResult parseXML(String stringToParse)

    abstract Map parseLanMessage(String stringToParse)

    abstract void runEvery1Minute(String handlerMethod, Map options = null)

    abstract void runEvery5Minutes(String handlerMethod, Map options = null)

    abstract void runEvery10Minutes(String handlerMethod, Map options = null)

    abstract void runEvery15Minutes(String handlerMethod, Map options = null)

    abstract void runEvery30Minutes(String handlerMethod, Map options = null)

    abstract void runEvery1Hour(String handlerMethod, Map options = null)

    abstract void runEvery3Hours(String handlerMethod, Map options = null)

    abstract void runOnce(Date dateTime, String handlerMethod, Map options = null)

    abstract void runOnce(String dateTime, String handlerMethod, Map options = null)

    abstract void schedule(Date dateTime, String handlerMethod, Map options = null)

    abstract void schedule(String expression, String handlerMethod, Map options = null)

    abstract void asynchttpPut(String callbackMethod = null, Map params, Map data = null)

    abstract void asynchttpDelete(String callbackMethod = null, Map params, Map data = null)

    abstract void asynchttpHead(String callbackMethod = null, Map params, Map data = null)

    abstract Map textToSpeech(String stringToBeSynthesized, String voice = null)

    abstract String encrypt(String value)

    abstract String decrypt(String value)

    abstract void sendLocationEvent(Map properties)

    abstract Date timeTodayAfter(String startTimeString, String timeString, TimeZone timeZone = null)

    abstract Long timeOffset(Number minutes)

    abstract Long timeOffset(String hoursAndMinutesString)

    // https://docs.smartthings.com/en/latest/tools-and-ide/logging.html
    abstract class Log {

        abstract void error(String message, Throwable thrown = null)

        abstract void warn(String message, Throwable thrown = null)

        abstract void info(String message, Throwable thrown = null)

        abstract void debug(String message, Throwable thrown = null)

        abstract void trace(String message, Throwable thrown = null)
    }
}
