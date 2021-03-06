# Hubitat Source Stub

This repository contains stubs of the classes, methods, and properties documented in the [Hubitat Developer Documentation](https://docs.hubitat.com/index.php?title=Developer_Documentation), with the exception of the ZWave commands. They can be imported into your Hubitat app or driver project to enable autocomplete for your IDE.

A few methods and properties from the [SmartThings Classic Developer Documentation](https://docs.smartthings.com/en/latest/) have been included as well, and I will add more from there as I come across ones that work on Hubitat.

## To enable autocomplete for your Hubitat app or driver project:
1. Copy the directories in `src` into a source directory of your project. For IntelliJ, make sure a source directory is configured in Project Settings > Modules, and make sure your app and driver code is not in a source directory.
2. Add the following code to the top of your app or driver script:

For apps:
```groovy
/** For development only. Do not copy to Hubitat. */
import com.hubitat.hub.executor.AppExecutor
import groovy.transform.BaseScript

@BaseScript AppExecutor appExecutor
/**************************************************/
```
For drivers:
```groovy
/** For development only. Do not copy to Hubitat. */
import com.hubitat.hub.executor.DeviceExecutor
import groovy.transform.BaseScript

@BaseScript DeviceExecutor deviceExecutor
/**************************************************/
```

You may also want autocomplete for your settings objects, in which case you can also add a field for each input like so:

Input:
```groovy
input "motionSensor", "capability.motionSensor", title: "Select Motion Sensor"
```
Field:
```groovy
import com.hubitat.app.DeviceWrapper
import groovy.transform.Field

@Field DeviceWrapper motionSensor
```