package com.hubitat.hub.executor

/**
 * https://docs.smartthings.com/en/latest/smartapp-developers-guide/preferences-and-settings.html
 */
abstract class AppPreferences {

    abstract void preferences(Closure closure)

    abstract void page(String name, String title, Closure closure)

    abstract void page(options = null, Closure closure)

    abstract void dynamicPage(String name, String title, Closure closure)

    abstract void dynamicPage(options = null, Closure closure)

    abstract void section(Closure closure)

    abstract void section(String sectionTitle, Closure closure)

    abstract void section(options, String sectionTitle = null, Closure closure)

    abstract void paragraph(options = null, String text)

    abstract void icon(options)

    abstract void href(options)

    abstract void mode(options)

    abstract void label(options)

    // https://docs.smartthings.com/en/latest/smartapp-developers-guide/parent-child-smartapps.html
    abstract void app(options)

    abstract void input(options = null, String name, String type)

    abstract void input(options)

    abstract void remove(String buttonText, String confirmationText = null, String detailText = null)
}
