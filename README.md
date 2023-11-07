# Inheritance and Device Modeling in Java for assignment in the UNI

## Objective

The objective of this assignment is to reinforce your understanding of inheritance in Java by creating a base class and three derived classes to model different types of devices. You will also practice generating random instances of these devices, calculating total prices, and managing class hierarchies.

## Assignment Details

### Base Class - Device

- Includes the following attributes:
  - "type" (String) - Represents the type of the device (e.g., "Smartphone," "Laptop," "Tablet," etc.).
  - "price" (double) - Represents the price of the device in USD.
  - "weight" (double) - Represents the weight of the device in grams.

### First Derived Class - Smartphone
- Includes the following attributes:
  - "type" (String) - Represents the type of the device (e.g., "Smartphone," "Laptop," "Tablet," etc.).
  - "price" (double) - Represents the price of the device in USD.
  - "weight" (double) - Represents the weight of the device in grams.
  - "brand" (String) - Represents the brand of the phone ("Apple", "Samsung", "Xiaomi", "Huawei", "LG", "Microsoft", "Lenovo")
  - "model" (String) - Represents the model of the phone
  - "ram" (int) - Represents Random Access Memory in Gigobytes (2 - 16)
  - "ssd" (int) - Represents SSD in Gigobytes (2 - 128)
  - "cameraResolution" (int) - Represents cameraResolution in megapixels

### Second Derived Class - Tablet
- Includes the following attributes:
  - "type" (String) - Represents the type of the device (e.g., "Smartphone," "Laptop," "Tablet," etc.).
  - "price" (double) - Represents the price of the device in USD.
  - "weight" (double) - Represents the weight of the device in grams.
  - "brand" (String) - Represents the brand of the phone ("Apple", "Samsung", "Xiaomi", "Huawei", "LG", "Microsoft", "Lenovo")
  - "model" (String) - Represents the model of the phone
  - "has_pencil" (boolean) - Represents whether the Tablet has its own pencil

### Third Derived Class - TV
- Includes the following attributes:
  - "type" (String) - Represents the type of the device (e.g., "Smartphone," "Laptop," "Tablet," etc.).
  - "price" (double) - Represents the price of the device in USD.
  - "weight" (double) - Represents the weight of the device in grams.
  - "brand" (String) - Represents the brand of the phone ("Apple", "Samsung", "Xiaomi", "Huawei", "LG", "Microsoft", "Lenovo")
  - "model" (String) - Represents the model of the phone
  - "displayTechnology" (String) - Represents Display Technology ("LED", "Plasma", "OLED")
  - "screenSize" (String) - Represents the length of the dioganal of the TV
  - "refreshRate" (int) - Represents refresh rate in HZ

### Main Program

- Creates n instances of devices with random parameters and calculates the folloding information
  - The number of distinct device types created.
  - The total price of all devices.
  - The total weight of all devices.


## Grading Criteria
