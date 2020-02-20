package com.hubitat.hub.executor

// https://docs.smartthings.com/en/latest/smartapp-developers-guide/preferences-and-settings.html
abstract class AppPreferences {

    abstract def preferences(Closure closure)

    abstract def page(String name, String title, Closure closure)

    abstract def page(options = null, Closure closure)

    abstract def dynamicPage(String name, String title, Closure closure)

    abstract def dynamicPage(options = null, Closure closure)

    abstract def section(Closure closure)

    abstract def section(String sectionTitle, Closure closure)

    abstract def section(options, String sectionTitle = null, Closure closure)

    abstract def paragraph(options = null, String text)

    abstract def icon(options)

    abstract def href(options)

    abstract def mode(options)

    abstract def label(options)

    // From https://docs.smartthings.com/en/latest/smartapp-developers-guide/parent-child-smartapps.html
    abstract def app(options)

    abstract def input(options = null, String name, String type)

    abstract def input(options)

    abstract def remove(String buttonText, String confirmationText = null, String detailText = null)
}
