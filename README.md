# Automation Testing Project - EYOUTH

## 📌 Project Overview
This project is an automation testing framework developed for the EYOUTH website using:

- Selenium WebDriver
- TestNG
- Java
- Page Object Model (POM)

The goal is to automate key user functionalities and validate expected behaviors with proper assertions.

---

## 🚀 Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Allure Reports (Optional)

---

## 🧪 Test Scenarios

### ✅ Test Case #1: Search with a valid keyword
- Enter keyword: "كيف تنضم إلى البنك"
- Click search
- Assert page title contains the keyword

---

### ✅ Test Case #2: Open course details
- Navigate to "جميع الدورات"
- Select a course
- Assert course details page opens
- Verify "حول الدورة التدريبية" section is displayed

---

### ✅ Test Case #3: Open registration page
- Click "انضم لنا"
- Assert URL contains `/signup`

---

### ❌ Test Case #4: Register with empty username
- Leave username empty
- Fill other fields
- Assert validation message: "اسم المستخدم مطلوب"

---

### ❌ Test Case #5: Login with invalid credentials
- Enter invalid username & password
- Assert error message is displayed

---

### ❌ Test Case #6: Login with empty fields
- Leave fields empty
- Assert validation messages appear

---

### 🔄 Test Case #7: End-to-End Scenario
- Login with valid credentials
- Navigate to courses
- Subscribe to a course
- Assert course is added successfully

---

### 🌐 Test Case #8: Verify Facebook link
- Click Facebook icon
- Assert URL contains `facebook.com`

---

### 🌐 Test Case #9: Verify LinkedIn link
- Click LinkedIn icon
- Assert URL contains `linkedin.com`

---

### 🌐 Test Case #10: Verify Instagram link
- Click Instagram icon
- Assert URL contains `instagram.com`

---

### 🎨 Test Case #11: Verify Course Card UI
- Verify course card contains:
  - Image
  - Title
  - Instructor name
  - Subscribe button

---

## 🏗️ Framework Design
- Page Object Model (POM) is used for maintainability
- Explicit waits are implemented
- No usage of Thread.sleep()
- Reusable methods and utilities are applied

---

## 📊 Allure Report (Bonus)
- Allure report is generated for test execution
- Includes:
  - Test steps
  - Results
  - Execution details

To generate report:
```bash
allure serve allure-results
