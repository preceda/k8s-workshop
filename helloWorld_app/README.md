# Hello world application
This is simple application for demonstration purposes only. Application only greed after start up and on rest call.
## REST API
Only available rest api is:
```
/hello-world
```
and port of running application is:
```
8080
```
## Pod name in greeting
Application log name of pod in greeting message. Pod name is read from ENV variable:
```
POD_NAME
```
Default value of pod name is: empty