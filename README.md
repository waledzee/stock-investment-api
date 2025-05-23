
# 📈 Stock Investment API

A backend simulation of a stock trading platform inspired by Thndr's business model. This project is currently under development and focuses on building secure, scalable APIs to support stock browsing, simulated trading, and portfolio management.

## 🚀 Features (Planned & In Progress)

- ✅ **User Authentication** with Spring Security + JWT
- 📊 **Stock Listing** with basic details (symbol, price, sector)
- 💼 **User Portfolio** tracking purchased shares
- 💰 **Buy & Sell Simulation** with balance updates
- 🧾 **Transaction History** recording every operation
- 🧪 **Unit Testing** with JUnit
- 🐳 **Dockerized** for easy setup (coming soon)
- 🔄 **CI/CD pipeline** (planned)

## 🛠 Tech Stack

- **Java**
- **Spring Boot**
- **Spring Security (JWT)**
- **MySQL**
- **Docker**
- **Postman** (for API testing)
- **JUnit** (for testing)

## 📁 Database Models

- `User` – credentials and profile info
- `Stock` – available stocks with price
- `Portfolio` – stocks owned by each user
- `Transaction` – buy/sell logs with timestamps

## 📦 How to Run

1. Clone the repository
2. Create and configure a local MySQL database
3. Update your `application.properties` file
4. Run the app using your IDE or via:

```bash
mvn spring-boot:run
