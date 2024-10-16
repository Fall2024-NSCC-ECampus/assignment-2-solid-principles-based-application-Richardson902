# Courier Service Management System

This is a baseline implementation of a Courier Service Management System using SOLID design principles. The system handles various functionalities such as product management, order processing, returns, payment processing, and shipment handling.
This project is by no means functional. It is just a demonstration of how the system could potentially be designed.

## SOLID Principles

### Single Responsibility Principle (SRP)
Each class in the project has a single responsibility:
- `Product` handles product details.
- `Order` handles order details and calculations.
- `Invoice` handles invoice details.
- `FreightHandler` handles freight details and processing invoices.
- `PaymentWindow` handles payment processing.
- `Review` handles product reviews.
- `OrderShipment` handles order shipment processing.
- `OrderManager` handles order and return processing.
- `Return` handles return details.

### Open/Closed Principle
Classes are open for extension but closed for modification. For example, you can extend the functionality of `Product` or `Order` by subclassing without modifying the existing code.

### Liskov Substitution Principle
The design does not violate LSP. Subclasses, if any, can replace their base classes without altering the correctness of the program.

### Interface Segregation Principle
The code does not use interfaces, so ISP is not directly applicable. However, the responsibilities are well-separated, which aligns with the spirit of ISP.