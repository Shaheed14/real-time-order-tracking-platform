# Real-Time Order Tracking Platform

A production-grade, multi-module backend platform built with Java 21, Spring Boot 3, and Maven.

## Architecture

The project follows clean architecture principles with a clear separation between:
- application layer for controllers and API entry points
- domain layer for business services and rules
- shared common library for cross-cutting models and contracts

## Modules

- common-library: shared domain models and utilities
- order-service: manages orders and order lifecycle
- driver-service: handles delivery drivers and availability
- tracking-service: processes live tracking updates
- notification-service: emits notifications to end users

## Tech Stack

- Java 21
- Spring Boot 3.3.0
- Maven
- Spring Web
- Spring Actuator
- Validation

## Directory Structure

```text
real-time-order-tracking-platform/
├── pom.xml
├── .gitignore
├── README.md
├── common-library/
│   ├── pom.xml
│   └── src/main/java/com/rtotp/common/domain/
│       ├── OrderStatus.java
│       └── OrderEvent.java
├── order-service/
│   ├── pom.xml
│   └── src/main/
│       ├── java/com/rtotp/orderservice/
│       │   ├── OrderServiceApplication.java
│       │   ├── application/OrderController.java
│       │   └── domain/OrderService.java
│       └── resources/application.yml
├── driver-service/
│   ├── pom.xml
│   └── src/main/
│       ├── java/com/rtotp/driverservice/
│       │   ├── DriverServiceApplication.java
│       │   ├── application/DriverController.java
│       │   └── domain/DriverService.java
│       └── resources/application.yml
├── tracking-service/
│   ├── pom.xml
│   └── src/main/
│       ├── java/com/rtotp/trackingservice/
│       │   ├── TrackingServiceApplication.java
│       │   ├── application/TrackingController.java
│       │   └── domain/TrackingService.java
│       └── resources/application.yml
└── notification-service/
    ├── pom.xml
    └── src/main/
        ├── java/com/rtotp/notificationservice/
        │   ├── NotificationServiceApplication.java
        │   ├── application/NotificationController.java
        │   └── domain/NotificationService.java
        └── resources/application.yml
```

## Build

```bash
mvn clean verify
```

## Run a Service

```bash
mvn -pl order-service spring-boot:run
```
