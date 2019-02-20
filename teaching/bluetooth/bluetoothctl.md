# Bluetoothctl

This tool helps you to configure and set your bluetooth device.

### Connecting to an airpod 

```
$bluetoothctl
root@prec:/home/percy# bluetoothctl 
[NEW] Controller 20:16:B9:E9:D9:3B prec [default]
[NEW] Device 94:B0:1F:A7:67:51 AirPods
Agent registered
[CHG] Device 94:B0:1F:A7:67:51 Connected: yes
[CHG] Device 94:B0:1F:A7:67:51 Connected: no

[bluetooth]# list
Controller 20:16:B9:E9:D9:3B prec [default]
[bluetooth]# show
Controller 20:16:B9:E9:D9:3B (public)
	Name: prec
	Alias: prec
	Class: 0x000c010c
	Powered: yes
	Discoverable: yes
	Pairable: yes
	UUID: Headset AG                (00001112-0000-1000-8000-00805f9b34fb)
	UUID: Generic Attribute Profile (00001801-0000-1000-8000-00805f9b34fb)
	UUID: A/V Remote Control        (0000110e-0000-1000-8000-00805f9b34fb)
	UUID: Generic Access Profile    (00001800-0000-1000-8000-00805f9b34fb)
	UUID: PnP Information           (00001200-0000-1000-8000-00805f9b34fb)
	UUID: A/V Remote Control Target (0000110c-0000-1000-8000-00805f9b34fb)
	UUID: Audio Source              (0000110a-0000-1000-8000-00805f9b34fb)
	UUID: Audio Sink                (0000110b-0000-1000-8000-00805f9b34fb)
	UUID: Headset                   (00001108-0000-1000-8000-00805f9b34fb)
	Modalias: usb:v1D6Bp0246d0530
	Discovering: no

[bluetooth]# scan on
Discovery started
[CHG] Controller 20:16:B9:E9:D9:3B Discovering: yes
[NEW] Device 4D:37:DF:BB:41:CC 4D-37-DF-BB-41-CC
[NEW] Device 75:00:27:6E:44:AF 75-00-27-6E-44-AF
[NEW] Device 48:75:5A:28:15:C2 48-75-5A-28-15-C2
[NEW] Device 69:22:2E:82:14:25 69-22-2E-82-14-25
[NEW] Device 45:5D:4F:4A:6A:5B 45-5D-4F-4A-6A-5B
[NEW] Device 51:B1:D0:EA:9B:67 51-B1-D0-EA-9B-67
[NEW] Device 7F:DB:D0:94:9B:8A 7F-DB-D0-94-9B-8A
[NEW] Device CF:89:C2:D0:19:77 Ionic
[NEW] Device 64:A2:F9:69:FB:E4 OnePlus 6
[NEW] Device F4:8C:50:15:17:B4 WUKAD185275-WOV
[CHG] Device 45:5D:4F:4A:6A:5B RSSI: -71
[CHG] Device F4:8C:50:15:17:B4 RSSI: -88

[bluetooth]# devices
Device 94:B0:1F:A7:67:51 AirPods
Device 4D:37:DF:BB:41:CC 4D-37-DF-BB-41-CC
Device 75:00:27:6E:44:AF 75-00-27-6E-44-AF
Device 48:75:5A:28:15:C2 48-75-5A-28-15-C2
Device 69:22:2E:82:14:25 69-22-2E-82-14-25
Device 45:5D:4F:4A:6A:5B 45-5D-4F-4A-6A-5B
Device 51:B1:D0:EA:9B:67 51-B1-D0-EA-9B-67
Device 7F:DB:D0:94:9B:8A 7F-DB-D0-94-9B-8A
Device CF:89:C2:D0:19:77 Ionic
Device 64:A2:F9:69:FB:E4 OnePlus 6
Device F4:8C:50:15:17:B4 WUKAD185275-WOV
[CHG] Device 51:B1:D0:EA:9B:67 RSSI: -86
[NEW] Device 78:FE:39:25:77:8F 78-FE-39-25-77-8F
[NEW] Device 2C:41:A1:1E:EB:18 2C-41-A1-1E-EB-18
[CHG] Device F4:8C:50:15:17:B4 RSSI: -73

[bluetooth]# connect 94:B0:1F:A7:67:51
Attempting to connect to 94:B0:1F:A7:67:51
[CHG] Device 94:B0:1F:A7:67:51 Connected: yes
Connection successful
[CHG] Device 94:B0:1F:A7:67:51 ServicesResolved: yes

```

Then the airport is connected and therefrore can be used.

* References:

    https://www.addictivetips.com/ubuntu-linux-tips/pair-and-use-bluetooth-devices-on-linux/
    http://www.linux-magazine.com/Issues/2017/197/Command-Line-bluetoothctl

### Bluetoothctl in a script

```
$echo "info "| bluetoothctl

percy@prec:~$ echo "help "| bluetoothctl
[NEW] Controller 20:16:B9:E9:D9:3B prec [default]
[NEW] Device 94:B0:1F:A7:67:51 AirPods
Agent registered
[AirPods]# help
Menu main:
Available commands:
-------------------
advertise                                         Advertise Options Submenu
scan                                              Scan Options Submenu
gatt                                              Generic Attribute Submenu
list                                              List available controllers
show [ctrl]                                       Controller information
select <ctrl>                                     Select default controller
devices                                           List available devices
paired-devices                                    List paired devices
system-alias <name>                               Set controller alias
reset-alias                                       Reset controller alias
power <on/off>                                    Set controller power
pairable <on/off>                                 Set controller pairable mode
discoverable <on/off>                             Set controller discoverable mode
agent <on/off/capability>                         Enable/disable agent with given capability
default-agent                                     Set agent as the default one
advertise <on/off/type>                           Enable/disable advertising with given type
set-alias <alias>                                 Set device alias
scan <on/off>                                     Scan for devices
info [dev]                                        Device information
pair [dev]                                        Pair with device
trust [dev]                                       Trust device
untrust [dev]                                     Untrust device
block [dev]                                       Block device
unblock [dev]                                     Unblock device
remove <dev>                                      Remove device
connect <dev>                                     Connect device
disconnect [dev]                                  Disconnect device
menu <name>                                       Select submenu
version                                           Display version
quit                                              Quit program
exit                                              Quit program
help                                              Display help about this program
Agent unregistered
[DEL] Controller 20:16:B9:E9:D9:3B prec [default]


```

An useful command is when you want to connect to a device:
```
percy@prec:~$ echo "connect 94:B0:1F:A7:67:51" | bluetoothct
```

* Reference
    https://www.linuxquestions.org/questions/programming-9/control-bluetoothctl-with-scripting-4175615328/






